package swing;

import java.awt.event.*;
import java.io.FileNotFoundException;

import javax.swing.*;
import javax.xml.bind.JAXBException;

import org.jivesoftware.smack.XMPPException;

import minirestwebservice.*;
import xmpp.*;


public class AppWindow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTextField 	 tfEintragsID;
	JTextField   tfPersonID;
	JTextField 	 tfBetrieb;
	JTextField   tfBestellungsID;
	JTextField   tfBoersenEintragsID;

	JButton		 btnSend;
	JButton		 btnBetriebSend;
	JButton		 btnPersonSend;
	JButton		 btnBoerseSend;
	JButton		 btnBestellungSend;
	JButton		 btnPublishSend;
	JButton		 btnSubscribeSend;
	
	
	JRadioButton rbBetrieb;
	JRadioButton rbPerson;
	JRadioButton rbBoerse;
	JRadioButton rbBestellung;


	JRadioButton rbGet;
	JRadioButton rbGetOne;
	JRadioButton rbPost;
	JRadioButton rbPut;
	JRadioButton rbDelete;
	JRadioButton rbPostKommentar;
	
	JRadioButton rbPublish;
	JRadioButton rbSubscribe;
	JRadioButton rbFisch;
	JRadioButton rbFleisch;
	JRadioButton rbGemuese;
	
	JRadioButton rbNodeErstellen;
	JRadioButton rbNodeLoeschen;
	JRadioButton rbNodeVeroeffentlichen;
	JRadioButton rbNodeMitPayloadVeroeffentlichen;
	JRadioButton rbAbonenntenLesen;
	
	JRadioButton rbNodeAbonnieren;
	JRadioButton rbNodeDeabonnieren;
	JRadioButton rbNachrichtenLesen;
	JRadioButton rbNodeInformationenLesen;
	
	public AppWindow(){
	
		this.getContentPane().setLayout(null);
		this.initWindow();
		this.addWindowListener(new WindowListener() {
			public void windowClosed(WindowEvent arg0) {}
			public void windowActivated(WindowEvent e) {}
			public void windowClosing(WindowEvent e) {
				System.exit(0);}
			public void windowDeactivated(WindowEvent e) {}
			public void windowDeiconified(WindowEvent e) {}
			public void windowIconified(WindowEvent e) {}
			public void windowOpened(WindowEvent e) {}
		});

	}
	protected void initWindow() 
	{
		//Allgemeines
		this.setTitle("OrderHero: Client");
		this.setResizable(false);
		//this.setLayout(new BorderLayout());


		// Instanzieren:
		//tfVorname = new JTextField();
		//tfNachname = new JTextField();
		 tfEintragsID = new JTextField();
		 tfBetrieb = new JTextField();
		 tfPersonID = new JTextField();
		 tfBestellungsID = new JTextField();
		 
		//Instanziere Radio-Buttons
		//zunachst nur Auswahl ueber 4 Bereiche
		rbBetrieb = new JRadioButton();
		rbBetrieb.setSelected(true);
		rbPerson = new JRadioButton();
		rbBoerse = new JRadioButton();
		
	    //Instanziere Senden-Button
		btnSend = new JButton("Send");

		btnSend.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Send();
			}

		});

		// Positionen festlegen
		rbBetrieb.setBounds(5,10,400,25);
		rbPerson.setBounds(5,40,400,25);
		rbBoerse.setBounds(5,70,400,24);
		rbBestellung.setBounds(5,100,400,24);
		
		btnSend.setBounds(5,240,200,30);
     		

		// Elemente dem Fenster hinzufügen:
		this.getContentPane().add(rbBetrieb);
		this.getContentPane().add(rbPerson);
		this.getContentPane().add(rbBoerse);
		this.getContentPane().add(rbBestellung);

		this.getContentPane().add(btnSend);
		this.pack();

		try {
			Client.connect();
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			System.out.println("Fehler beim Verbindungsaufbau.");
		}
	}
	
	public void Send()
	{
	if(rbBetrieb.isSelected()){
		this.Betrieb();
	}
	else if(rbPerson.isSelected()){
		this.Person();
	}
	else if(rbBestellung.isSelected()){
		this.Bestellung();
	}
	else if(rbBoerse.isSelected()){
		this.Boerse();
	}
	} 

	
	private void Betrieb() {
		//Allgemeines
				this.setTitle("OrderHero: Betrieb");
				this.setResizable(false);
		// Instanzieren:
				tfEintragsID = new JTextField();
		//Instanziere Radio-Buttons
		//zunachst nur Auswahl ueber 4 Bereiche
				rbGet = new JRadioButton();
				rbGet.setSelected(true);
				rbGetOne = new JRadioButton();
				rbPost = new JRadioButton();
				rbPut = new JRadioButton();
				rbDelete = new JRadioButton();
		//Instanziere Senden-Button
				btnBetriebSend = new JButton("Send");
				btnBetriebSend.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
							try {
								BetriebSend();
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
				rbGet.setBounds(5,10,400,25);
				rbGetOne.setBounds(5,40,400,25);
				rbPost.setBounds(5,70,400,25);
				rbPut.setBounds(5,100,400,25);
				rbDelete.setBounds(5,130,400,25);
				tfEintragsID.setBounds(5,150,400,25);
				btnBetriebSend.setBounds(5,240,200,30);
		     	
				// Elemente dem Fenster hinzufügen:
				this.getContentPane().add(rbGet);
				this.getContentPane().add(rbGetOne);
				this.getContentPane().add(rbPost);
				this.getContentPane().add(rbPut);
				this.getContentPane().add(rbDelete);
				this.getContentPane().add(btnBetriebSend);
				this.getContentPane().add(tfEintragsID);
				this.pack();

				try {
					Client.connect();
				} catch (XMPPException e) {
					// TODO Auto-generated catch block
					System.out.println("Fehler beim Verbindungsaufbau.");
				}
			}
				public void BetriebSend() throws FileNotFoundException, JAXBException
				{
					int EintragsID = 0;
					try {
					EintragsID = Integer.parseInt(tfEintragsID.getText());
					} catch (NumberFormatException e) {
					// Fehlerbehandlung
					}
				if(rbGetOne.isSelected()){
					BetriebService.leseBetrieb(EintragsID);
				}
				else if(rbGet.isSelected()){
					BetriebService.leseBetriebe();
				}
				/*
				else if(rbPut.isSelected()){
					BetriebService.aenderBetrieb(EintragsID, betrieb);
				}*/
				else if(rbDelete.isSelected()){
					BetriebService.loescheBetrieb(EintragsID);
				}
		
	}
		private void Person() {
					//Allgemeines
							this.setTitle("OrderHero: Person");
							this.setResizable(false);
					// Instanzieren:
							tfPersonID = new JTextField();
					//Instanziere Radio-Buttons
					//zunachst nur Auswahl ueber 4 Bereiche
							rbGet = new JRadioButton();
							rbGet.setSelected(true);
							rbGetOne = new JRadioButton();
							rbPost = new JRadioButton();
							rbPut = new JRadioButton();
							rbDelete = new JRadioButton();
					//Instanziere Senden-Button
							btnPersonSend = new JButton("Send");
							btnPersonSend.addActionListener(new ActionListener() {

								public void actionPerformed(ActionEvent arg0) {
									// TODO Auto-generated method stub
										try {
											PersonSend();
										} catch (FileNotFoundException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										} catch (JAXBException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
								}});

							// Positionen festlegen
							rbGet.setBounds(5,10,400,25);
							rbGetOne.setBounds(5,40,400,25);
							rbPost.setBounds(5,70,400,25);
							rbPut.setBounds(5,100,400,25);
							rbDelete.setBounds(5,130,400,25);
							tfPersonID.setBounds(5,150,400,25);
							btnPersonSend.setBounds(5,240,200,30);
					     	
							// Elemente dem Fenster hinzufügen:
							this.getContentPane().add(rbGet);
							this.getContentPane().add(rbGetOne);
							this.getContentPane().add(rbPost);
							this.getContentPane().add(rbPut);
							this.getContentPane().add(rbDelete);
							this.getContentPane().add(btnPersonSend);
							this.getContentPane().add(tfPersonID);
							this.pack();

							try {
								Client.connect();
							} catch (XMPPException e) {
								// TODO Auto-generated catch block
								System.out.println("Fehler beim Verbindungsaufbau.");
							}
						}
							public void PersonSend() throws FileNotFoundException, JAXBException
							{
								int PersonID = 0;
								try {
								PersonID = Integer.parseInt(tfPersonID.getText());
								} catch (NumberFormatException e) {
								// Fehlerbehandlung
								}
							if(rbGetOne.isSelected()){
								PersonService.lesePerson(PersonID);
							}
							else if(rbGet.isSelected()){
								PersonService.lesePersonen();
							}
							/*else if(rbPost.isSelected()){
								PersonService.erstellePerson(person);
							}
							else if(rbPut.isSelected()){
								PersonService.personaendern(PersonID, person);
							}*/
							else if(rbDelete.isSelected()){
								PersonService.personloeschen(PersonID);
							}
					
				}	
							
private void Bestellung() {
											
	//Allgemeines
	this.setTitle("OrderHero: Bestellung");
	this.setResizable(false);
	// Instanzieren:
	tfBestellungsID = new JTextField();
	//Instanziere Radio-Buttons
	//zunachst nur Auswahl ueber 4 Bereiche
	rbGet = new JRadioButton();
	rbGet.setSelected(true);
	rbGetOne = new JRadioButton();
	rbPost = new JRadioButton();
	//Instanziere Senden-Button
	btnBestellungSend = new JButton("Send");
	btnBestellungSend.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				BestellungSend();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}});
	
	// Positionen festlegen
	rbGet.setBounds(5,10,400,25);
	rbGetOne.setBounds(5,40,400,25);
	rbPost.setBounds(5,70,400,25);
	tfBestellungsID.setBounds(5,100,400,25);
	btnBestellungSend.setBounds(5,200,200,30);
	
	// Elemente dem Fenster hinzufügen:
	this.getContentPane().add(rbGet);
	this.getContentPane().add(rbGetOne);
	this.getContentPane().add(rbPost);
	this.getContentPane().add(btnBestellungSend);
	this.getContentPane().add(tfBestellungsID);	
	this.pack();

	try {
		Client.connect();		
	} catch (XMPPException e) {
		// TODO Auto-generated catch block
		System.out.println("Fehler beim Verbindungsaufbau.");	
	}	
}
public void BestellungSend() throws FileNotFoundException, JAXBException

