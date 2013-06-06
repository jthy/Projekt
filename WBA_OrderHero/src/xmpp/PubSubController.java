package xmpp;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smackx.packet.DiscoverItems;
import org.jivesoftware.smackx.pubsub.AccessModel;
import org.jivesoftware.smackx.pubsub.ConfigureForm;
import org.jivesoftware.smackx.pubsub.FormType;
import org.jivesoftware.smackx.pubsub.LeafNode;
import org.jivesoftware.smackx.pubsub.PayloadItem;
import org.jivesoftware.smackx.pubsub.PubSubManager;
import org.jivesoftware.smackx.pubsub.PublishModel;
import org.jivesoftware.smackx.pubsub.SimplePayload;

public class PubSubController {

	private XMPPConnect verbindung;
	// Create a pubsub manager using an existing Connection
    private PubSubManager mgr;
    
    public static void main (String[] args){
    	new PubSubController();
    }
    
    public PubSubController(){
    	// Create a Connection
    	verbindung=new XMPPConnect();
    	// Create a pubsub manager using an existing Connection
        mgr = new PubSubManager(verbindung.conn);
    	
        nodeErstellen("testNode");
    	nodeAbonnieren(verbindung.conn.getUser(), "testNode");
    	nodeVeroeffentlichen("testNode","<test>TESTIIII</test>");
    	nodesAuslesen();
    }

    // Create the node
	public void nodeErstellen( String nodeName ){

/*		try {
			mgr.deleteNode("testNode");
		} catch (XMPPException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}*/


		ConfigureForm form = new ConfigureForm(FormType.submit);

	    form.setAccessModel(AccessModel.open);
	    form.setDeliverPayloads(true);
	    form.setNotifyRetract(true);
	    form.setPersistentItems(true);
	    form.setPublishModel(PublishModel.open);
	    try {
			mgr.getNode(nodeName);
			System.out.println("Node existiert");
		} catch (XMPPException e1) {
			System.out.println("Node existiert nicht");

		    try {
				LeafNode leaf = (LeafNode) mgr.createNode(nodeName, form);
				System.out.println("Node angelegt");

			} catch (XMPPException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void nodeVeroeffentlichen(String nodeName, String xml){

	    // Get the node
	    LeafNode node = null;

	    try {
			node = mgr.getNode(nodeName);
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	    node.publish(
	    		new PayloadItem<SimplePayload>(null,new SimplePayload("", "" ,xml)));

	    try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public void nodeAbonnieren(String myJid, String nodeName){
		// Get the node
	      LeafNode node = null;
		try {
			node = mgr.getNode(nodeName);
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    node.addItemEventListener(new ItemEventCoordinator());
		try {
			node.subscribe(myJid);
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<String> nodesAuslesen(){
		List<String> nodes=new ArrayList<String>();

		try {
			DiscoverItems item=this.mgr.discoverNodes(null);

			Iterator<DiscoverItems.Item> items = item.getItems();

			while( items.hasNext()){
				nodes.add(items.next().getNode());
			}

		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nodes;
	}

}