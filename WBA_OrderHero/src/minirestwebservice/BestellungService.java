package minirestwebservice;


	import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URI;
import java.util.List;

	import javax.ws.rs.*;
import javax.ws.rs.core.Response;
	//import javax.ws.rs.core.MediaType;
	import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import generated.Bestellung;
import generated.Bestellungsliste;
import generated.ObjectFactory;

	@Path("/bestellungen")
	public class BestellungService {
	
	String pfad ="src/XML/Bestellungsliste.xml ";
	
	
	@GET
	@Produces("application/xml")

	public Bestellungsliste leseBestellungen() throws JAXBException, FileNotFoundException
	{
		ObjectFactory ob=new ObjectFactory();
		Bestellungsliste bestellungen = ob.createBestellungsliste();
		JAXBContext context = JAXBContext.newInstance(Bestellungsliste.class);
		Unmarshaller um = context.createUnmarshaller();
		bestellungen = ( Bestellungsliste ) um.unmarshal(new FileReader(pfad));
		return bestellungen;	
	}

	@GET
	@Path("/{Bestellungs_ID}")
	@Produces("application/xml")
	public Bestellungsliste leseBestellung(@PathParam("Bestellungs_ID")int i) throws JAXBException, FileNotFoundException
	{
		ObjectFactory ob=new ObjectFactory();
		Bestellungsliste bestellungen = ob.createBestellungsliste();
		JAXBContext context = JAXBContext.newInstance(Bestellungsliste.class);
		Unmarshaller um = context.createUnmarshaller();
		bestellungen = ( Bestellungsliste ) um.unmarshal(new FileReader(pfad));
		Bestellungsliste bl = ob.createBestellungsliste();
		bl.getBestellung().add(bestellungen.getBestellung().get(i-1));
		return bl;
	}

	@POST 
	@Produces("application/xml")
	@Consumes("application/xml")
	public Response erstelleBestellung ( Bestellung bestellung ) throws Exception
	{

		    JAXBContext jc = JAXBContext.newInstance(Bestellungsliste.class);
		    //unmarshaller zum lesen 
		    Unmarshaller um = jc.createUnmarshaller();
		    //marshaller zum schreiben
		    Marshaller marshaller =jc.createMarshaller();
		    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		    Bestellungsliste bestellungen = (Bestellungsliste) um.unmarshal(new FileInputStream(pfad));

		    List<Bestellung> bestellungsliste = bestellungen.getBestellung();

			bestellung.setBestellungsID(bestellungsliste.size()+1);
			
		 	bestellungsliste.add( bestellung );

		    marshaller.marshal(bestellungen, new File(pfad));
		   
		    URI location = URI.create( "http://localhost:4433/bestellungen" + bestellung.getBestellungsID() );
		    return Response.created(location).build();
	}
}