{
	int BestellungsID = 0;
	try {
		BestellungsID = Integer.parseInt(tfBestellungsID.getText());
	} catch (NumberFormatException e) {
		// Fehlerbehandlung	
	}
	if(rbGetOne.isSelected()){
		BestellungService.leseBestellung(BestellungsID);	
	}
	else if(rbGet.isSelected()){
		BestellungService.leseBestellungen();	
	}
	/*else if(rbPost.isSelected()){
	BestellungService.erstelleBestellung(bestellung);
	}*/
	}

private void Boerse() {
								//Allgemeines
										this.setTitle("OrderHero: Boerse");
										this.setResizable(false);
								// Instanzieren:
										tfBoersenEintragsID = new JTextField();
								//Instanziere Radio-Buttons
										rbGet = new JRadioButton();
										rbGet.setSelected(true);
										rbGetOne = new JRadioButton();
										rbPost = new JRadioButton();
										rbPostKommentar = new JRadioButton();
										rbDelete = new JRadioButton();
										rbPublish = new JRadioButton();
										rbSubscribe = new JRadioButton();
								//Instanziere Senden-Button
										btnBoerseSend = new JButton("Send");
										btnBoerseSend.addActionListener(new ActionListener() {

											public void actionPerformed(ActionEvent arg0) {
												// TODO Auto-generated method stub
													try {
														BestellungSend();
													} catch (FileNotFoundException e) {
														// TODO Auto-generated catch block
														e.printStackTrace();
													} catch (JAXBException e) {
														// TODO Auto-generated catch block
														e.printStackTrace();
													}
											}});

										// Positionen festlegen
										rbGet.setBounds(5,10,400,25);
										rbGetOne.setBounds(5,40,400,25);
										rbPost.setBounds(5,70,400,25);
										rbPostKommentar.setBounds(5,100,400,25);
										rbDelete.setBounds(5,130,400,25);
										rbPublish.setBounds(5,160,400,25);
										rbSubscribe.setBounds(5,190,400,25);
										tfBoersenEintragsID.setBounds(5,220,400,25);
										btnBoerseSend.setBounds(5,250,200,30);
								     	
										// Elemente dem Fenster hinzufügen:
										this.getContentPane().add(rbGet);
										this.getContentPane().add(rbGetOne);
										this.getContentPane().add(rbPost);
										this.getContentPane().add(rbPostKommentar);
										this.getContentPane().add(rbDelete);
										this.getContentPane().add(rbPublish);
										this.getContentPane().add(rbSubscribe);
										this.getContentPane().add(btnBoerseSend);
										this.getContentPane().add(tfBoersenEintragsID);
										this.pack();

										try {
											Client.connect();
										} catch (XMPPException e) {
											// TODO Auto-generated catch block
											System.out.println("Fehler beim Verbindungsaufbau.");
										}
									}
		public void BoerseSend() throws FileNotFoundException, JAXBException
										{
											int BoersenEintragsID = 0;
											try {
												BoersenEintragsID = Integer.parseInt(tfBoersenEintragsID.getText());
											} catch (NumberFormatException e) {
											// Fehlerbehandlung
											}
										if(rbGetOne.isSelected()){
											BoersenService.getEintrag(BoersenEintragsID);
										}
										else if(rbGet.isSelected()){
											BoersenService.getBoerse();
										}
										/*else if(rbPost.isSelected()){
											BoersenService.erstelleEintrag(boersenEintrag);
										}
										else if(rbPostKommentar.isSelected()){
											BoersenService.erstelleKommentar(kommentar);
										}*/
										else if(rbDelete.isSelected()){
											BoersenService.eintragloeschen(BoersenEintragsID);
										}
										else if(rbPublish.isSelected()){
											this.Publisher();
										}
										else if(rbSubscribe.isSelected()){
											this.Subscriber();
										}
							}

