package minirestwebservice;


import generated.Boerse;

import org.jivesoftware.smack.XMPPException;

import com.sun.jersey.api.client.WebResource;


public class Client {

	/**
	 * @param args
	 */
	public static void connect() throws XMPPException 
	{
		String url = "http://localhost:5222" + "/boerse";
		
		System.out.println( "URL: " + url );

		WebResource wrs = com.sun.jersey.api.client.Client.create().resource( url );

		System.out.println( "\nTextausgabe:" );
		System.out.println( wrs.accept( "application/xml" ).get( Boerse.class ) );
	}
	

}
