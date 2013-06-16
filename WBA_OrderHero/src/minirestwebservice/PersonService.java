package minirestwebservice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
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
	public static Personenliste lesePersonen() throws JAXBException, FileNotFoundException{
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
	public static Personenliste lesePerson(@PathParam("Person_ID")int i) throws JAXBException, FileNotFoundException
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
	@Produces("application/xml")
	@Consumes("application/xml")
	public static Response erstellePerson(Person person)  throws Exception
		{
		 JAXBContext jc = JAXBContext.newInstance(Personenliste.class);
		    //unmarshaller zum lesen 
		 Unmarshaller um = jc.createUnmarshaller();
		    //marshaller zum schreiben
		 Marshaller marshaller =jc.createMarshaller();
		 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		Personenliste per = (Personenliste) um.unmarshal(new FileInputStream("src/XML/Personenliste.xml"));
		List<Person> personenliste = per.getPerson();
		person.setPersonID(personenliste.size()+1);
		personenliste.add(person);
		
		marshaller.marshal(per, new File("src/XML/Personenliste.xml"));
		   
	    URI location = URI.create( "http://localhost:4433/personenliste" + person.getPersonID());
	    return Response.created(location).build();
		}
	@PUT
	@Path("/{Person_ID}")
	@Produces("application/xml")
	@Consumes("application/xml")
	public static Response personaendern(@PathParam("Person_ID") int id, Person person)  throws Exception
		{
	    JAXBContext jc = JAXBContext.newInstance(Personenliste.class);
	    //unmarshaller zum lesen 
	    Unmarshaller um = jc.createUnmarshaller();
	    //marshaller zum schreiben
	    Marshaller marshaller =jc.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	    Personenliste personen = (Personenliste) um.unmarshal(new FileInputStream("src/XML/Personenliste.xml"));
	    
	    List<Person> personenliste = personen.getPerson();
	    //wenn id nicht vergeben ist wird betrieb erst erstellt!
	    if(id > personenliste.size()){
    		person.setPersonID(personenliste.size()+1);
    	 	personenliste.add( person );
    	}
	    else{
	    int i=0;;
	    for(Person pe : personenliste){
	    	if(pe.getPersonID() == (id)){
	    		personenliste.set(i, person);
	    	}
	    	i++;
	    	}
	    }

	    marshaller.marshal(personen, new File("src/XML/Personenliste.xml"));

	    URI location = URI.create( "http://localhost:4433/personenliste" + person.getPersonID() );
	    return Response.created(location).build(); 
		 
		}
	
	
	@DELETE 
	@Path("/{Person_ID}")
	   public static Personenliste personloeschen(@PathParam("Person_ID") int Person_ID)throws JAXBException, FileNotFoundException{
		JAXBContext context = JAXBContext.newInstance("generated");
		Unmarshaller um = context.createUnmarshaller();
		
		Personenliste personen = (Personenliste) um.unmarshal( new FileReader("src/XML/Personenliste.xml"));
	
		//Personenliste in Person kopieren
		ObjectFactory of = new ObjectFactory();
		Personenliste person = of.createPersonenliste();
		
		// i-ten Benutzer aus Personenliste l�schen
		person.getPerson().addAll(personen.getPerson());
		person.getPerson().remove(Person_ID);
		
		// Personenliste "aktualisieren" und zur�ckgeben
		// Marshaller
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(person, new File("src/Personenliste.xml"));

		return person;
	}
}


