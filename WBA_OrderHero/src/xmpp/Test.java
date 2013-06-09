package xmpp;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.jivesoftware.smack.Connection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smackx.packet.DiscoverItems;
import org.jivesoftware.smackx.pubsub.Item;
import org.jivesoftware.smackx.pubsub.Subscription;


public class Test {

	    private static Scanner scan;

		private static void Menue()
		{
		 System.out.println("Als Publisher oder Subscriber einloggen?");
		 scan = new Scanner(System.in);
		 String input = "";

		 while(!input.equals("Quit"))
		 {	  
		  if(input.equals("Publisher"))
		   LoginAsPublisher();

		  else if(input.equals("Subscriber")) 
		   LoginAsSubscriber();

		  input = scan.nextLine();
		 }
	     
		}



		private static void LoginAsPublisher() {
		 Publisher publisher = null;
		 try {
			publisher = new Publisher("Publisher","test");
			System.out.println("Willkommen "+ publisher.getRealName());

			System.out.println("Optionen:");
			System.out.println("	Node erstellen");
			System.out.println("	Node löschen");
			System.out.println("	Publish ohne Payload");
			System.out.println("	Publish mit Payload");
			System.out.println("	Abonnenten");

			String input = "";
			while(!input.equals("Logout"))
			{
			 if(input.equals("Node erstellen"))
			 {
			  publisher.createNode();
			  System.out.println("\"testNode\" wurde erstellt");
			 }
			 else if(input.equals("Node löschen")) 
			 {
			  publisher.deleteNode();
			  System.out.println("\"testNode\" wurde gelöscht");
			 }
			 else if(input.equals("Publish ohne Payload")) 
			 {
			  publisher.publishWithoutPayload();
			  System.out.println("\"testNode\" enthält eine neue Nachricht.");
			 }
			 else if(input.equals("Publish mit Payload"))
			 {
			  publisher.publishWithPayload();
			  System.out.println("\"testNode\" enthält eine neue Nachricht mit Payload.");
			 }
			 else if(input.equals("Abonnenten"))
			 {
			  List<Subscription> subscriptions = publisher.getSubscribers();
			  for(Subscription each:subscriptions)
			   System.out.println(each.getJid()+ " "+each.getElementName());
			 }
			 input = scan.nextLine();
			}

			publisher.logout();
		} catch (XMPPException e) {
			System.out.println("Ein Fehler ist aufgetreten. Die Session wurde beendet.");
			publisher.logout();
			e.printStackTrace();
		}
		 System.out.println("Als Publisher oder Subscriber einloggen?"); 
		}


		private static void LoginAsSubscriber() {
			Subscriber subscriber = null; 
			try {
					subscriber = new Subscriber("Subscriber","test");
					System.out.println("Willkommen "+ subscriber.getRealName());

					System.out.println("Optionen:");
					System.out.println("	Node abonnieren");
					System.out.println("	Node deabonnieren");
					System.out.println("	Nachrichten abrufen");
					System.out.println("	Service Discovery");

					String input = "";
					while(!input.equals("Logout"))
					{
					 if(input.equals("Node abonnieren"))
					 {
					  subscriber.subscribe();
					  System.out.println("Node wurde abonniert.");
					 }
					 else if(input.equals("Node deabonnieren")) 
					 {
					  subscriber.unsubscribe();
					  System.out.println("Node wurde deabonniert.");
					 }
					 else if(input.equals("Nachrichten abrufen")) 
					 {
					  System.out.println("Vorhandene Nachrichten:" + subscriber.getMessages().size());
					  for(Item each:subscriber.getMessages())
					  {
					   System.out.println("		"+each.getElementName());
					  }
					 }
					 else if(input.equals("Service Discovery")) 
					 {
					  DiscoverItems items = subscriber.getNodeInformation();
					  Iterator<org.jivesoftware.smackx.packet.DiscoverItems.Item> item = items.getItems();
					  while(item.hasNext())
					  {
					   org.jivesoftware.smackx.packet.DiscoverItems.Item currItem = item.next();	  
					   System.out.println(currItem.getEntityID()+" "+currItem.getName());
					  }
					  System.out.println("Service Discovery beendet.");
					 }
					 input = scan.nextLine();
					}

					subscriber.logout();
				} catch (XMPPException e) {
					System.out.println("Ein Fehler ist aufgetreten. Die Session wurde beendet.");
					subscriber.logout();
					e.printStackTrace();

				}
		 System.out.println("Als Publisher oder Subscriber einloggen?");
		}


		public static void main(String[] args)
		{
		 Connection.DEBUG_ENABLED = true;	
		 Menue();
		}
}
