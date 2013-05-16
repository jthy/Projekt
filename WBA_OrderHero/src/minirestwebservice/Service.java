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
@Path("/Boerse/{BoerseneintragsID}")
@Produces( "application/xml")
public Boerse getOne(@PathParam("BoerseneintragsID")int i) throws JAXBException, FileNotFoundException
{
	ObjectFactory ob=new ObjectFactory();
	Boerse boe=ob.createBoerse();
	JAXBContext context = JAXBContext.newInstance(Boerse.class);
	Unmarshaller um = context.createUnmarshaller();
	boe = (Boerse) um.unmarshal(new FileReader("/Users/juliathyssen/git/Projekt/WBA_OrderHero/src/XML/Boerse.xml"));
	Boerse rt = ob.createBoerse();
	rt.getBoersenEintrag().getBoerseneintragsID().add(boe.getBoersenEintrag().getBoerseneintragsID());
	//der kann nicht getBoerse vom typ boerse nehmen... hab das jetzt mit geteintrag ersetzt
	//rt.getBoerse().add(boe.getBoerse().get(i-1));
	return rt;

	}

}
