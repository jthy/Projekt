package minirestwebservice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

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
public Betrieb postNewBetrieb( Betrieb betrieb ) throws Exception
{

	    JAXBContext jc = JAXBContext.newInstance(Betriebliste.class);
	    //unmarshaller zum lesen 
	    Unmarshaller um = jc.createUnmarshaller();
	    //marshaller zum schreiben
	    Marshaller marshaller =jc.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	    Betriebliste betriebe = (Betriebliste) um.unmarshal(new FileInputStream("XML/Betriebliste.xml"));

	    List<Betrieb> betriebliste = betriebe.getBetrieb();

	    /*BigInteger ID = BigInteger.ZERO ;
		for(Betrieb be : betriebliste ){

	    	if(be.getBetriebsID().compareTo(ID)==1){
	    		ID = be.getBetriebsID();
	    	}
	    } */

	    Betrieb betrieb2=new Betrieb();
		
		betrieb.setBetriebsID(betriebliste.size()+1);
		
	 	betriebliste.add( betrieb2 );

	    marshaller.marshal(betriebe, new File("XML/Betriebliste.xml"));

   return betrieb2;
}

/*@POST
@Path("/{Betrieb_ID}")
@Produces("application/xml")
public Betriebliste betrieberstellen(
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
	List<Betriebliste.Betrieb> b = betriebe.getBetrieb();
	
	Betrieb betrieb=new Betrieb();
	
	betrieb.setBetriebsID(b.size()+1);
	betrieb.setBetriebname(Betriebname);
	betrieb.getAdresse().setStrasse(Strasse);
	betrieb.getAdresse().setHausnummer(Hausnummer);
	betrieb.getAdresse().setPLZ(plz);
	betrieb.setArtDesBetriebes(ArtDesBetriebes);

	Betriebliste bl = getBetrieb(Betriebs_ID);
	bl.getBetrieb().add(betrieb);

	Marshaller ma=context.createMarshaller();
	ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	ma.marshal(betrieb, new FileOutputStream("src/XML/Betriebsliste.xml"));
	return bl;
	}
*/

@PUT
@Path( "/{BetriebsID}" )
public Betrieb changeBetrieb( @PathParam("BetriebsID") int id, Betrieb betrieb  ) throws Exception
{

	    JAXBContext jc = JAXBContext.newInstance(Betriebliste.class);
	    //unmarshaller zum lesen 
	    Unmarshaller um = jc.createUnmarshaller();
	    //marshaller zum schreiben
	    Marshaller marshaller =jc.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	    Betriebliste betriebe = (Betriebliste) um.unmarshal(new FileInputStream("XML/Betriebliste.xml"));


	    List<Betrieb> betriebsliste = betriebe.getBetrieb();

	    int i=0;;
	    for(Betrieb be : betriebsliste ){
	    	if(be.getBetriebsID() == (id)){
	    		betriebsliste.set(i, betrieb);
	    	}
	    	i++;
	    }

	    marshaller.marshal(betriebe, new File("XML/Betriebliste.xml"));

   return betrieb; 
}

/*@PUT
@Path("/{Betriebs_ID}")
public Betriebliste betriebaendern(
		@PathParam("Betriebs_ID") int Betriebs_ID,
		@PathParam("Betriebname") String Betriebname,
		@PathParam("Strasse") String Strasse,
		@PathParam("Hausnummer") int Hausnummer,
		@PathParam("Postleitzahl") int plz,
		@PathParam("ArtDesBetriebes") String ArtDesBetriebes
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
	*/

@DELETE 
@Path("/{Betriebs_ID}")
   public Betriebliste betriebloeschen(@PathParam("Betriebs_ID") int Betriebs_ID)throws JAXBException, FileNotFoundException{
	JAXBContext context = JAXBContext.newInstance("generated");
	Unmarshaller um = context.createUnmarshaller();
	
	Betriebliste betriebe = (Betriebliste) um.unmarshal( new FileReader("src/XML/Betriebliste.xml"));

	//Betriebliste in Betrieb kopieren
	ObjectFactory of = new ObjectFactory();
	Betriebliste betrieb = of.createBetriebliste();
	
	// i-ten Betrieb aus Betriebliste l�schen
	betrieb.getBetrieb().addAll(betriebe.getBetrieb());
	betrieb.getBetrieb().remove(Betriebs_ID);
	
	
	// Betriebliste "aktualisieren" und zur�ckgeben
	// Marshaller
	Marshaller m = context.createMarshaller();
	m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	m.marshal(betrieb, new File("src/XML/Betriebliste.xml"));

	return betrieb;
}

}
