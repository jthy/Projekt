package minirestwebservice;


import com.sun.jersey.api.client.*;

public class Client
{
   public static void main( String[] args )
   {
      String url = ( args.length > 0 ) ? args[0] : "http://localhost:4434";
    
      String urlPersonen;
     // String urlPerson;
     // String urlBetriebe;

      
      // Personen
      urlPersonen = url + "/kundenliste/";
      System.out.println( "URL der Kunden: " + urlPersonen );
      
      WebResource wrs = Client.create().resource( urlPersonen );
      
     
      System.out.println( "\nXML-Ausgabe:" );
      System.out.println( wrs.accept( "application/xml"  ).get( String.class ) );
      
   }
}