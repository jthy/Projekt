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

import generated.Betriebliste;
import generated.Betriebliste.Betrieb;
import generated.ObjectFactory;

@Path("/betriebe")
public class BetriebService {

String pfad ="src/XML/Betriebliste.xml";

@GET
@Produces("application/xml")

public Betriebliste leseBetriebe() throws JAXBException, FileNotFoundException
{
	ObjectFactory ob=new ObjectFactory();
	Betriebliste betriebe = ob.createBetriebliste();
	JAXBContext context = JAXBContext.newInstance(Betriebliste.class);
	Unmarshaller um = context.createUnmarshaller();
	betriebe = ( Betriebliste ) um.unmarshal(new FileReader(pfad));
	return betriebe;	
}

@GET
@Path("/{Betriebs_ID}")
@Produces("application/xml")
public Betriebliste leseBetrieb(@PathParam("Betriebs_ID")int i) throws JAXBException, FileNotFoundException
{
	ObjectFactory ob=new ObjectFactory();
	Betriebliste betriebe = ob.createBetriebliste();
	JAXBContext context = JAXBContext.newInstance(Betriebliste.class);
	Unmarshaller um = context.createUnmarshaller();
	betriebe = ( Betriebliste ) um.unmarshal(new FileReader(pfad));
	Betriebliste rt = ob.createBetriebliste();
	rt.getBetrieb().add(betriebe.getBetrieb().get(i-1));
	return rt;
}

@POST 
@Produces("application/xml")
@Consumes("application/xml")
public Response erstelleBetrieb ( Betrieb betrieb ) throws Exception
{

	    JAXBContext jc = JAXBContext.newInstance(Betriebliste.class);
	    //unmarshaller zum lesen 
	    Unmarshaller um = jc.createUnmarshaller();
	    //marshaller zum schreiben
	    Marshaller marshaller =jc.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	    Betriebliste betriebe = (Betriebliste) um.unmarshal(new FileInputStream(pfad));

	    List<Betrieb> betriebliste = betriebe.getBetrieb();

		betrieb.setBetriebsID(betriebliste.size()+1);
		
	 	betriebliste.add( betrieb );

	    marshaller.marshal(betriebe, new File(pfad));
	   
	    URI location = URI.create( "http://localhost:4433/betriebe" + betrieb.getBetriebsID() );
	    return Response.created(location).build();
}


@PUT
@Path( "/{BetriebsID}" )
@Produces("application/xml")
@Consumes("application/xml")
public Response aenderBetrieb( @PathParam("BetriebsID") int id, Betrieb betrieb  ) throws Exception
{

	    JAXBContext jc = JAXBContext.newInstance(Betriebliste.class);
	    //unmarshaller zum lesen 
	    Unmarshaller um = jc.createUnmarshaller();
	    //marshaller zum schreiben
	    Marshaller marshaller =jc.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	    Betriebliste betriebe = (Betriebliste) um.unmarshal(new FileInputStream(pfad));
	    
	    List<Betrieb> betriebliste = betriebe.getBetrieb();
	    //wenn id nicht vergeben ist wird betrieb erst erstellt!
	    if(id > betriebliste.size()){
    		betrieb.setBetriebsID(betriebliste.size()+1);
    	 	betriebliste.add( betrieb );
    	}
	    else{
	    int i=0;;
	    for(Betrieb be : betriebliste){
	    	if(be.getBetriebsID() == (id)){
	    		betriebliste.set(i, betrieb);
	    	}
	    	i++;
	    	}
	    }
	    

	    marshaller.marshal(betriebe, new File(pfad));

	    URI location = URI.create( "http://localhost:4433/betriebe" + betrieb.getBetriebsID() );
	    return Response.created(location).build(); 
}

@DELETE 
@Path("/{Betriebs_ID}")
   public Betriebliste loescheBetrieb(@PathParam("Betriebs_ID") int Betriebs_ID)throws JAXBException, FileNotFoundException{
	JAXBContext context = JAXBContext.newInstance("generated");
	Unmarshaller um = context.createUnmarshaller();
	
	Betriebliste betriebe = (Betriebliste) um.unmarshal( new FileReader(pfad));

	//Betriebliste in Betrieb kopieren
	ObjectFactory of = new ObjectFactory();
	Betriebliste betrieb = of.createBetriebliste();
	
	// i-ten Betrieb aus Betriebliste loeschen
	betrieb.getBetrieb().addAll(betriebe.getBetrieb());
	betrieb.getBetrieb().remove(Betriebs_ID);
	
	
	// Betriebliste "aktualisieren" und zurueckgeben
	// Marshaller
	Marshaller m = context.createMarshaller();
	m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	m.marshal(betrieb, new File(pfad));

	return betrieb;
}

}
