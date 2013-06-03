package minirestwebservice;

import java.io.File;
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

	@Path("/personenliste")
	public class PersonService {


	@GET
	@Produces( "application/xml")
	public Personenliste getPersonen() throws JAXBException, FileNotFoundException{
		ObjectFactory ob=new ObjectFactory();
		Personenliste personen = ob.createPersonenliste();
		JAXBContext context = JAXBContext.newInstance(Personenliste.class);
		Unmarshaller um = context.createUnmarshaller();
		personen = ( Personenliste ) um.unmarshal(new FileReader("src/XML/Personenliste.xml"));
		return personen;	
	}

	@GET
	@Path("/{Person_ID}")
	@Produces( "application/xml")
	public Personenliste getPerson(@PathParam("Person_ID")int i) throws JAXBException, FileNotFoundException
	{
		ObjectFactory ob=new ObjectFactory();
		Personenliste person = ob.createPersonenliste();
		JAXBContext context = JAXBContext.newInstance(Personenliste.class);
		Unmarshaller um = context.createUnmarshaller();
		person = ( Personenliste ) um.unmarshal(new FileReader("src/XML/Personenliste.xml"));
		
		Personenliste rt = ob.createPersonenliste();
		rt.getPerson().add(person.getPerson().get(i-1));
		return rt;
	}

	@POST
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
		Personenliste per = (Personenliste) um.unmarshal(new FileReader("src/XML/Personenliste.xml"));
		List<Person> p = per.getPerson();
		
		Person person=new Person();
		//Damit ID's chronologisch aufeinander aufbauen
		person.setPersonID(p.size()+1);
		person.setVorname(Vorname);
		person.setNachname(Nachname);
		person.setTyp(Typ);
		person.setAlter(Alter);
		person.getBetrieb().setBetriebsID(Betriebs_ID);
		
		Personenliste n = getPerson(Person_ID);
		n.getPerson().add(person);
		
		Marshaller ma=context.createMarshaller();
		ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		ma.marshal(person, new FileOutputStream("src/Personenliste.xml"));
		return n;	
		}
	
	@PUT
	@Path("/{Person_ID}")
	public Personenliste personaendern(
			@PathParam("Person_ID") int Person_ID,
			@PathParam("Typ") String Typ,
			@PathParam("Vorname") String Vorname,
			@PathParam("Nachmane") String Nachname,
			@PathParam("Alter") int Alter,
			@PathParam("Betrieb") int Betriebs_ID)  throws JAXBException, FileNotFoundException
		{
		
		JAXBContext context = JAXBContext.newInstance(Person.class);
		
		Unmarshaller um = context.createUnmarshaller();
		Personenliste per = (Personenliste) um.unmarshal(new FileReader("src/XML/Personenliste.xml"));
		List<Person> p = per.getPerson();
		if(Person_ID <= p.size()){
			Person person=new Person();
			//PersonID darf nicht geaendert werden
			person.setVorname(Vorname);
			person.setNachname(Nachname);
			person.setTyp(Typ);
			person.setAlter(Alter);
			person.getBetrieb().setBetriebsID(Betriebs_ID);

			Personenliste n = getPerson(Person_ID);
			n.getPerson().add(person);
			
			Marshaller ma=context.createMarshaller();
			ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ma.marshal(person, new FileOutputStream("src/XML/Personenliste.xml"));
			return n;
		}
		else return null;
		}
	
	
	@DELETE 
	@Path("/{Person_ID}")
	   public Personenliste personloeschen(@PathParam("Person_ID") int Person_ID)throws JAXBException, FileNotFoundException{
		JAXBContext context = JAXBContext.newInstance("generated");
		Unmarshaller um = context.createUnmarshaller();
		
		Personenliste personen = (Personenliste) um.unmarshal( new FileReader("src/XML/Personenliste.xml"));
	
		//Personenliste in Person kopieren
		ObjectFactory of = new ObjectFactory();
		Personenliste person = of.createPersonenliste();
		
		// i-ten Benutzer aus Personenliste lšschen
		person.getPerson().addAll(personen.getPerson());
		person.getPerson().remove(Person_ID);
		
		// Personenliste "aktualisieren" und zurŸckgeben
		// Marshaller
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(person, new File("src/Personenliste.xml"));

		return person;
	}
}


