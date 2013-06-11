package minirestwebservice;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import generated.Boerse;
import generated.Boerse.BoersenEintrag;
import generated.ObjectFactory;


@Path("/boerse")

public class BoersenService 
{

@GET
@Produces( "application/xml")

public Boerse getBoerse() throws JAXBException, FileNotFoundException
{
	ObjectFactory ob=new ObjectFactory();
	Boerse boe=ob.createBoerse();
	JAXBContext context = JAXBContext.newInstance(Boerse.class);
	Unmarshaller um = context.createUnmarshaller();
	boe = ( Boerse ) um.unmarshal(new FileReader("src/XML/Boerse.xml"));
	
	return boe;
	
}

@GET
@Path("/{BoerseneintragsID}")
@Produces( "application/xml")
public Boerse getEintrag(@PathParam("BoerseneintragsID")int i) throws JAXBException, FileNotFoundException
{
	ObjectFactory ob=new ObjectFactory();
	Boerse boe=ob.createBoerse();
	JAXBContext context = JAXBContext.newInstance(Boerse.class);
	Unmarshaller um = context.createUnmarshaller();
	boe = (Boerse) um.unmarshal(new FileReader("src/XML/Boerse.xml"));
	Boerse rt = ob.createBoerse();
	rt.getBoersenEintrag().add(boe.getBoersenEintrag().get(i-1));
	return rt;
}
@POST
@Produces("application/xml")
@Consumes("application/xml")
public Response erstelleEintrag(BoersenEintrag boersenEintrag)throws Exception
		{
		 JAXBContext jc = JAXBContext.newInstance(Boerse.class);
		    //unmarshaller zum lesen 
		 Unmarshaller um = jc.createUnmarshaller();
		    //marshaller zum schreiben
		 Marshaller marshaller =jc.createMarshaller();
		 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		Boerse boe = (Boerse) um.unmarshal(new FileInputStream("src/XML/Boerse.xml"));
		List<Boerse.BoersenEintrag> boerse = boe.getBoersenEintrag();
		boersenEintrag.setBoerseneintragsID(boerse.size()+1);
		boerse.add(boersenEintrag);
		
		marshaller.marshal(boe, new File("src/XML/Boerse.xml"));
		   
	    URI location = URI.create( "http://localhost:4433/boerse" + boersenEintrag.getBoerseneintragsID());
	    return Response.created(location).build();
		
	}


@DELETE
@Path("/{BoerseneintragsID}")
public Boerse eintragloeschen(@PathParam("/{BoerseneintragsID}") int BoerseneintragsID)throws JAXBException, FileNotFoundException{
	JAXBContext context = JAXBContext.newInstance("generated");
	Unmarshaller um = context.createUnmarshaller();
	
	Boerse eintraege = (Boerse) um.unmarshal(new FileReader("src/XML/Personenliste.xml"));
	
	//Boerse in Eintrag kopieren
	ObjectFactory of = new ObjectFactory();
	Boerse eintrag = of.createBoerse();
	
	// i-ten Eintrag aus Boerse löschen
	eintrag.getBoersenEintrag().addAll(eintraege.getBoersenEintrag());
	eintrag.getBoersenEintrag().remove(BoerseneintragsID);
	
	// Boerse "aktualisieren" und zurückgeben
	// Marshaller
	Marshaller m = context.createMarshaller();
	m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	m.marshal(eintrag, new File("src/Personenliste.xml"));

	return eintrag;
}

}