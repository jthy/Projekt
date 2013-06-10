package minirestwebservice;

import com.sun.grizzly.http.SelectorThread;
import com.sun.jersey.api.container.grizzly.GrizzlyServerFactory;

public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception 
	{
String url = "http://localhost:4422";
		
		SelectorThread srv = GrizzlyServerFactory.create (url );
		
		System.out.println( "URL: " + url);
		Thread.sleep( 1000 * 60 * 5);
		srv.stopEndpoint();

	}
	

}
