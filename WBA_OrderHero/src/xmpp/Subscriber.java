package xmpp;

import java.util.Collection;

import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smackx.ServiceDiscoveryManager;
import org.jivesoftware.smackx.packet.DiscoverItems;
import org.jivesoftware.smackx.pubsub.Item;
import org.jivesoftware.smackx.pubsub.LeafNode;
import org.jivesoftware.smackx.pubsub.PubSubManager;



/*
 *  jid= user@example.com/home
 *  bzw. bei uns: user1@localhost/resource
 */

public class Subscriber extends User{	



	Subscriber(String userName, String password) throws XMPPException
	{
	 login(userName,password);	 
	}


	void subscribe() throws XMPPException{
		// Create a pubsub manager using an existing Connection
	    PubSubManager mgr = new PubSubManager(connection);

	    // Get the node
	    LeafNode node = mgr.getNode("testNode");

	    node.addItemEventListener(new ItemEventCoordinator());


		node.subscribe(jid);
	}


	public void unsubscribe() throws XMPPException {
		// Create a pubsub manager using an existing Connection
	    PubSubManager mgr = new PubSubManager(connection);

	    // Get the node
	    LeafNode node = mgr.getNode("testNode");

	    node.addItemEventListener(new ItemEventCoordinator());


		node.unsubscribe(jid);

	}


	public Collection<? extends Item> getMessages() throws XMPPException {
		// Create a pubsub manager using an existing Connection
	    PubSubManager mgr = new PubSubManager(connection);

	    // Get the node
	    LeafNode node = mgr.getNode("testNode");

	    Collection<? extends Item> items = node.getItems();
		return items;

	}

	public DiscoverItems getNodeInformation() throws XMPPException{
		ServiceDiscoveryManager discoManager = ServiceDiscoveryManager.getInstanceFor(connection);
		DiscoverItems items=null;
		items = discoManager.discoverItems("pubsub." + connection.getServiceName());
		return items;
	}


}