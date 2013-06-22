package swing;

import java.awt.Color;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Action;


public class gui_test {

private static JTextField tfBenutzername;

	public static void main(String[] args)
	{
		JFrame meinFrame = new JFrame("Beispiel Frame");
		meinFrame.setSize(500,500);
		
		
		Border bo = new LineBorder(Color.blue);
		//Erstellung einer Menüleiste
		JMenuBar bar = new JMenuBar();
		// Umrandung des Menüs
		bar.setBorder(bo);
		// neues Objekt der Klasse JMenu
		//JMenu menu = new JMenu("Produktliste");
		JMenu menu = new JMenu("Personen");
		JMenu menu2 = new JMenu("Betriebe");
		JMenu menu3 = new JMenu("Boerse");
		
		//Login Bereich
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(16, 19, 418, 114);
		meinFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		//Option einzelnen Eintrag mittels ID auswaehlen
		final JLabel lblBenutzername = new JLabel("Benutzername");
		lblBenutzername.setBounds(16, 22, 189, 16);
		panel.add(lblBenutzername);
		
		// Sendebutton
		 meinFrame.setTitle("JButton Beispiel");
	        JPanel panel2 = new JPanel();
	 
	        // JButton mit Text "Drück mich" wird erstellt
	        JButton button = new JButton("Drück mich");
	        button.
	        // JButton wird dem Panel hinzugefügt
	        panel2.add(button);
	 
	        meinFrame.add(panel2);
	 
	        // Fenstergröße wird so angepasst, dass 
	        // der Inhalt reinpasst    
	        meinFrame.pack();
		
			
		// Textfeld EintragsID
		tfBenutzername = new JTextField();
		tfBenutzername.setBounds(215, 16, 43, 28);
		panel.add(tfBenutzername);
		tfBenutzername.setColumns(1);
		
		
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
		/*// Trennlinie zwischen den Menüpunkten
		JSeparator sep = new JSeparator();
		menu.add(sep);
		menu2.add(sep);
		menu3.add(sep);
		menu4.add(sep);*/
		
		// Menü wird in der Menüleiste hinzugefügt
		bar.add(menu);
		bar.add(menu2);
		bar.add(menu3);
		// Menüleiste wird für Frame gesetzt
		meinFrame.setJMenuBar(bar);
		meinFrame.setVisible(true);
	}
	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "ok");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
		}
	}
