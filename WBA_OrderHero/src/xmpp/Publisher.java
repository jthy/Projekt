package xmpp;

import java.util.List;

import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smackx.pubsub.Item;
import org.jivesoftware.smackx.pubsub.LeafNode;
import org.jivesoftware.smackx.pubsub.PayloadItem;
import org.jivesoftware.smackx.pubsub.PubSubManager;
import org.jivesoftware.smackx.pubsub.SimplePayload;
import org.jivesoftware.smackx.pubsub.Subscription;


public class Publisher extends User{

	public Publisher(String userName, String password) throws XMPPException
	{
		login(userName,password);	
	}
/*
	//Lebensmittel ist Collection Node 
public void CollectionLebensmittel() throws XMPPException{
	// Create a pubsub manager using an existing Connection
    PubSubManager mgr = new PubSubManager(connection);

    // Get the node
    LeafNode fleisch = mgr.getNode("Fleisch");
    LeafNode fisch = mgr.getNode("Fisch");
    LeafNode gemuese = mgr.getNode("Gemuese");
    
    Collection<? extends Item> lebensmittel = fleisch.getItems();
    Collection<? extends Item> lebensmittel = fisch.getItems();
    Collection<>

}*/
	public static void erstelleFleischNode(){
		// Create a pubsub manager using an existing Connection
				PubSubManager mgr = new PubSubManager(connection);
		// Create the node
				try {
					 LeafNode fleisch = mgr.createNode("Fleisch");
				} catch (XMPPException e) {
		// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	public static void erstelleFischNode(){
		// Create a pubsub manager using an existing Connection
		PubSubManager mgr = new PubSubManager(connection);

		// Create the node
		try {
			 LeafNode fisch = mgr.createNode("Fisch");
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void erstelleGemueseNode(){
		// Create a pubsub manager using an existing Connection
		PubSubManager mgr = new PubSubManager(connection);

		// Create the node
		try {
			 LeafNode gemuese = mgr.createNode("Gemuese");
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public static void loescheFleischNode(){
		// Create a pubsub manager using an existing Connection
		PubSubManager mgr = new PubSubManager(connection);

		// Create the node
		try {
			mgr.deleteNode("Fleisch");
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void loescheFischNode(){
		// Create a pubsub manager using an existing Connection
		PubSubManager mgr = new PubSubManager(connection);

		// Create the node
		try {
			mgr.deleteNode("Fisch");
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void loescheGemueseNode(){
		// Create a pubsub manager using an existing Connection
		PubSubManager mgr = new PubSubManager(connection);

		// Create the node
		try {
			mgr.deleteNode("Gemuese");
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void veroeffentlicheFleisch() throws XMPPException{
		// Create a pubsub manager using an existing Connection
		PubSubManager mgr = new PubSubManager(connection);

		// Get the node
		LeafNode node = mgr.getNode("Fleisch");

		// Publish an Item, let service set the id
		node.send(new Item());

		// Publish an Item with the specified id
		//node.send(new Item("TestX"));

		node.publish();
	}

	public static void veroeffentlicheFisch() throws XMPPException{
		// Create a pubsub manager using an existing Connection
		PubSubManager mgr = new PubSubManager(connection);

		// Get the node
		LeafNode node = mgr.getNode("Fleisch");

		// Publish an Item, let service set the id
		node.send(new Item());

		// Publish an Item with the specified id
		//node.send(new Item("TestX"));

		node.publish();
	}
	
	public static void veroeffentlicheGemuese() throws XMPPException{
		// Create a pubsub manager using an existing Connection
		PubSubManager mgr = new PubSubManager(connection);

		// Get the node
		LeafNode node = mgr.getNode("Gemuese");

		// Publish an Item, let service set the id
		node.send(new Item());

		// Publish an Item with the specified id
		//node.send(new Item("TestX"));

		node.publish();
	}
	public static void veroeffentlicheFleischmitPayload() throws XMPPException{
		// Create a pubsub manager using an existing Connection
		PubSubManager mgr = new PubSubManager(connection);

		// Get the node
		LeafNode node = mgr.getNode("Fleisch");

		// Publish an Item with payload
		node.publish(new PayloadItem<SimplePayload>("Fleisch1" + System.currentTimeMillis(), new SimplePayload("", "", "")));

	}
	public static void veroeffentlicheFischmitPayload() throws XMPPException{
		// Create a pubsub manager using an existing Connection
		PubSubManager mgr = new PubSubManager(connection);

		// Get the node
		LeafNode node = mgr.getNode("Fisch");

		// Publish an Item with payload
		node.publish(new PayloadItem<SimplePayload>("Fisch1" + System.currentTimeMillis(), new SimplePayload("", "", "")));

	}
	public static void veroeffentlicheGemuesemitPayload() throws XMPPException{
		// Create a pubsub manager using an existing Connection
		PubSubManager mgr = new PubSubManager(connection);

		// Get the node
		LeafNode node = mgr.getNode("Gemuese");

		// Publish an Item with payload
		node.publish(new PayloadItem<SimplePayload>("Gemuese1" + System.currentTimeMillis(), new SimplePayload("", "", "")));

	}


	public static List<Subscription> leseFleischAbonennten() throws XMPPException {
	 // Create a pubsub manager using an existing Connection
	 PubSubManager mgr = new PubSubManager(connection);
     
	 // Get the node
	 LeafNode node = mgr.getNode("Fleisch");

	 return node.getSubscriptions();
	}
	
	public static List<Subscription> leseFischAbonennten() throws XMPPException {
		 // Create a pubsub manager using an existing Connection
		 PubSubManager mgr = new PubSubManager(connection);
	     
		 // Get the node
		 LeafNode node = mgr.getNode("Fisch");

		 return node.getSubscriptions();
		}
	public static List<Subscription> leseGemueseAbonennten() throws XMPPException {
		 // Create a pubsub manager using an existing Connection
		 PubSubManager mgr = new PubSubManager(connection);
	     
		 // Get the node
		 LeafNode node = mgr.getNode("Gemuese");

		 return node.getSubscriptions();
		}
}
