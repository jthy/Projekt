package xmpp;


import org.jivesoftware.smackx.pubsub.Item;
import org.jivesoftware.smackx.pubsub.ItemPublishEvent;
import org.jivesoftware.smackx.pubsub.listener.ItemEventListener;

public class ItemEventCoordinator implements ItemEventListener<Item>{

	@Override
	public void handlePublishedItems(ItemPublishEvent<Item> items) {
		System.out.println("\nhandlePublishedItems");
		System.out.println("NodeID: " + items.getNodeId());
		System.out.println("Item count: " + items.getItems().size());
		for(Item item : items.getItems()){
			System.out.println("Item ID: " + item.getId());
		}
	}
}