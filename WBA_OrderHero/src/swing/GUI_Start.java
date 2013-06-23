package swing;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
class GUI_Start extends JFrame
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

GUI_Start()
 {
 //setDefaultCloseOperation(javax.swing.
  //WindowConstants.DISPOSE_ON_CLOSE);
 setTitle("Welcome");
 setSize(500, 500);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
//Men체leiste
 Border bo = new LineBorder(Color.blue);
	//Erstellung einer Menueleiste
	JMenuBar bar = new JMenuBar();
	// Umrandung des Menues
	bar.setBorder(bo);
	// neues Objekt der Klasse JMenu
	//JMenu menu = new JMenu("Produktliste");
	JMenu menu = new JMenu("Personen");
	JMenu menu2 = new JMenu("Betriebe");
	JMenu menu3 = new JMenu("Boerse");
	
	// Men체 wird in der Menueleiste hinzugefuegt
	bar.add(menu);
	bar.add(menu2);
	bar.add(menu3);
	// Men체leiste wird fuer Frame gesetzt
	setJMenuBar(bar);
	setVisible(true);
	
	// JMenuItems: Personen
			JMenuItem itemG = new JMenuItem("Gastronome");
			JMenuItem itemL = new JMenuItem("Lieferanten");
			menu.add(itemG);
			menu.add(itemL);
			// JMenuItems: Betrieb
			JMenuItem item = new JMenuItem("Betrieblisten");
			JMenuItem item2 = new JMenuItem("Produktlisten");
			menu2.add(item);
			menu2.add(item2);
			
			// JMenuItems: B쉜se
			JMenuItem itemA = new JMenuItem("Eintraege anzeigen");
			JMenuItem itemB = new JMenuItem("Eintrag erstellen");
			menu3.add(itemA);
			menu3.add(itemB);

			
			//MenuItem Boerse anzeigen
						itemA.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								new GUI_Boerse();
								  }
							});
						
						//Men체Item Boerse erstellen
						itemB.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								new GUI_Node();
								  }
							});
  }
  }
 