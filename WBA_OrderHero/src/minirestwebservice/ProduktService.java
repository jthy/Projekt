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
import generated.Produkt;
import generated.Produktliste;

@Path("/produkte")
public class ProduktService {

String pfad = "src/XML/Produktliste.xml";

@GET
@Produces("application/xml")

public Produktliste leseProdukte() throws JAXBException, FileNotFoundException
{
	ObjectFactory ob=new ObjectFactory();
	Produktliste produkte = ob.createProduktliste();
	JAXBContext context = JAXBContext.newInstance(Produktliste.class);
	Unmarshaller um = context.createUnmarshaller();
	produkte = ( Produktliste ) um.unmarshal(new FileReader(pfad));
	return produkte;	
}

@GET
@Path("/{Produkt_ID}")
@Produces("application/xml")
public Produktliste leseProdukt(@PathParam("Produkt_ID")int i) throws JAXBException, FileNotFoundException
{
	ObjectFactory ob=new ObjectFactory();
	Produktliste produkte = ob.createProduktliste();
	JAXBContext context = JAXBContext.newInstance(Betriebliste.class);
	Unmarshaller um = context.createUnmarshaller();
	produkte = ( Produktliste ) um.unmarshal(new FileReader(pfad));
	Produktliste proli = ob.createProduktliste();
	proli.getProdukt().add(produkte.getProdukt().get(i-1));
	return proli;
}

@POST 
@Produces("application/xml")
@Consumes("application/xml")
public Response erstelleProdukt( Produkt produkt ) throws Exception
{

	    JAXBContext jc = JAXBContext.newInstance(Produktliste.class);
	    //unmarshaller zum lesen 
	    Unmarshaller um = jc.createUnmarshaller();
	    //marshaller zum schreiben
	    Marshaller marshaller =jc.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	    Produktliste produkte = (Produktliste) um.unmarshal(new FileInputStream(pfad));

	    List<Produkt> produktliste = produkte.getProdukt();

		produkt.setProduktID(produktliste.size()+1);
		
	 	produktliste.add( produkt );

	    marshaller.marshal(produkte, new File(pfad));
	   
	    URI location = URI.create( "http://localhost:4433/produkte" + produkt.getProduktID() );
	    return Response.created(location).build();
}


@PUT
@Path( "/{ProduktID}" )
@Produces("application/xml")
@Consumes("application/xml")
public Response aenderProdukt( @PathParam("ProduktID") int id, Produkt produkt  ) throws Exception
{

	    JAXBContext jc = JAXBContext.newInstance(Produktliste.class);
	    //unmarshaller zum lesen 
	    Unmarshaller um = jc.createUnmarshaller();
	    //marshaller zum schreiben
	    Marshaller marshaller =jc.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	    Produktliste produkte = (Produktliste) um.unmarshal(new FileInputStream(pfad));
	    
	    List<Produkt> produktliste = produkte.getProdukt();
	    //wenn id nicht vergeben ist wird betrieb erst erstellt!
	    if(id > produktliste.size()){
    		produkt.setProduktID(produktliste.size()+1);
    	 	produktliste.add( produkt );
    	}
	    else{
	    int i=0;;
	    for(Produkt pro : produktliste){
	    	if(pro.getProduktID() == (id)){
	    		produktliste.set(i, produkt);
	    	}
	    	i++;
	    	}
	    }
	    

	    marshaller.marshal(produkte, new File(pfad));

	    URI location = URI.create( "http://localhost:4433/produkte" + produkt.getProduktID() );
	    return Response.created(location).build(); 
}

@DELETE 
@Path("/{Produkt_ID}")
   public Produktliste loescheProdukt(@PathParam("Produkt_ID") int Produkt_ID)throws JAXBException, FileNotFoundException
   {
	JAXBContext context = JAXBContext.newInstance("generated");
	Unmarshaller um = context.createUnmarshaller();
	
	Produktliste produkte = (Produktliste) um.unmarshal( new FileReader(pfad));

	//Betriebliste in Betrieb kopieren
	ObjectFactory of = new ObjectFactory();
	Produktliste produkt = of.createProduktliste();
	
	// i-ten Betrieb aus Betriebliste l���������schen
	produkt.getProdukt().addAll(produkte.getProdukt());
	produkt.getProdukt().remove(Produkt_ID);
	
	
	// Betriebliste "aktualisieren" und zur���������ckgeben
	// Marshaller
	Marshaller m = context.createMarshaller();
	m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	m.marshal(produkt, new File(pfad));

	return produkt;
}
}
