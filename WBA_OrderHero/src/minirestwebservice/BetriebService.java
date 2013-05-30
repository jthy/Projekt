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

import generated.Betriebliste;
import generated.Betrieb;
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
	betriebe = ( Betriebliste ) um.unmarshal(new FileReader("/Users/shereesamannshausen/git/Projekt/WBA_OrderHero/src/Betriebliste.xml"));
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
	betriebe = ( Betriebliste ) um.unmarshal(new FileReader("/Users/shereesamannshausen/git/Projekt/WBA_OrderHero/src/Betriebliste.xml"));
	Betriebliste rt = ob.createBetriebliste();
	rt.getBetrieb().add(betriebe.getBetrieb().get(i-1));
	return rt;
}

/*@POST @Consumes( "text/xml" )
public Betriebliste createBetrieb( Betrieb neu )
{
   return Betrieb.createBetrieb( "Betrieb hinzugefuegt", ob.createBuch( neu ) );
}
		
}
*/

@POST
@Path("/betriebsliste/{betrieb_ID}")
public Betriebsliste betrieb_eintragen(
		@PathParam("Betriebs_ID") int Betriebs_ID,
		@PathParam("Betriebname") String Betriebname,
		@PathParam("Strasse") String Strasse,
		@PathParam("Hausnummer") int Hausnummer,
		@PathParam("Postleitzahl") int plz
	{
	JAXBContext context = JAXBContext.newInstance(Betrieb.class);

	Unmarshaller um = context.createUnmarshaller();
	Betriebsliste betrieb = (Betriebsliste) um.unmarshal(new FileReader("/Users/shereesamannshausen/git/Projekt/WBA_OrderHero/src/Betriebsliste.xml"));
	List<Betrieb> b = betrieb.getBetrieb();

	if(Betriebs_ID > b.size()){
	Betrieb betrieb=new Betrieb();
	betrieb.setBetriebsID(Betriebs_ID);
	betrieb.setBetriebname(Betriebname);
	betrieb.set(Strasse);
	betrieb.setHausnummer(Hausnummer);
	betrieb.setplz(plz);

	Betriebsliste bl = getBetrieb(Betriebs_ID);
	bl.getBetrieb().add(betrieb);

	Marshaller ma=context.createMarshaller();
	ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	ma.marshal(person, new FileOutputStream("/Users/shereesamannshausen/git/Projekt/WBA_OrderHero/src/Betriebsliste.xml"));
	return bl;	
	}
	else return null;
	}
