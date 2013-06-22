package swing;

import generated.Betriebliste;
import generated.Betriebliste.Betrieb;
import generated.Boerse;
import generated.Boerse.BoersenEintrag;

import javax.swing.*;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.xml.bind.JAXBException;

import minirestwebservice.BetriebService;
import minirestwebservice.BoersenService;

import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Choice;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSpinner;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.FlowLayout;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.border.TitledBorder;


public class GUI_Boerse {

	private JFrame frame;
	private final Action action = new SwingAction();
	private JLabel lblAusgabe;
	private JTextField tfEintragsID;
	/**
	 * Create the application.
	 */
	public GUI_Boerse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Auswahl der jeweiligen ID
		tfEintragsID = new JTextField();
		tfEintragsID.setBounds(211, 30, 37, 28);
		tfEintragsID.setColumns(1);
		frame.getContentPane().add(tfEintragsID);
		
		
		//Option alle Eintraege ueber Titel auszugeben
		JLabel lblAlleEintraegeAuswaehlen = new JLabel("Alle Eintraege auswaehlen:");
		lblAlleEintraegeAuswaehlen.setBounds(17, 70, 167, 16);
		frame.getContentPane().add(lblAlleEintraegeAuswaehlen);
		
		//Ausgabe der Eintraege oder des Eintrages
		lblAusgabe = new JLabel("Ausgabe: ");
		lblAusgabe.setBounds(17, 195, 404, 77);
		frame.getContentPane().add(lblAusgabe);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Boerse", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(6, 17, 427, 114);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		//Option einzelnen Eintrag mittels ID auswaehlen
		final JLabel lblEinzelnenEintragAuswaehlen = new JLabel("Einzelnen Eintrag auswaehlen:");
		lblEinzelnenEintragAuswaehlen.setBounds(6, 22, 189, 16);
		panel.add(lblEinzelnenEintragAuswaehlen);
		
		//Sende-Button
		JButton btnEintraege = new JButton("Eintraege");
		btnEintraege.setBounds(255, 46, 166, 29);
		panel.add(btnEintraege);
		btnEintraege.setAction(action);
		//Sende-Button
		Button button = new Button("Eintrag ausgeben");
		button.setBounds(279, 10, 138, 28);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					EintragSend();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (JAXBException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnEintraege.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
						EintraegeSend();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (JAXBException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		frame.setVisible(true);
		frame.setVisible(true);
	}
	
	public void EintraegeSend() throws FileNotFoundException, JAXBException {
		BoersenService boerse = new BoersenService();
		Boerse leseEintraege = boerse.getBoerse(); 
		
		for(BoersenEintrag be : leseEintraege.getBoersenEintrag()){
			final String titel  = be.getTitel();
			final int id = be.getBoerseneintragsID();
			lblAusgabe.setText(lblAusgabe.getText() + id + ". " + titel);
			//bei Klick auf Titel soll sich Fenster mit Eintrag šffnen
			lblAusgabe.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent arg0) {
					GUI_Eintrag page;
					try {
						page = new GUI_Eintrag(id);
						page.setVisible(true);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (JAXBException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			});
		}
	}
	public void EintragSend() throws FileNotFoundException, JAXBException{
		int EintragsID = 0;
		try {
		EintragsID = Integer.parseInt(tfEintragsID.getText());
		} catch (NumberFormatException e) {
		// Fehlerbehandlung
			lblAusgabe.setText("Eintrag existiert nicht!");
		}
		BoersenService boerse = new BoersenService();
		Boerse leseEintrag = boerse.getEintrag(EintragsID);
		for(BoersenEintrag id : leseEintrag.getBoersenEintrag()){
			String titel  = id.getTitel();
			lblAusgabe.setText(lblAusgabe.getText() + EintragsID + ". " + titel);
		}
	}
	class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "Eintraege ausgeben");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	public static void main(String[] args)
	{
	 GUI_Boerse g = new GUI_Boerse();
	 g.initialize();
	}
}
