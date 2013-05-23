package minirestwebservice;


import generated.Boerse;
import generated.ObjectFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


@Path("/Boerse")

public class BoersenService 
{

@GET
@Produces( "application/xml")
//gibt alle Boerseneintr�ge aus
public Boerse getAll() throws JAXBException, FileNotFoundException
{
	ObjectFactory ob=new ObjectFactory();
	Boerse boe=ob.createBoerse();
	JAXBContext context = JAXBContext.newInstance(Boerse.class);
	Unmarshaller um = context.createUnmarshaller();
	boe = ( Boerse ) um.unmarshal(new FileReader("/Users/juliathyssen/git/Projekt/WBA_OrderHero/src/XML/Boerse.xml"));
	
	return boe;
	
}
//gibt Boerseneintrag nach ID aus
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