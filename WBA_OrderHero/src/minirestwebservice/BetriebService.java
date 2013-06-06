package minirestwebservice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import generated.Betriebliste;
import generated.Betriebliste.Betrieb;
import generated.ObjectFactory;

@Path("/betriebe")
public class BetriebService {


@GET
@Produces( "application/xml")

public Betriebliste getBetriebe() throws JAXBException, FileNotFoundException
{
	ObjectFactory ob=new ObjectFactory();
	Betriebliste betriebe = ob.createBetriebliste();
	JAXBContext context = JAXBContext.newInstance(Betriebliste.class);
	Unmarshaller um = context.createUnmarshaller();
	betriebe = ( Betriebliste ) um.unmarshal(new FileReader("src/XML/Betriebliste.xml"));
	return betriebe;	
}

@GET
@Path("/{Betriebs_ID}")
@Produces( "application/xml")
public Betriebliste getBetrieb(@PathParam("Betriebs_ID")int i) throws JAXBException, FileNotFoundException
{
	ObjectFactory ob=new ObjectFactory();
	Betriebliste betriebe = ob.createBetriebliste();
	JAXBContext context = JAXBContext.newInstance(Betriebliste.class);
	Unmarshaller um = context.createUnmarshaller();
	betriebe = ( Betriebliste ) um.unmarshal(new FileReader("src/XML/Betriebliste.xml"));
	Betriebliste rt = ob.createBetriebliste();
	rt.getBetrieb().add(betriebe.getBetrieb().get(i-1));
	return rt;
}


@POST
@Produces("application/xml")

public Betrieb betrieberstellen( @PathParam("Betriebs_ID") int Betriebs_ID, Betrieb betrieb)throws JAXBException, FileNotFoundException
	{	
	 JAXBContext context= JAXBContext.newInstance(Betriebliste.class);
	    
	    Unmarshaller um = context.createUnmarshaller();
		Betriebliste betriebe = (Betriebliste) um.unmarshal(new File("src/XML/Betriebliste.xml"));
		List<Betrieb> b = betriebe.getBetrieb();
		
	    if(Betriebs_ID > b.size()){
	    	Betriebliste bl = getBetrieb(Betriebs_ID);
	    	bl.getBetrieb().add(betrieb);
	    }
	    //wenn Betriebs_ID bereits verwendet, nächstmögliche ID verwenden
	    else{
	    	Betriebs_ID = b.size() +1 ;
	    	Betriebliste bl = getBetrieb(Betriebs_ID);
	    	bl.getBetrieb().add(betrieb);
	    }
	    return betrieb;
	    
	}

@PUT
@Path("/{Betriebs_ID}")
public Betriebliste betriebaendern(
		@FormParam("Betriebs_ID") int Betriebs_ID,
		@FormParam("Betriebname") String Betriebname,
		@FormParam("Strasse") String Strasse,
		@FormParam("Hausnummer") int Hausnummer,
		@FormParam("Postleitzahl") int plz,
		@FormParam("ArtDesBetriebes") String ArtDesBetriebes
		)throws JAXBException, FileNotFoundException
	{
	
	JAXBContext context = JAXBContext.newInstance(Betrieb.class);
	
	Unmarshaller um = context.createUnmarshaller();
	Betriebliste betriebe = (Betriebliste) um.unmarshal(new FileReader("src/XML/Betriebliste.xml"));
	List<Betrieb> b = betriebe.getBetrieb();
	Betrieb betrieb=new Betrieb();
	if(Betriebs_ID <= b.size()){
		
		//BetriebID darf nicht geaendert werden
		betrieb.setBetriebname(Betriebname);
		betrieb.getAdresse().setStrasse(Strasse);
		betrieb.getAdresse().setHausnummer(Hausnummer);
		betrieb.getAdresse().setPLZ(plz);
		betrieb.setArtDesBetriebes(ArtDesBetriebes);
		
		Betriebliste bl = getBetrieb(Betriebs_ID);
		bl.getBetrieb().add(betrieb);
		
		Marshaller ma=context.createMarshaller();
		ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		ma.marshal(betrieb, new FileOutputStream("src/XML/Betriebliste.xml"));
		return bl;
	}
	else return null;
	}
@DELETE 
@Path("/{Betriebs_ID}")
   public Betriebliste betriebloeschen(@PathParam("Betriebs_ID") int Betriebs_ID)throws JAXBException, FileNotFoundException{
	JAXBContext context = JAXBContext.newInstance("generated");
	Unmarshaller um = context.createUnmarshaller();
	
	Betriebliste betriebe = (Betriebliste) um.unmarshal( new FileReader("src/XML/Betriebliste.xml"));

	//Betriebliste in Betrieb kopieren
	ObjectFactory of = new ObjectFactory();
	Betriebliste betrieb = of.createBetriebliste();
	
	// i-ten Betrieb aus Betriebliste löschen
	betrieb.getBetrieb().addAll(betriebe.getBetrieb());
	betrieb.getBetrieb().remove(Betriebs_ID);
	
	
	// Betriebliste "aktualisieren" und zurückgeben
	// Marshaller
	Marshaller m = context.createMarshaller();
	m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	m.marshal(betrieb, new File("src/XML/Betriebliste.xml"));

	return betrieb;
}

}
