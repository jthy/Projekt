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
import generated.Boerse;
import generated.ObjectFactory;

@Path("/betriebe")
public class BetriebService {


@GET
@Produces( "application/xml")

public Betriebliste getBetriebe() throws JAXBException, FileNotFoundException
{
	ObjectFactory ob=new ObjectFactory();
	Betriebliste betriebe = ob.createBetriebliste();
	JAXBContext context = JAXBContext.newInstance(Boerse.class);
	Unmarshaller um = context.createUnmarshaller();
	betriebe = ( Betriebliste ) um.unmarshal(new FileReader("/Users/juliathyssen/git/Projekt/WBA_OrderHero/src/Betriebliste.xml"));
	return betriebe;	
}

@GET
@Path("/{Betriebs_ID}")
@Produces( "application/xml")
public Betriebliste getBetrieb(@PathParam("Betriebs_ID")int i) throws JAXBException, FileNotFoundException
{
	ObjectFactory ob=new ObjectFactory();
	Betriebliste betriebe = ob.createBetriebliste();
	JAXBContext context = JAXBContext.newInstance(Boerse.class);
	Unmarshaller um = context.createUnmarshaller();
	betriebe = ( Betriebliste ) um.unmarshal(new FileReader("/Users/juliathyssen/git/Projekt/WBA_OrderHero/src/Betriebliste.xml"));
	Betriebliste rt = ob.createBetriebliste();
	rt.getBetrieb().add(betriebe.getBetrieb().get(i-1));
	return rt;
}
}
