//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 01:49:38 PM MESZ 
//


package generated;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

 /**
  * Create an instance of {@link Betriebliste.Betrieb.Adresse }
  * 
  */
 public Betriebliste.Betrieb.Adresse createBetrieblisteBetriebAdresse() {
     return new Betriebliste.Betrieb.Adresse();
 }

 /**
  * Create an instance of {@link Betriebliste }
  * 
  */
 public Betriebliste createBetriebliste() {
     return new Betriebliste();
 }

 /**
  * Create an instance of {@link Betriebliste.Betrieb }
  * 
  */
 public Betriebliste.Betrieb createBetrieblisteBetrieb() {
     return new Betriebliste.Betrieb();
 }

 /**
<<<<<<< HEAD
  * Create an instance of {@link Personenliste }
=======
  * Create an instance of {@link Bestand.Produkte }
>>>>>>> branch 'master' of https://github.com/jthy/Projekt.git
  * 
  */

 public Personenliste createPersonenliste() {
     return new Personenliste();}

 public Bestand.Produkte createBestandProdukte() {
     return new Bestand.Produkte();
 }

 /**
<<<<<<< HEAD
  * Create an instance of {@link Betrieb }
=======
  * Create an instance of {@link Bestand }
>>>>>>> branch 'master' of https://github.com/jthy/Projekt.git
  * 
  */

 public Betrieb createBetrieb() {
     return new Betrieb();
 }

 public Boerse createBoerse(){
 	return new Boerse();
 	
 }
 /**
  * Create an instance of {@link Personenliste.Person }
  * 
  */
 public Personenliste.Person createPersonenlistePerson() {
     return new Personenliste.Person();
 }

 /**
  * Create an instance of {@link Betrieb.Adresse }
  * 
  */
 public Betrieb.Adresse createBetriebAdresse() {
     return new Betrieb.Adresse(); }

 public Bestand createBestand() {
     return new Bestand();
 }

}
