package swing;


import generated.Boerse.BoersenEintrag;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import minirestwebservice.PersonService;

public class GUI_Eintrag_Erstellen {

	private JFrame frame;
	private final Action action = new SwingAction();
	JLabel titel = new JLabel("Titel:");
	JLabel typ = new JLabel("Typ:");
	JLabel PersonID = new JLabel("ID:");
	JLabel text = new JLabel("Text:");
	JLabel start = new JLabel("Startdatum:");
	JLabel ende = new JLabel("Ablaufdatum:");
	
	JTextField tftitel = new JTextField();
	JTextField tftyp = new JTextField();
	JTextField tfPersonID = new JTextField();
	JTextField tftext = new JTextField();
	JTextField tfstart = new JTextField();
	JTextField tfende = new JTextField();
	

	/**
	 * Create the application.
	 */
	public GUI_Eintrag_Erstellen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 500);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		//Panel Bestellung
		JPanel panel_eintrag = new JPanel();
		panel_eintrag.setBorder(new TitledBorder(null, "Eintrag erstellen", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_eintrag.setBounds(6, 57, 527, 350);
		frame.getContentPane().add(panel_eintrag);
		panel_eintrag.setLayout(null);
		
		titel.setBounds(16, 20, 189, 16);
		panel_eintrag.add(titel);
		titel.setVisible(true);
		
		tftitel.setBounds(215, 16, 43, 28);
		tftitel.setSize(200, 30);
		panel_eintrag.add(tftitel);
		tftitel.setColumns(1);
		
		typ.setBounds(16, 50, 189, 16);
		panel_eintrag.add(typ);
		typ.setVisible(true);
		
		tftyp.setBounds(215, 46, 43, 28);
		tftyp.setSize(200, 30);
		panel_eintrag.add(tftyp);
		tftyp.setColumns(1);
		
		PersonID.setBounds(16, 80, 189, 16);
		panel_eintrag.add(PersonID);
		PersonID.setVisible(true);
		
		tfPersonID.setBounds(215, 76, 43, 28);
		tfPersonID.setSize(200, 30);
		panel_eintrag.add(tfPersonID);
		tfPersonID.setColumns(1);
		
		text.setBounds(16, 110, 189, 16);
		panel_eintrag.add(text);
		text.setVisible(true);
		
		tftext.setBounds(215, 106, 43, 28);
		tftext.setSize(200, 30);
		panel_eintrag.add(tftext);
		tftext.setColumns(1);
		
		start.setBounds(16, 140, 189, 16);
		panel_eintrag.add(start);
		start.setVisible(true);
		
		tfstart.setBounds(215, 136, 43, 28);
		tfstart.setSize(200, 30);
		panel_eintrag.add(tfstart);
		tfstart.setColumns(1);
		
		ende.setBounds(16, 170, 189, 16);
		panel_eintrag.add(ende);
		ende.setVisible(true);
		
		tfende.setBounds(215, 166, 43, 28);
		tfende.setSize(200, 30);
		panel_eintrag.add(tfende);
		tfende.setColumns(1);
		
		JButton btnsenden = new JButton("Kommentar senden");
		btnsenden.setBounds(100, 300, 166, 29);
		panel_eintrag.add(btnsenden);
		
		btnsenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ID = 0;
				ID = Integer.parseInt(tfPersonID.getText());
				
				String titel = tftitel.getText();
				String typ = tftyp.getText();
				String text = tftext.getText();
				//String start = tfstart.getText().toString();
				//String ende = tfende.getText().toString();
				//TODO es muss automatisch das aktuelle datum ermittelt werden!!!
				
				PersonService person = new PersonService();
				//Personenliste personinfo = person.lesePerson(ID);
				
				
				BoersenEintrag neu = new BoersenEintrag();
				neu.setTitel(titel);
				//TODO: es muss die aktuelle länge der liste ermittelt werden für die id
				neu.setTyp(typ);
				neu.setInformationstext(text);
			}
		});
		
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
}
