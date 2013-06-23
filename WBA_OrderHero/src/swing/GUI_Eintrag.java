package swing;

import generated.Boerse;
import generated.Boerse.BoersenEintrag;
import minirestwebservice.BoersenService;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.xml.bind.JAXBException;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

class GUI_Eintrag extends JFrame {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	GUI_Eintrag(int id) throws FileNotFoundException, JAXBException {
		JLabel titel = new JLabel("Titel:");
		JLabel typ = new JLabel("Typ:");
		JLabel vorname = new JLabel("Vorname:");
		JLabel nachname = new JLabel("Nachname:");
		JLabel betriebname = new JLabel("Betriebname:");
		JLabel erstellungsdatum = new JLabel("Erstellungsdatum:");
		JLabel text = new JLabel("Text:");
		JLabel start = new JLabel("Startdatum:");
		JLabel ende = new JLabel("Ablaufdatum:");
		JLabel kommentar = new JLabel("Kommentare:");
		
		setBounds(100, 100, 550, 500);
		getContentPane().setLayout(null);
		setVisible(true);
		
		//Panel Bestellung
		JPanel panel_eintrag = new JPanel();
		panel_eintrag.setBorder(new TitledBorder(null, "Eintrag", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_eintrag.setBounds(6, 57, 527, 350);
		getContentPane().add(panel_eintrag);
		panel_eintrag.setLayout(null);

		// Men��leiste
		Border bo = new LineBorder(Color.blue);
		// Erstellung einer Men��leiste
		JMenuBar bar = new JMenuBar();
		// Umrandung des Men��s
		bar.setBorder(bo);
		// neues Objekt der Klasse JMenu
		JMenu menu = new JMenu("Optionen");

		// Men�� wird in der Men��leiste hinzugef��gt
		bar.add(menu);
		
		// Men��leiste wird f��r Frame gesetzt
		setJMenuBar(bar);
		add(bar);
		setVisible(true);

		// JMenuItems: Optionen
				JMenuItem itemL = new JMenuItem("Kommentar verfassen");
				JMenuItem itemG = new JMenuItem("Eintrag erstellen");
				JMenuItem itemS = new JMenuItem("Bestellen");
				menu.add(itemG);
				menu.add(itemL);
				menu.add(itemS);
				
		
		itemL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GUI_Eintrag_Erstellen();
				  }
			});
		itemG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GUI_Eintrag_Erstellen();
				  }
			});
		itemS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GUI_Bestellung();
				  }
			});
		
		titel.setBounds(16, 10, 404, 77);
		panel_eintrag.add(titel);
		titel.setVisible(true);
		
		typ.setBounds(16, 30, 404, 77);
		panel_eintrag.add(typ);
		typ.setVisible(true);
		
		vorname.setBounds(16, 50, 404, 77);
		panel_eintrag.add(vorname);
		vorname.setVisible(true);
		
		nachname.setBounds(16, 70, 404, 77);
		panel_eintrag.add(nachname);
		nachname.setVisible(true);
		
		betriebname.setBounds(16, 90, 404, 77);
		panel_eintrag.add(betriebname);
		betriebname.setVisible(true);
		
		erstellungsdatum.setBounds(16, 110, 404, 77);
		panel_eintrag.add(erstellungsdatum);
		erstellungsdatum.setVisible(true);
		
		text.setBounds(16, 130, 404, 77);
		panel_eintrag.add(text);
		text.setVisible(true);
		
		kommentar.setBounds(16, 150, 404, 77);
		panel_eintrag.add(kommentar);
		kommentar.setVisible(true);
		
		start.setBounds(16, 170, 404, 77);
		panel_eintrag.add(start);
		start.setVisible(true);
		
		ende.setBounds(16, 190, 404, 77);
		panel_eintrag.add(ende);
		ende.setVisible(true);

		// Eintrag ausgeben
		BoersenService boerse = new BoersenService();
		Boerse eintraege = boerse.getEintrag(id);
		for (BoersenEintrag e : eintraege.getBoersenEintrag()) {
			titel.setText(titel.getText() + e.getTitel());
			typ.setText(typ.getText() + e.getTyp());
			vorname.setText(vorname.getText() + e.getPerson().getVorname());
			nachname.setText(nachname.getText() + e.getPerson().getNachname());
			betriebname.setText(betriebname.getText() + e.getPerson().getBetrieb().getBetriebname());
			erstellungsdatum.setText(erstellungsdatum.getText() + e.getErstellungsdatum());
			text.setText(text.getText() + e.getInformationstext());
			//kommentare funktionieren noch nicht
			kommentar.setText(kommentar.getText() + e.getKommentare().toString());
			start.setText(start.getText() + e.getStartdatum());
			ende.setText(ende.getText() + e.getAblaufdatum());
		}
	}

}
