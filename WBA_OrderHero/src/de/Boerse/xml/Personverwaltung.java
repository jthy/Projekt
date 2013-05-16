package de.Boerse.xml;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import de.Boerse.xml.Personenliste.Person;


public class Personverwaltung {

	static Scanner scanner = new Scanner(System.in);
	private static Scanner input;
	private static Scanner inputint;
	private static Scanner inputbigint;

	public static void main(String[] args) throws JAXBException, IOException{
		Boolean anzeige = true;
		int eingabe = 0;

		//xml_person in Datei speichern
		//TO DO: WENN alles laueft, dann src/Personenliste.xml
		File file = new File("src/XML/Personenliste.xml");

		//JAXB Objekt erstellen
		JAXBContext context = JAXBContext.newInstance(Personenliste.class);

		//Marshaller 
		Marshaller m = context.createMarshaller();

		//Unmarshaller
		Unmarshaller um = context.createUnmarshaller();

		Personenliste person = (Personenliste) um.unmarshal(file);

		//Menue
		while(anzeige){
			  System.out.println();
	          System.out.println("1. Personen ausgeben");
	          System.out.println("2. Betriebe ausgeben");
	          System.out.println("3. Lieferanten ausgeben");
	          System.out.println("4. Neue Person erstellen");
	          System.out.println("5. Person bearbeiten");
	          System.out.println("6. Person löschen");
	          System.out.println();
	          eingabe = scanner.nextInt();

	          //Personen ausgeben
	          if(eingabe == 1){
	        	  personenausgabe(person);
	          }
	          /*//Betriebe ausgeben
	          if(eingabe == 2){
	        	  gastronomausgabe(person);
	          }
	          //Lieferanten ausgeben
	          if(eingabe == 3){  
	          }*/
	          //Neue Person ersellen
	          if(eingabe == 4){ 
	        	  personerstellen(person,file,m);
	          }
	          
	       // Suche Person mit ID=person1 und aendere Personeninformationen
	          List<Person> p = person.getPerson();
	          for(int i = 0; i < p.size(); i++) {
	          	if ( p.get(i).getPersonID().equals("person1") ) {
	          		p.get(i).setTyp("Gastronom");
	          		p.get(i).setVorname("Sheree");
	          		p.get(i).setNachname("Saßmannshausen");
	          		p.get(i).setAlter(22);
	          	}
	          }
	          
	          /*//Person bearbeiten
	          if(eingabe == 5){
	        	  personbearbeiten(person,file,m);
	          }
	          //Person lšschen
	          if(eingabe == 6){ 
	        	  personlšschen(person,file,m);
	          }*/
	          /*else
	        	  System.out.println("Ungueltige Eingabe!");*/

		}
	}	
	          //Person.xml in Java ausgeben (1)
	public static void personenausgabe(Personenliste person){

       	  for(int i = 0; i<=person.getPerson().size() -1; i++){
       		  System.out.println("Person:");
       		  System.out.println("Personentyp:" + person.getPerson().get(i).getTyp());
       		  System.out.println("Vorname:"+ person.getPerson().get(i).getVorname());
       		  System.out.println("Nachname:"+ person.getPerson().get(i).getNachname());
       		  System.out.println("Alter:"+ person.getPerson().get(i).getAlter());
       		  System.out.println("Betrieb:");
       		  System.out.println("Betriebname:"+ person.getPerson().get(i).getBetrieb().getBetriebname());
       		  System.out.println("Straße:"+ person.getPerson().get(i).getBetrieb().getAdresse().getStraße());
       		  System.out.println("Hausnummer:"+ person.getPerson().get(i).getBetrieb().getAdresse().getHausnummer());
       		  System.out.println("PLZ:"+ person.getPerson().get(i).getBetrieb().getAdresse().getPLZ());
       	  }
       
	}	  
	/*//Nur Personen ausgeben, welche Gastronom sind (2)
       	 public static void gastronomausgabe(Personenliste person){
       	
          	  for(int i = 0; i<=person.getPerson().size() -1; i++){ 
          		 if(person.getPerson().get(i).getTyp() == "Gastronom"){
          		  System.out.println("Person:");
          		  System.out.println("Personentyp:" + person.getPerson().get(i).getTyp());
          		  System.out.println("Vorname:"+ person.getPerson().get(i).getVorname());
          		  System.out.println("Nachname:"+ person.getPerson().get(i).getNachname());
          		  System.out.println("Alter:"+ person.getPerson().get(i).getAlter());
          		  System.out.println("Betrieb:");
          		  System.out.println("Betrieb:"+ person.getPerson().get(i).getBetrieb().getBetriebname());
          		  System.out.println("Vorname:"+ person.getPerson().get(i).getBetrieb().getAdresse());
          		 }
          	  }
         
		
       	 }*/

	//neue Person erstellen

		public static void personerstellen(Personenliste person, File file, Marshaller m) throws IOException,JAXBException{
			Writer w = new FileWriter(file);

			Personenliste.Person neuePerson = new Personenliste.Person();
			System.out.println("\nBitte geben Sie nun die Daten der neuen Person ein:");

			System.out.println("\nGastronom oder Lieferant?");
			neuePerson.setTyp(getString());

			System.out.println("\nVorname:");
			neuePerson.setVorname(getString());

			System.out.println("\nNachname:");
			neuePerson.setNachname(getString());

			System.out.println("\nAlter:");
			neuePerson.setAlter(getInt());

			System.out.println("\nBitte geben Sie nun die Daten den zugehoerigen Betriebes ein:");
			System.out.println("\nBetriebname:");
			neuePerson.betrieb.setBetriebname(getString());

			System.out.println("\nAdresse des Betriebes:");
			System.out.println("\nStraße:");
			neuePerson.betrieb.adresse.setStraße(getString());
			System.out.println("\nHausnummer:");
			neuePerson.betrieb.adresse.setHausnummer(getBigInt());
			System.out.println("\nPLZ:");
			neuePerson.betrieb.adresse.setPLZ(getBigInt());	

			// Formatierung der XML-Datei
	        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	        //Kommentar hinzufuegen
	        person.getPerson().add(neuePerson);
	        m.marshal(person,w);
		}

		//MenŸ wieder aufrufen fŸr neue Eingaben
	      boolean anzeige= true;

		// Bugfixing (Scanner wartet ohne eigene Methode nicht auf Eingabe vom Nutzer!)
		 public static String getString() {
			 input = new Scanner(System.in);
			 return input.nextLine();
		  }
		 public static int getInt(){
			 inputint = new Scanner(System.in);
			 return inputint.nextInt();
		 }
		 public static BigInteger getBigInt(){
			 inputbigint = new Scanner(System.in);
			 return inputbigint.nextBigInteger();
		 }

		/* public static void personbearbeiten(Personenliste person,File file,Marshaller m) throws IOException,JAXBException{

				Writer w = new FileWriter(file);

				//Abfrage nach Person
				System.out.println("Welche Person soll bearbeitet werden?");
				String x = scanner.nextLine();
				
				
				
				//eingabe mit vorhandenen personen vergleichen ?!?!?!?!??!	
				
		 }
		 
		 public static void personlšschen(Personenliste person, File file, Marshaller m) throws IOException, JAXBException{
			 
		 }*/

}