private void Subscriber(){
	//Allgemeines
		this.setTitle("OrderHero: Boerse - Subscribe");
		this.setResizable(false);
	//Instanziere Radio-Buttons
		rbFisch = new JRadioButton();
		rbFisch.setSelected(true);
		rbFleisch = new JRadioButton();
		rbGemuese = new JRadioButton();
		
		rbNodeAbonnieren = new JRadioButton();
		rbNodeAbonnieren.setSelected(true);
		rbNodeDeabonnieren = new JRadioButton();
		rbNachrichtenLesen = new JRadioButton();
		rbNodeInformationenLesen = new JRadioButton();
		
	//Button-Gruppen erstellen
		ButtonGroup nodes = new ButtonGroup();
	    nodes.add(rbFisch);
	    nodes.add(rbFleisch);
	    nodes.add(rbGemuese);
	    
	    ButtonGroup aktionen = new ButtonGroup();
	    aktionen.add(rbNodeAbonnieren);
	    aktionen.add(rbNodeDeabonnieren);
	    aktionen.add(rbNachrichtenLesen);
	    aktionen.add(rbNodeInformationenLesen);
	    
	//Instanziere Senden-Button
		btnSubscribeSend = new JButton("Send");
		btnSubscribeSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
					try {
						SubscribeSend();
					} catch (XMPPException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}
		});
	
		// Positionen festlegen
		rbFisch.setBounds(5,10,400,25);
		rbFleisch.setBounds(5,40,400,25);
		rbGemuese.setBounds(5,70,400,25);
		rbNodeAbonnieren.setBounds(5,100,400,25);
		rbNodeDeabonnieren.setBounds(5,130,400,25);
		rbNachrichtenLesen.setBounds(5,160,400,25);
		btnPublishSend.setBounds(5,200,200,30);
	 	
		// Elemente dem Fenster hinzufügen:
		this.getContentPane().add(rbFisch);
		this.getContentPane().add(rbFleisch);
		this.getContentPane().add(rbGemuese);
		this.getContentPane().add(rbNodeAbonnieren);
		this.getContentPane().add(rbNodeDeabonnieren);
		this.getContentPane().add(rbNachrichtenLesen);
		this.getContentPane().add(btnSubscribeSend);
		this.pack();
	
		try {
			Client.connect();
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			System.out.println("Fehler beim Verbindungsaufbau.");
		}
	}
		public void SubscribeSend() throws XMPPException
		{
		if(rbFisch.isSelected() && rbNodeAbonnieren.isSelected()){
			Subscriber.abonniereFisch();}	
		else if(rbFisch.isSelected() && rbNodeDeabonnieren.isSelected()){
			Subscriber.deabonniereFisch();}
		else if(rbFisch.isSelected() && rbNachrichtenLesen.isSelected()){
			Subscriber.leseFischNachrichten();}
		else if(rbFisch.isSelected() && rbNodeInformationenLesen.isSelected()){
			Subscriber.leseNodeInformationen();}
		
		else if(rbFleisch.isSelected() && rbNodeAbonnieren.isSelected()){
			Subscriber.abonniereFleisch();}	
		else if(rbFleisch.isSelected() && rbNodeDeabonnieren.isSelected()){
			Subscriber.deabonniereFleisch();}
		else if(rbFleisch.isSelected() && rbNachrichtenLesen.isSelected()){
			Subscriber.leseFleischNachrichten();}
		else if(rbFleisch.isSelected() && rbNodeInformationenLesen.isSelected()){
			Subscriber.leseNodeInformationen();}
		
		else if(rbGemuese.isSelected() && rbNodeAbonnieren.isSelected()){
			Subscriber.abonniereGemuese();}	
		else if(rbGemuese.isSelected() && rbNodeDeabonnieren.isSelected()){
			Subscriber.deabonniereGemuese();}
		else if(rbGemuese.isSelected() && rbNachrichtenLesen.isSelected()){
			Subscriber.leseGemueseNachrichten();}
		else if(rbGemuese.isSelected() && rbNodeInformationenLesen.isSelected()){
			Subscriber.leseNodeInformationen();}	
		}
		
