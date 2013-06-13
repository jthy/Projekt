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

			 System.out.println("Welche Art Lebensmittel?");
			 System.out.println("Fisch");
			 System.out.println("Fleisch");
			 System.out.println("Gemuese");

			String input1 = "";
			while(!input1.equals("Logout"))
			{
			 if(input1.equals("Fisch")){
				 System.out.println("Optionen:");
					System.out.println("	Node erstellen");
					System.out.println("	Node löschen");
					System.out.println("	Publish ohne Payload");
					System.out.println("	Publish mit Payload");
					System.out.println("	Abonnenten");
				 String input2= "";
				 if(input2.equals("Node erstellen")){
					 publisher.erstelleFischNode();
					 System.out.println("\"Fisch\"-Node wurde erstellt");
				 }
				 else if(input2.equals("Node löschen")) {
					 publisher.loescheFischNode();
					 System.out.println("\"Fisch\"-Node wurde gelöscht");
				 }
				 else if(input2.equals("Publish ohne Payload")) {
					 publisher.veroeffentlicheFisch();
					 System.out.println("\"Fisch\"-Node enthält eine neue Nachricht.");
				 }
				 else if(input2.equals("Publish mit Payload")){
					 publisher.veroeffentlicheFischmitPayload();
					 System.out.println("\"Fisch\"-Node enthält eine neue Nachricht mit Payload.");
				 }
				 else if(input2.equals("Abonnenten")){
					 List<Subscription> subscriptions = publisher.leseFischAbonennten();
					 for(Subscription each:subscriptions)
						 System.out.println(each.getJid()+ " "+each.getElementName());
				 }
			 }
			 else if(input1.equals("Fleisch")){
				 System.out.println("Optionen:");
					System.out.println("	Node erstellen");
					System.out.println("	Node löschen");
					System.out.println("	Publish ohne Payload");
					System.out.println("	Publish mit Payload");
					System.out.println("	Abonnenten");
				 String input3= "";
				 if(input3.equals("Node erstellen")){
					 publisher.erstelleFleischNode();
					 System.out.println("\"Fleisch\"-Node wurde erstellt");
				 }
				 else if(input3.equals("Node löschen")) {
					 publisher.loescheFleischNode();
					 System.out.println("\"Fleisch\"-Node wurde gelöscht");
				 }
				 else if(input3.equals("Publish ohne Payload")) {
					 publisher.veroeffentlicheFleisch();
					 System.out.println("\"Fleisch\"-Node enthält eine neue Nachricht.");
				 }
				 else if(input3.equals("Publish mit Payload")){
					 publisher.veroeffentlicheFleischmitPayload();
					 System.out.println("\"Fisch\"-Node enthält eine neue Nachricht mit Payload.");
				 }
				 else if(input3.equals("Abonnenten")){
					 List<Subscription> subscriptions = publisher.leseFleischAbonennten();
					 for(Subscription each:subscriptions)
						 System.out.println(each.getJid()+ " "+each.getElementName());
				 }
			 }
			 else if(input1.equals("Gemuese")){
				 System.out.println("Optionen:");
					System.out.println("	Node erstellen");
					System.out.println("	Node löschen");
					System.out.println("	Publish ohne Payload");
					System.out.println("	Publish mit Payload");
					System.out.println("	Abonnenten");
				 String input4= "";
				 if(input4.equals("Node erstellen")){
					 publisher.erstelleGemueseNode();
					 System.out.println("\"Gemuese\"-Node wurde erstellt");
				 }
				 else if(input4.equals("Node löschen")) {
					 publisher.loescheGemueseNode();
					 System.out.println("\"Gemuese\"-Node wurde gelöscht");
				 }
				 else if(input4.equals("Publish ohne Payload")) {
					 publisher.veroeffentlicheGemuese();
					 System.out.println("\"Gemuese\"-Node enthält eine neue Nachricht.");
				 }
				 else if(input4.equals("Publish mit Payload")){
					 publisher.veroeffentlicheGemuesemitPayload();
					 System.out.println("\"Gemuese\"-Node enthält eine neue Nachricht mit Payload.");
				 }
				 else if(input4.equals("Abonnenten")){
					 List<Subscription> subscriptions = publisher.leseGemueseAbonennten();
					 for(Subscription each:subscriptions)
						 System.out.println(each.getJid()+ " "+each.getElementName());
				 }
			 }
			input1 = scan.nextLine();
			}
			publisher.logout();
		}
		 
			catch (XMPPException e) {
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

				 System.out.println("Welche Art Lebensmittel?");
				 System.out.println("Fisch");
				 System.out.println("Fleisch");
				 System.out.println("Gemuese");

				String input = "";
				while(!input.equals("Logout")){
					
					if(input.equals("Fisch")){
					
					System.out.println("Optionen:");
					System.out.println("	Node abonnieren");
					System.out.println("	Node deabonnieren");
					System.out.println("	Nachrichten abrufen");
					System.out.println("	Service Discovery");

					String input1 = "";
					 if(input1.equals("Node abonnieren"))
					 {
					  subscriber.abonniereFisch();
					  System.out.println("Fisch-Node wurde abonniert.");
					 }
					 else if(input1.equals("Node deabonnieren")) 
					 {
					  subscriber.deabonniereFisch();
					  System.out.println("Fisch-Node wurde deabonniert.");
					 }
					 else if(input1.equals("Nachrichten abrufen")) 
					 {
					  System.out.println("Vorhandene Nachrichten:" + subscriber.leseFischNachrichten().size());
					  for(Item each:subscriber.leseFischNachrichten())
					  {
					   System.out.println("		"+each.getElementName());
					  }
					 }
					 else if(input.equals("Service Discovery")) 
					 {
					  DiscoverItems items = subscriber.leseNodeInformationen();
					  Iterator<org.jivesoftware.smackx.packet.DiscoverItems.Item> item = items.getItems();
					  while(item.hasNext())
					  {
					   org.jivesoftware.smackx.packet.DiscoverItems.Item currItem = item.next();	  
					   System.out.println(currItem.getEntityID()+" "+currItem.getName());
					  }
					  System.out.println("Service Discovery beendet.");
					 }
					 else if(input.equals("Fleisch")){
							
							System.out.println("Optionen:");
							System.out.println("	Node abonnieren");
							System.out.println("	Node deabonnieren");
							System.out.println("	Nachrichten abrufen");
							System.out.println("	Service Discovery");

							String input2 = "";
							 if(input2.equals("Node abonnieren"))
							 {
							  subscriber.abonniereFleisch();
							  System.out.println("Fleisch-Node wurde abonniert.");
							 }
							 else if(input2.equals("Node deabonnieren")) 
							 {
							  subscriber.deabonniereFleisch();
							  System.out.println("Fleisch-Node wurde deabonniert.");
							 }
							 else if(input2.equals("Nachrichten abrufen")) 
							 {
							  System.out.println("Vorhandene Nachrichten:" + subscriber.leseFleischNachrichten().size());
							  for(Item each:subscriber.leseFleischNachrichten())
							  {
							   System.out.println("		"+each.getElementName());
							  }
							 }
							 else if(input2.equals("Service Discovery")) 
							 {
							  DiscoverItems items = subscriber.leseNodeInformationen();
							  Iterator<org.jivesoftware.smackx.packet.DiscoverItems.Item> item = items.getItems();
							  while(item.hasNext())
							  {
							   org.jivesoftware.smackx.packet.DiscoverItems.Item currItem = item.next();	  
							   System.out.println(currItem.getEntityID()+" "+currItem.getName());
							  }
							  System.out.println("Service Discovery beendet.");
							 }
					 }
					 else if(input.equals("Gemuese")){
							
							System.out.println("Optionen:");
							System.out.println("	Node abonnieren");
							System.out.println("	Node deabonnieren");
							System.out.println("	Nachrichten abrufen");
							System.out.println("	Service Discovery");

							String input3 = "";
							 if(input3.equals("Node abonnieren"))
							 {
							  subscriber.abonniereGemuese();
							  System.out.println("Gemuese-Node wurde abonniert.");
							 }
							 else if(input3.equals("Node deabonnieren")) 
							 {
							  subscriber.deabonniereGemuese();
							  System.out.println("Gemuese-Node wurde deabonniert.");
							 }
							 else if(input3.equals("Nachrichten abrufen")) 
							 {
							  System.out.println("Vorhandene Nachrichten:" + subscriber.leseGemueseNachrichten().size());
							  for(Item each:subscriber.leseGemueseNachrichten())
							  {
							   System.out.println("		"+each.getElementName());
							  }
							 }
							 else if(input3.equals("Service Discovery")) 
							 {
							  DiscoverItems items = subscriber.leseNodeInformationen();
							  Iterator<org.jivesoftware.smackx.packet.DiscoverItems.Item> item = items.getItems();
							  while(item.hasNext())
							  {
							   org.jivesoftware.smackx.packet.DiscoverItems.Item currItem = item.next();	  
							   System.out.println(currItem.getEntityID()+" "+currItem.getName());
							  }
							  System.out.println("Service Discovery beendet.");
							 }
					 }
					}
					 input = scan.nextLine();
					}

					subscriber.logout();
				} 
				catch (XMPPException e) {
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
