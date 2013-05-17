package minirestwebservice;


import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import de.Boerse.xml.Boerse;
import de.Boerse.xml.ObjectFactory;

@Path("/Boerse")

public class Service 
{

@GET
@Produces( "application/xml")

public Boerse getAll() throws JAXBException, FileNotFoundException
{
	ObjectFactory ob=new ObjectFactory();
	Boerse boe=ob.createBoerse();
	JAXBContext context = JAXBContext.newInstance(Boerse.class);
	Unmarshaller um = context.createUnmarshaller();
	boe = ( Boerse ) um.unmarshal(new FileReader("/Users/juliathyssen/git/Projekt/WBA_OrderHero/src/XML/Boerse.xml"));
	
	return boe;
	
}

@GET
@Path("/BoersenEintrag/{BoerseneintragsID}")
@Produces( "application/xml")
public Boerse getOne(@PathParam("BoerseneintragsID")int i) throws JAXBException, FileNotFoundException
{
	ObjectFactory ob=new ObjectFactory();
	Boerse boe=ob.createBoerse();
	JAXBContext context = JAXBContext.newInstance(Boerse.class);
	Unmarshaller um = context.createUnmarshaller();
	boe = (Boerse) um.unmarshal(new FileReader("/Users/juliathyssen/git/Projekt/WBA_OrderHero/src/XML/Boerse.xml"));
	Boerse rt = ob.createBoerse();
	rt.getBoersenEintrag().add(boe.getBoersenEintrag().get(i-1));
	return rt;

	}

}
