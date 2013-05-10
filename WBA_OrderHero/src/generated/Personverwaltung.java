package generated;

import generated.Person;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.Timestamp;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class Personverwaltung {
	
	static Scanner scanner = new Scanner(System.in);
	private static Scanner input;
	
	public static void main(String[] args) throws JAXBException, IOException{
		Boolean anzeige = true;
		int eingabe = 0;
		
		//xml_person in Datei speichern
		File file = new File("src/Personenliste.xml");
		
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
	          System.out.println("6. Person lšschen");
	          System.out.println();
	          eingabe = scanner.nextInt();
	          
	          //Personen ausgeben
	          if(eingabe == 1){
	        	  ausgabe(person);
	          }
	          //Betriebe ausgeben
	          if(eingabe == 2){  
	          }
	          //Lieferanten ausgeben
	          if(eingabe == 3){  
	          }
	          //Neue Person ersellen
	          if(eingabe == 4){  
	          }
	          //Person bearbeiten
	          if(eingabe == 5){  
	          }
	          //Person lšschen
	          if(eingabe == 6){  
	          }
	          
		}
	          //Person.xml in Java ausgeben (1)
		 public static void ausgabe(Personenliste p){
       	  for(int i = 0; i<=p.getPerson(). -1; i++){
       		  
       	  }
         
		}
		
		
	}
	
}
