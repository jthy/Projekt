package xmpp;

	import org.jivesoftware.smack.ConnectionConfiguration;
	import org.jivesoftware.smack.XMPPConnection;
	import org.jivesoftware.smack.XMPPException;

	public class User {

	    protected static XMPPConnection connection;
	    protected static String jid;

		 public void login(String userName, String password) throws XMPPException
		    {
		    ConnectionConfiguration config = new ConnectionConfiguration("localhost",5222);
		    connection = new XMPPConnection(config);

		    connection.connect();
		    connection.login(userName, password);
		    jid = this.getJabberID();
		    }

		 public void logout()
		 {	  
		  connection.disconnect();	 
		 }

		 public String getRealName()
		 {
		  return connection.getAccountManager().getAccountAttribute("Vorname" + "Nachname");
		 }

		 public String getJabberID()
		 {
		  return connection.getUser();	 
		 }
	}

