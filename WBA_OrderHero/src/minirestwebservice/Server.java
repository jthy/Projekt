package minirestwebservice;


import com.sun.grizzly.http.SelectorThread;
import com.sun.jersey.api.container.grizzly.GrizzlyServerFactory;

public class Server {

	/**
	 * @param args
	 */
		 public static void main( String[] args ) throws Exception
		   {   
		         String url = "http://localhost:4434";

		         SelectorThread srv = GrizzlyServerFactory.create( url );

		         System.out.println( "URL: " + url );
		         
		         System.out.println( "Enter to stop server" );
		         System.in.read();
		         srv.stopEndpoint();
		        System.out.println( "Server stopped" );

		      }

	}
	

