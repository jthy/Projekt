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


	void abonniereFisch() throws XMPPException{
		// Create a pubsub manager using an existing Connection
	    PubSubManager mgr = new PubSubManager(connection);

	    // Get the node
	    LeafNode fisch = mgr.getNode("Fisch");

	    fisch.addItemEventListener(new ItemEventCoordinator());


		fisch.subscribe(jid);
	}
	void abonniereFleisch() throws XMPPException{
		// Create a pubsub manager using an existing Connection
	    PubSubManager mgr = new PubSubManager(connection);

	    // Get the node
	    LeafNode fleisch = mgr.getNode("Fleisch");

	    fleisch.addItemEventListener(new ItemEventCoordinator());


		fleisch.subscribe(jid);
	}
	void abonniereGemuese() throws XMPPException{
		// Create a pubsub manager using an existing Connection
	    PubSubManager mgr = new PubSubManager(connection);

	    // Get the node
	    LeafNode gemuese = mgr.getNode("Gemuese");

	    gemuese.addItemEventListener(new ItemEventCoordinator());


		gemuese.subscribe(jid);
	}


	public void deabonniereFisch() throws XMPPException {
		// Create a pubsub manager using an existing Connection
	    PubSubManager mgr = new PubSubManager(connection);

	    // Get the node
	    LeafNode fisch = mgr.getNode("Fisch");

	    fisch.addItemEventListener(new ItemEventCoordinator());


		fisch.unsubscribe(jid);

	}

	public void deabonniereFleisch() throws XMPPException {
		// Create a pubsub manager using an existing Connection
	    PubSubManager mgr = new PubSubManager(connection);

	    // Get the node
	    LeafNode fleisch = mgr.getNode("Fleisch");

	    fleisch.addItemEventListener(new ItemEventCoordinator());


		fleisch.unsubscribe(jid);

	}
	public void deabonniereGemuese() throws XMPPException {
		// Create a pubsub manager using an existing Connection
	    PubSubManager mgr = new PubSubManager(connection);

	    // Get the node
	    LeafNode gemuese = mgr.getNode("Gemuese");

	    gemuese.addItemEventListener(new ItemEventCoordinator());


		gemuese.unsubscribe(jid);

	}

	public Collection<? extends Item> leseFischNachrichten() throws XMPPException {
		// Create a pubsub manager using an existing Connection
	    PubSubManager mgr = new PubSubManager(connection);

	    // Get the node
	    LeafNode fisch = mgr.getNode("Fisch");

	    Collection<? extends Item> items = fisch.getItems();
		return items;

	}
	public Collection<? extends Item> leseFleischNachrichten() throws XMPPException {
		// Create a pubsub manager using an existing Connection
	    PubSubManager mgr = new PubSubManager(connection);

	    // Get the node
	    LeafNode fleisch = mgr.getNode("Fleisch");

	    Collection<? extends Item> items = fleisch.getItems();
		return items;

	}
	public Collection<? extends Item> leseGemueseNachrichten() throws XMPPException {
		// Create a pubsub manager using an existing Connection
	    PubSubManager mgr = new PubSubManager(connection);

	    // Get the node
	    LeafNode gemuese = mgr.getNode("Gemuese");

	    Collection<? extends Item> items = gemuese.getItems();
		return items;

	}

	public DiscoverItems leseNodeInformationen() throws XMPPException{
		ServiceDiscoveryManager discoManager = ServiceDiscoveryManager.getInstanceFor(connection);
		DiscoverItems items=null;
		items = discoManager.discoverItems("pubsub." + connection.getServiceName());
		return items;
	}


}