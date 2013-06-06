package xmpp;

import org.jivesoftware.smack.Connection;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;

public class XMPPConnect {

	public Connection conn = null;


	public XMPPConnect(){
		// Create a connection to the jabber.org server on a specific port.
		ConnectionConfiguration config = new ConnectionConfiguration("localhost", 5222);
		conn = new XMPPConnection(config);

		try {
			conn.connect();
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		login("drdare","computer");
	}

	public void login(String username, String password){
		System.out.println("einloggen");

		try {
			conn.login(username, password);
			System.out.println("Erfolgreich eingeloggt!");
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}