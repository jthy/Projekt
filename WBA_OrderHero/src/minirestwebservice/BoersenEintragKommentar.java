package minirestwebservice;

import generated.Boerse;
import generated.ObjectFactory;
import generated.Boerse.BoersenEintrag;

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

@Path("/boerse")
public class BoersenEintragKommentar {


@GET
@Produces( "application/xml")

public generated.BoersenEintrag leseKommentare() throws JAXBException, FileNotFoundException{
	ObjectFactory ob=new ObjectFactory();
	generated.BoersenEintrag ein = ob.createBoersenEintrag();
	JAXBContext context = JAXBContext.newInstance(BoersenEintrag.class);
	Unmarshaller um = context.createUnmarshaller();
	ein = (generated.BoersenEintrag) um.unmarshal(new FileReader("src/XML/Boerse.xml"));
	return ein;
}

@GET
@Path("/{KommentarID}")
@Produces( "application/xml")
public generated.BoersenEintrag leseKommentar(@PathParam("KommentarID")int i) throws JAXBException, FileNotFoundException{
	
	ObjectFactory ob= new ObjectFactory();
	generated.BoersenEintrag ein = ob.createBoersenEintrag();
	
	JAXBContext context = JAXBContext.newInstance(BoersenEintrag.class);
	Unmarshaller um = context.createUnmarshaller();
	ein = (generated.BoersenEintrag) um.unmarshal(new FileReader("src/XML/Boerse.xml"));
	generated.BoersenEintrag rt = ob.createBoersenEintrag();
	rt.getKommentare().add(ein.getKommentare().get(i-1));
	return rt;
}

	@POST
	@Produces("application/xml")
	@Consumes("application/xml")
	public Response erstelleKommentar(BoersenEintrag.Kommentare kommentar)throws Exception{

	JAXBContext jc = JAXBContext.newInstance(BoersenEintrag.class);
	//unmarshaller zum lesen 
	Unmarshaller um = jc.createUnmarshaller();
	//marshaller zum schreiben
	Marshaller marshaller =jc.createMarshaller();
	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	BoersenEintrag eintrag = (BoersenEintrag) um.unmarshal(new FileInputStream("src/XML/Boerse.xml"));
	List<Boerse.BoersenEintrag.Kommentare> kom = eintrag.getKommentare();
	kommentar.setKommentarID(kom.size()+1);
	kom.add(kommentar);

	marshaller.marshal(eintrag, new File("src/XML/Boerse.xml"));

	URI location = URI.create( "http://localhost:4433/boerse/kommentar" + kommentar.getKommentarID());
	return Response.created(location).build();
	}
	
	@DELETE
	@Path("/{KommentarID}")
	public generated.BoersenEintrag eintragloeschen(@PathParam("/{KommentarID}") int KommentarID)throws JAXBException, FileNotFoundException{
		JAXBContext context = JAXBContext.newInstance("generated");
		Unmarshaller um = context.createUnmarshaller();
		generated.BoersenEintrag eintrag = (generated.BoersenEintrag) um.unmarshal(new FileReader("src/XML/Boerse.xml"));
		
		//Boerse in Eintrag kopieren
		ObjectFactory ob=new ObjectFactory();
		generated.BoersenEintrag kommentar = ob.createBoersenEintrag();
		
		kommentar.getKommentare().addAll(eintrag.getKommentare());
		kommentar.getKommentare().remove(KommentarID);
		
		
		// Boerse "aktualisieren" und zurückgeben
		// Marshaller
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(kommentar, new File("src/XML/Boerse.xml"));

		return kommentar;
	}
}
