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

	public void createNode(){
		// Create a pubsub manager using an existing Connection
		PubSubManager mgr = new PubSubManager(connection);

		// Create the node
		try {
			 LeafNode leaf = mgr.createNode("testNode");
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public void deleteNode(){
		// Create a pubsub manager using an existing Connection
		PubSubManager mgr = new PubSubManager(connection);

		// Create the node
		try {
			mgr.deleteNode("testNode");
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public void publishWithoutPayload() throws XMPPException{
		// Create a pubsub manager using an existing Connection
		PubSubManager mgr = new PubSubManager(connection);

		// Get the node
		LeafNode node = mgr.getNode("testNode");

		// Publish an Item, let service set the id
		//node.send(new Item());

		// Publish an Item with the specified id
		node.send(new Item("TestX"));

		node.publish();
	}

	public void publishWithPayload() throws XMPPException{
		// Create a pubsub manager using an existing Connection
		PubSubManager mgr = new PubSubManager(connection);

		// Get the node
		LeafNode node = mgr.getNode("testNode");

		// Publish an Item with payload
		node.publish(new PayloadItem<SimplePayload>("Test1" + System.currentTimeMillis(), new SimplePayload("", "", "")));

	}

	public List<Subscription> getSubscribers() throws XMPPException {
	 // Create a pubsub manager using an existing Connection
	 PubSubManager mgr = new PubSubManager(connection);
     
	 // Get the node
	 LeafNode node = mgr.getNode("testNode");

	 return node.getSubscriptions();
	}
}
