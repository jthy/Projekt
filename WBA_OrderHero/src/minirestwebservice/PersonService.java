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

String pfad ="src/XML/Personenliste.xml"; 

	@GET
	@Produces( "application/xml")
	public Personenliste lesePersonen() throws JAXBException, FileNotFoundException{
		ObjectFactory ob=new ObjectFactory();
		Personenliste personen = ob.createPersonenliste();
		JAXBContext context = JAXBContext.newInstance(Personenliste.class);
		Unmarshaller um = context.createUnmarshaller();
		personen = ( Personenliste ) um.unmarshal(new FileReader(pfad));
		return personen;	
	}

	@GET
	@Path("/{Person_ID}")
	@Produces( "application/xml")
	public Personenliste lesePerson(@PathParam("Person_ID")int i) throws JAXBException, FileNotFoundException
	{
		ObjectFactory ob=new ObjectFactory();
		Personenliste person = ob.createPersonenliste();
		JAXBContext context = JAXBContext.newInstance(Personenliste.class);
		Unmarshaller um = context.createUnmarshaller();
		person = ( Personenliste ) um.unmarshal(new FileReader(pfad));
		
		Personenliste perli = ob.createPersonenliste();
		perli.getPerson().add(person.getPerson().get(i-1));
		return perli;
	}

	@POST
	@Produces("application/xml")
	@Consumes("application/xml")
	public Response erstellePerson(Person person)  throws Exception
		{
		 JAXBContext jc = JAXBContext.newInstance(Personenliste.class);
		    //unmarshaller zum lesen 
		 Unmarshaller um = jc.createUnmarshaller();
		    //marshaller zum schreiben
		 Marshaller marshaller =jc.createMarshaller();
		 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		Personenliste personen = (Personenliste) um.unmarshal(new FileInputStream(pfad));
		List<Person> personenliste = personen.getPerson();
		person.setPersonID(personenliste.size()+1);
		personenliste.add(person);
		
		marshaller.marshal(personen, new File(pfad));
		   
	    URI location = URI.create( "http://localhost:4433/personenliste" + person.getPersonID());
	    return Response.created(location).build();
		}
	
	@PUT
	@Path("/{Person_ID}")
	@Produces("application/xml")
	@Consumes("application/xml")
	public Response personaendern(@PathParam("Person_ID") int id, Person person)  throws Exception
		{
	    JAXBContext jc = JAXBContext.newInstance(Personenliste.class);
	    //unmarshaller zum lesen 
	    Unmarshaller um = jc.createUnmarshaller();
	    //marshaller zum schreiben
	    Marshaller marshaller =jc.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	    Personenliste personen = (Personenliste) um.unmarshal(new FileInputStream(pfad));
	    
	    List<Person> personenliste = personen.getPerson();
	    //wenn id nicht vergeben ist wird person erst erstellt!
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

	    marshaller.marshal(personen, new File(pfad));

	    URI location = URI.create( "http://localhost:4433/personenliste" + person.getPersonID() );
	    return Response.created(location).build(); 
		 
		}
	
	
	@DELETE 
	@Path("/{Person_ID}")
	   public Personenliste personloeschen(@PathParam("Person_ID") int Person_ID)throws JAXBException, FileNotFoundException{
		JAXBContext context = JAXBContext.newInstance("generated");
		Unmarshaller um = context.createUnmarshaller();
		
		Personenliste personen = (Personenliste) um.unmarshal( new FileReader(pfad));
	
		//Personenliste in Person kopieren
		ObjectFactory of = new ObjectFactory();
		Personenliste person = of.createPersonenliste();
		
		// i-ten Benutzer aus Personenliste loeschen
		person.getPerson().addAll(personen.getPerson());
		person.getPerson().remove(Person_ID);
		
		// Personenliste "aktualisieren" und zurueckgeben
		// Marshaller
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(person, new File(pfad));

		return person;
	}
}


