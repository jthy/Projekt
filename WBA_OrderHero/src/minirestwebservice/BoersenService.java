package minirestwebservice;

import javax.ws.rs.*;

@Path( "/Boerse/Boerseneintrag/BoerseneintragsID" )
public class BoersenService {

	@GET @Produces( "text/html" )
	public String ID(@QueryParam("BoerseneintragsID") Integer BoerseneintragsID){
		return "<html><title>Bšrseneintrag></title><body><p>" + BoerseneintragsID + "</p></body></html>";
	}
		
}
