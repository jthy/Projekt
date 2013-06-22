package swing;

import java.awt.event.*;
import java.io.FileNotFoundException;

import javax.swing.*;
import javax.xml.bind.JAXBException;

import org.jivesoftware.smack.XMPPException;

import minirestwebservice.*;
import xmpp.*;
import generated.Boerse.BoersenEintrag;
import generated.*;



public class gui123 extends JFrame {
	private JFrame frame;
	private static final long serialVersionUID = 1L;
	
	JTextField 	 tfEintragsID;

	JButton		 btnSend;
	JButton		 btnBetriebSend;
	
	JLabel       lblAusgabe;

	JRadioButton rbBetrieb;
	JRadioButton rbBetriebe;
	
	public gui123(){
		this.initWindow();
	}
	protected void initWindow() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Allgemeines
		this.setTitle("OrderHero: Boerse");
		this.setResizable(false);
		//this.setLayout(new BorderLayout());


		//TextField Instanziieren
		 tfEintragsID = new JTextField();
		//Laben Instantziieren
		 lblAusgabe = new JLabel("Ausgabe: ");
		 
		//Radio-Buttons Instanziieren
		rbBetrieb = new JRadioButton();
		rbBetrieb.setSelected(true);
		rbBetriebe = new JRadioButton();
		
	    //Senden-Button Instanziieren
		btnSend = new JButton("Send");

		btnSend.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					Send();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JAXBException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		// Positionen festlegen
		rbBetriebe.setBounds(5,10,400,25);
		rbBetrieb.setBounds(5,40,400,25);
		tfEintragsID.setBounds(5, 70, 400, 25);
		btnSend.setBounds(5,100,200,25);
		lblAusgabe.setBounds(5, 150, 400, 100);

		// Elemente dem Fenster hinzufügen:
		this.getContentPane().add(rbBetriebe);
		this.getContentPane().add(rbBetrieb);
		this.getContentPane().add(tfEintragsID);
		this.getContentPane().add(lblAusgabe);
		this.getContentPane().add(btnSend);
		this.pack();

		try {
			Client.connect();
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			System.out.println("Fehler beim Verbindungsaufbau.");
		}
	}
	
	public void Send() throws FileNotFoundException, JAXBException
	{
	if(rbBetrieb.isSelected()){
		int EintragsID = 0;
		try {
		EintragsID = Integer.parseInt(tfEintragsID.getText());
		} catch (NumberFormatException e) {
		// Fehlerbehandlung
		}
		BoersenService boerse = new BoersenService();
		Boerse leseEintrag = boerse.getEintrag(EintragsID);
		for(BoersenEintrag id : leseEintrag.getBoersenEintrag()){
			String titel  = id.getTitel();
			lblAusgabe.setText(lblAusgabe.getText() + titel);
		}
		
		//this.Betrieb();
	}
	else if(rbBetriebe.isSelected()){
		BoersenService boerse = new BoersenService();
		Boerse leseEintraege = boerse.getBoerse();
		for(BoersenEintrag be : leseEintraege.getBoersenEintrag()){
			lblAusgabe.setText(lblAusgabe.getText()+be.getTitel());	
		}

	}
	} 

	public static void main(String[] args)
	{
	 gui123 thegui123 = new gui123();
	 thegui123.setBounds(1, 1, 500, 300);
	 thegui123.setVisible(true);
	}
	
}