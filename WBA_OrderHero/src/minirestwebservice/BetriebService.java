package minirestwebservice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
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
@Produces( MediaType.APPLICATION_XML )

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
@Produces( MediaType.APPLICATION_XML )
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
@Consumes("application/xml")

public Betrieb betrieberstellen( @PathParam("Betriebs_ID") int Betriebs_ID, Betrieb betrieb)throws JAXBException, FileNotFoundException
	{	
	 JAXBContext context= JAXBContext.newInstance(Betriebliste.class);
	    
	    Unmarshaller um = context.createUnmarshaller();
		Betriebliste betriebe = (Betriebliste) um.unmarshal(new File("src/XML/Betriebliste.xml"));
		List<Betrieb> b = betriebe.getBetrieb();
		
	    if(Betriebs_ID > b.size() +1){
	    	Betriebliste bl = getBetrieb(Betriebs_ID);
	    	bl.getBetrieb().add(betrieb);
	    }
	    //wenn Betriebs_ID bereits verwendet, n�chstm�gliche ID verwenden
	    else{
	    	Betriebs_ID = b.size() + 2 ;
	    	Betriebliste bl = getBetrieb(Betriebs_ID);
	    	bl.getBetrieb().add(betrieb);
	    }
	    return betrieb;
	    
	}

@PUT
@Path("/{Betriebs_ID}")
@Consumes( MediaType.APPLICATION_XML )
public Response betriebaendern(@PathParam("Betriebs_ID") int Betriebs_ID, Betrieb betrieb)throws JAXBException, FileNotFoundException
	{
	JAXBContext context = JAXBContext.newInstance(Betrieb.class);
	Unmarshaller um = context.createUnmarshaller();
	Betriebliste betriebe = (Betriebliste) um.unmarshal(new FileInputStream("src/XML/Betriebliste.xml"));
	Marshaller marshaller =context.createMarshaller();
	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	
	List<Betrieb> betriebliste = betriebe.getBetrieb();
	
	int i=0;
	
		if(Betriebs_ID <= betriebliste.size()){
			betriebliste.set(i, betrieb);
		}
		
	marshaller.marshal(betrieb, new File("src/XML/Betriebliste.xml"));


    URI location = URI.create( "http://localhost:4434/betriebe/" + betrieb.getBetriebsID());
    return Response.created(location ).build();
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
