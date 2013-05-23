package minirestwebservice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.ws.rs.PathParam;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import generated.Boerse;
import generated.ObjectFactory;

public class XMLmarshaller {
public static final String Boerse_XML="/Users/juliathyssen/git/Projekt/WBA_OrderHero/src/Boerse.xml";

public Marshaller m;
private Unmarshaller um;
private JAXBContext context;
public Boerse boerseliste;


public Boerse getBoerse() throws JAXBException, FileNotFoundException
{
	try{
	ObjectFactory ob=new ObjectFactory();
	Boerse boe=ob.createBoerse();
	context = JAXBContext.newInstance(Boerse.class);
	um = context.createUnmarshaller();
	boe = ( Boerse ) um.unmarshal(new FileReader("/Users/juliathyssen/git/Projekt/WBA_OrderHero/src/Boerse.xml"));
	
	return boe;
}

public Boerse getEintrag(int i) throws JAXBException, FileNotFoundException
{
	ObjectFactory ob=new ObjectFactory();
	Boerse boe=ob.createBoerse();
	context = JAXBContext.newInstance(Boerse.class);
	um = context.createUnmarshaller();
	boe = (Boerse) um.unmarshal(new FileReader("/Users/juliathyssen/git/Projekt/WBA_OrderHero/src/Boerse.xml"));
	Boerse rt = ob.createBoerse();
	rt.getBoersenEintrag().add(boe.getBoersenEintrag().get(i-1));
	return rt;
}

public void writeEintrag() throws JAXBException{
		m.marshal(boerseliste , new File(Boerse_XML));	
 }



}
