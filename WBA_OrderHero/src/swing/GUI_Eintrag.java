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
import java.io.File;
import java.io.FileNotFoundException;
	 
	class GUI_Eintrag extends JFrame
	{
	  /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	GUI_Eintrag(int id) throws FileNotFoundException, JAXBException
	 {	
		
		JLabel ausgabe = new JLabel("Eintrag:");
		
		setVisible(true);
		setTitle("B쉜se");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
		//Men체leiste
		Border bo = new LineBorder(Color.blue);
		//Erstellung einer Men체leiste
		JMenuBar bar = new JMenuBar();
		// Umrandung des Men체s
		bar.setBorder(bo);
		// neues Objekt der Klasse JMenu
		JMenu menu = new JMenu("Kommentar verfassen");
		JMenu menu2 = new JMenu("Bestellen");
		
		// Men체 wird in der Men체leiste hinzugef체gt
		bar.add(menu);
		bar.add(menu2);
		// Men체leiste wird f체r Frame gesetzt
		setJMenuBar(bar);
		add(bar);
		setVisible(true);
		
		ausgabe.setBounds(16, 137, 404, 77);
		getContentPane().add(ausgabe);
		ausgabe.setVisible(true);
		
		//Eintrag ausgeben
		BoersenService boerse = new BoersenService();
		Boerse leseEintrag = boerse.getEintrag(id);
		
		
		
		ausgabe.setText(ausgabe.getText() + leseEintrag);
		
    }

}