private void Publisher(){
			//Allgemeines
				this.setTitle("OrderHero: Boerse - Publish");
				this.setResizable(false);
			//Instanziere Radio-Buttons
				rbFisch = new JRadioButton();
				rbFisch.setSelected(true);
				rbFleisch = new JRadioButton();
				rbGemuese = new JRadioButton();
				
				rbNodeErstellen = new JRadioButton();
				rbNodeErstellen.setSelected(true);
				rbNodeLoeschen = new JRadioButton();
				rbNodeVeroeffentlichen = new JRadioButton();
				rbNodeMitPayloadVeroeffentlichen = new JRadioButton();
				rbAbonenntenLesen = new JRadioButton();
			//Button-Gruppen erstellen
				ButtonGroup nodes = new ButtonGroup();
			    nodes.add(rbFisch);
			    nodes.add(rbFleisch);
			    nodes.add(rbGemuese);
			    
			    ButtonGroup aktionen = new ButtonGroup();
			    aktionen.add(rbNodeErstellen);
			    aktionen.add(rbNodeLoeschen);
			    aktionen.add(rbNodeVeroeffentlichen);
			    aktionen.add(rbNodeMitPayloadVeroeffentlichen);
			    aktionen.add(rbAbonenntenLesen);
			//Instanziere Senden-Button
				btnPublishSend = new JButton("Send");
				btnPublishSend.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
							try {
								PublishSend();
							} catch (XMPPException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}}
				});
			
				// Positionen festlegen
				rbFisch.setBounds(5,10,400,25);
				rbFleisch.setBounds(5,40,400,25);
				rbGemuese.setBounds(5,70,400,25);
				rbNodeErstellen.setBounds(5,100,400,25);
				rbNodeLoeschen.setBounds(5,130,400,25);
				rbNodeVeroeffentlichen.setBounds(5,160,400,25);
				rbNodeMitPayloadVeroeffentlichen.setBounds(5,190,400,25);
				rbAbonenntenLesen.setBounds(5,220,400,25);
				btnPublishSend.setBounds(5,250,200,30);
			 	
				// Elemente dem Fenster hinzufügen:
				this.getContentPane().add(rbFisch);
				this.getContentPane().add(rbFleisch);
				this.getContentPane().add(rbGemuese);
				this.getContentPane().add(rbNodeErstellen);
				this.getContentPane().add(rbNodeLoeschen);
				this.getContentPane().add(rbNodeVeroeffentlichen);
				this.getContentPane().add(rbNodeMitPayloadVeroeffentlichen);
				this.getContentPane().add(rbAbonenntenLesen);
				this.getContentPane().add(btnPublishSend);
				this.pack();
			
				try {
					Client.connect();
				} catch (XMPPException e) {
					// TODO Auto-generated catch block
					System.out.println("Fehler beim Verbindungsaufbau.");
				}
			}
		public void PublishSend() throws XMPPException
				{
				if(rbFisch.isSelected() && rbNodeErstellen.isSelected()){
					Publisher.erstelleFischNode();}	
				else if(rbFisch.isSelected() && rbNodeLoeschen.isSelected()){
					Publisher.loescheFischNode();}
				else if(rbFisch.isSelected() && rbNodeVeroeffentlichen.isSelected()){
					Publisher.veroeffentlicheFisch();}
				else if(rbFisch.isSelected() && rbNodeMitPayloadVeroeffentlichen.isSelected()){
					Publisher.veroeffentlicheFischmitPayload();}
				else if(rbFisch.isSelected() && rbAbonenntenLesen.isSelected()){
					Publisher.leseFischAbonennten();}
				
				else if(rbFleisch.isSelected() && rbNodeErstellen.isSelected()){
					Publisher.erstelleFleischNode();}
				else if(rbFleisch.isSelected() && rbNodeLoeschen.isSelected()){
					Publisher.loescheFleischNode();}
				else if(rbFleisch.isSelected() && rbNodeVeroeffentlichen.isSelected()){
					Publisher.veroeffentlicheFleisch();}
				else if(rbFleisch.isSelected() && rbNodeMitPayloadVeroeffentlichen.isSelected()){
					Publisher.veroeffentlicheFleischmitPayload();}
				else if(rbFleisch.isSelected() && rbAbonenntenLesen.isSelected()){
					Publisher.leseFleischAbonennten();}
				
				else if(rbGemuese.isSelected() && rbNodeErstellen.isSelected()){
					Publisher.erstelleGemueseNode();}
				else if(rbGemuese.isSelected() && rbNodeLoeschen.isSelected()){
					Publisher.loescheGemueseNode();}
				else if(rbGemuese.isSelected() && rbNodeVeroeffentlichen.isSelected()){
					Publisher.veroeffentlicheGemuese();}
				else if(rbGemuese.isSelected() && rbNodeMitPayloadVeroeffentlichen.isSelected()){
					Publisher.veroeffentlicheGemuesemitPayload();}
				else if(rbGemuese.isSelected() && rbAbonenntenLesen.isSelected()){
					Publisher.leseGemueseAbonennten();}
		}

	public static void main(String[] args)
	{
	 AppWindow theAppWindow = new AppWindow();
	 theAppWindow.setBounds(10, 10, 430, 300);
	 theAppWindow.setVisible(true);
	}
	
}