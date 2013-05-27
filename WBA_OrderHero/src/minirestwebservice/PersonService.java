package minirestwebservice;

	import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.List;

	import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import generated.Personenliste;
import generated.Personenliste.Person;
import generated.ObjectFactory;

	@Path("/kundenliste")
	public class PersonService {


	@GET
	@Produces( "application/xml")
	public Personenliste getPersonen() throws JAXBException, FileNotFoundException{
		ObjectFactory ob=new ObjectFactory();
		Personenliste personen = ob.createPersonenliste();
		JAXBContext context = JAXBContext.newInstance(Personenliste.class);
		Unmarshaller um = context.createUnmarshaller();
		personen = ( Personenliste ) um.unmarshal(new FileReader("/Users/juliathyssen/git/Projekt/WBA_OrderHero/src/Personenliste.xml"));
		return personen;	
	}

	@GET
	@Path("/kundenliste/{Person_ID}")
	@Produces( "application/xml")
	public Personenliste getPerson(@PathParam("Person_ID")int i) throws JAXBException, FileNotFoundException
	{
		ObjectFactory ob=new ObjectFactory();
		Personenliste person = ob.createPersonenliste();
		JAXBContext context = JAXBContext.newInstance(Personenliste.class);
		Unmarshaller um = context.createUnmarshaller();
		person = ( Personenliste ) um.unmarshal(new FileReader("/Users/juliathyssen/git/Projekt/WBA_OrderHero/src/Personenliste.xml"));
		
		Personenliste rt = ob.createPersonenliste();
		rt.getPerson().add(person.getPerson().get(i-1));
		return rt;
	}

	@PUT
	@Path("/kundenliste/{Person_ID}")
	public Personenliste personerstellen(
			@PathParam("Person_ID") int Person_ID,
			@PathParam("Typ") String Typ,
			@PathParam("Vorname") String Vorname,
			@PathParam("Nachmane") String Nachname,
			@PathParam("Alter") int Alter,
			@PathParam("Betrieb") int Betriebs_ID)  throws JAXBException, FileNotFoundException
		{
		JAXBContext context = JAXBContext.newInstance(Person.class);
		
		Unmarshaller um = context.createUnmarshaller();
		Personenliste per = (Personenliste) um.unmarshal(new FileReader("/Users/juliathyssen/git/Projekt/WBA_OrderHero/src/Personenliste.xml"));
		List<Person> p = per.getPerson();
		
		if(Person_ID > p.size()){
		Person person=new Person();
		person.setPersonID(Person_ID);
		person.setVorname(Vorname);
		person.setNachname(Nachname);
		person.setTyp(Typ);
		person.setAlter(Alter);
		person.getBetrieb().setBetriebsID(Betriebs_ID);
		
		Personenliste n = getPerson(Person_ID);
		n.getPerson().add(person);
		
		Marshaller ma=context.createMarshaller();
		ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		ma.marshal(person, new FileOutputStream("/Users/juliathyssen/git/Projekt/WBA_OrderHero/src/Personenliste.xml"));
		return n;	
		}
		else return null;
		}
	
	@DELETE 
	@Path("/kundenliste/{Person_ID}")
	   public Personenliste personloeschen(@PathParam("Person_ID") int Person_ID)throws JAXBException, FileNotFoundException{
		Personenliste person = getPerson(Person_ID);
		person = null;
		return null;
	}
			
	
}


