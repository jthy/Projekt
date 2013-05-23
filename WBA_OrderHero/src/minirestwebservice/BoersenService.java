package minirestwebservice;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import generated.Boerse;
import generated.Person;
import generated.Betrieb;
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
	boe = ( Boerse ) um.unmarshal(new FileReader("/Users/juliathyssen/git/Projekt/WBA_OrderHero/src/Boerse.xml"));
	
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
	boe = (Boerse) um.unmarshal(new FileReader("/Users/juliathyssen/git/Projekt/WBA_OrderHero/src/Boerse.xml"));
	Boerse rt = ob.createBoerse();
	rt.getBoersenEintrag().add(boe.getBoersenEintrag().get(i-1));
	return rt;
}

/*
@POST 
@Path("/boerse/neu")
public void postEintrag(
		@QueryParam("BoerseneintragsID")BigInteger BoerseneintragsID,
		@QueryParam("Vorname")String Vorname,
		@QueryParam("Nachname")String Nachname,
		@QueryParam("Alter")int Alter,
		@QueryParam("Typ")String Typ,
		@QueryParam("BetriebsID")BigInteger BetriebsID,
		@QueryParam("Datum")String Datum,
		@QueryParam("Titel") String Titel,
		@QueryParam("Informationstext")String Informationstext,
		@QueryParam("Startdatum")String Startdatum,
		@QueryParam("Ablaufdatum")String Ablaufdatum,
		@QueryParam("Kommentare")String Kommentare)throws JAXBException, FileNotFoundException
		{
	
	ObjectFactory ob=new ObjectFactory();
	Boerse boe=ob.createBoerse();
	JAXBContext context = JAXBContext.newInstance(Boerse.class);
	Unmarshaller um = context.createUnmarshaller();
	boe = ( Boerse ) um.unmarshal(new FileReader("/Users/juliathyssen/git/Projekt/WBA_OrderHero/src/Boerse.xml"));
	
	
	Boerse.BoersenEintrag eintragNeu=new Boerse.BoersenEintrag();
	Person personNeu = new Person();
	//Betrieb
	//neu.setBoerseneintragsID(BoerseneintragsID);
	//neu.getPerson().setVorname(Vorname);
	//neu.getPerson().setNachname(Nachname);
	//neu.getPerson().setAlter(Alter);
	//neu.getPerson().setTyp(Typ);
	//neu.getPerson().getBetrieb().setBetriebsID(BetriebsID);
	
}
/*
@POST @Path("benutzer")
public void postBenutzer(@QueryParam("name") String name, 
		   @QueryParam("passwort") String passwort, 
		   @QueryParam("email") String email, 
		   @QueryParam("stadt") String stadt, 
		   @QueryParam("plz") String plz, 
		   @QueryParam("strasse") String strasse, 
		   @QueryParam("hausnr") String hausnr, 
		   @QueryParam("bild") String bild){
	   XMLMarshaller xmlm = new XMLMarshaller();
	   xmlm.readBenutzer();

	   Benutzer b=new Benutzer();
	   b.setName(name);
	   b.setPasswort(passwort);
	   b.setEmail(email);

	   Benutzer.Wohnort w=new Benutzer.Wohnort();
	   w.setStadt(stadt);
	   w.setPLZ(plz);
	   w.setStrasse(strasse);
	   w.setHausNr(hausnr);

	   b.setWohnort(w);
	   b.setBild(bild);

	   xmlm.benutzerliste.getBenutzer().add(b);
	   xmlm.writeBenutzer();
}

*/
}


