package minirestwebservice;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Date;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import generated.Boerse;
import generated.Boerse.BoersenEintrag;
import generated.Person;
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
public Boerse Eintragerstellen(
		@PathParam("BoerseneintragsID") int BoerseneintragsID,
		@PathParam("Person") int Person_ID,
		@PathParam("Erstellungsdatum") Date Erstellungsdatum,
		@PathParam("Titel") String Titel,
		@PathParam("Informationstext") String Informationstext,
		@PathParam("Startdatum") Date Startdatum,
		@PathParam("Alaufdatum") Date Ablaufdatum,
		@PathParam("Typ") String Typ
		)throws JAXBException, FileNotFoundException
		{
	JAXBContext context = JAXBContext.newInstance(Boerse.class);
	
	Unmarshaller um = context.createUnmarshaller();
	Boerse boerse = (Boerse) um.unmarshal(new FileReader("src/XML/Boerse.xml"));
	List<Boerse.BoersenEintrag> boe = boerse.getBoersenEintrag();
	
	BoersenEintrag eintrag = new BoersenEintrag();
	eintrag.setBoerseneintragsID(boe.size()+1);
	eintrag.getPerson().setPersonID(Person_ID);
	eintrag.setErstellungsdatum(Erstellungsdatum);
	eintrag.setTitel(Titel);
	eintrag.setInformationstext(Informationstext);
	eintrag.setStartdatum(Startdatum);
	eintrag.setAblaufdatum(Ablaufdatum);
	eintrag.setTyp(Typ);
	
	Boerse n = getEintrag(BoerseneintragsID);
	n.getBoersenEintrag().add(eintrag);
	
	Marshaller ma=context.createMarshaller();
	ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	ma.marshal(eintrag, new FileOutputStream("src/XML/Boerse.xml"));
	return n;
	
	}
//TO DO: Kommentare erstellen zu Eintrag
/*
@POST
@Path("/{BoerseneintragsID}")
public Boerse Kommentarerstellen(
		@PathParam("BoerseneintragsID") int BoerseneintragsID,
		@PathParam("Person") int Person_ID,
		@PathParam("Datum") Date Datum,
		@PathParam("Informationstext") String Informationstext
		)throws JAXBException, FileNotFoundException
		{

*/
@PUT
@Path("/{BoerseneintragsID}")
public Boerse kommentarerstellen(
		@PathParam("BoerseneintragsID") int BoerseneintragsID,
		@PathParam("Person") int Person_ID,
		@PathParam("Datum") Date Datum,
		@PathParam("Informationstext") String Informationstext
		)throws JAXBException, FileNotFoundException{
JAXBContext context = JAXBContext.newInstance(Person.class);

Unmarshaller um = context.createUnmarshaller();
Boerse boerse = (Boerse) um.unmarshal(new FileReader("src/XML/Boerse.xml"));
List<Boerse.BoersenEintrag> boe = boerse.getBoersenEintrag();

if(BoerseneintragsID <= boe.size()){
	BoersenEintrag kommentar = new BoersenEintrag();
	//BoerseneintragsID darf nicht geaendert werden
	 kommentar.getKommentare().getPerson().setPersonID(Person_ID);
	 kommentar.getKommentare().setInformationstext(Informationstext);
	 kommentar.getKommentare().setDatum(Datum);
	
	Boerse n = getEintrag(BoerseneintragsID);
	n.getBoersenEintrag().add( kommentar);

	Marshaller ma=context.createMarshaller();
	ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	ma.marshal( kommentar, new FileOutputStream("src/XML(Boerse.xml"));
	return n;
}
else return null;
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
	
	// i-ten Eintrag aus Boerse lšschen
	eintrag.getBoersenEintrag().addAll(eintraege.getBoersenEintrag());
	eintrag.getBoersenEintrag().remove(BoerseneintragsID);
	
	// Boerse "aktualisieren" und zurŸckgeben
	// Marshaller
	Marshaller m = context.createMarshaller();
	m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	m.marshal(eintrag, new File("src/Personenliste.xml"));

	return eintrag;
}

}