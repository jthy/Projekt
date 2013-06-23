package swing;

import generated.Boerse;
import generated.Boerse.BoersenEintrag;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import minirestwebservice.BoersenService;

public class GUI_Boerse {

	private JFrame frame;
	private final Action action = new SwingAction();
	// private JLabel lblAusgabe;
	private JComboBox eintraege;
	private Object[] titels;
	private JButton loadSelectedEntryButton;
	private Boerse lastEntrys;

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
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		//Eintrag auswaehlen
		loadSelectedEntryButton = new JButton("Eintrag laden");
		loadSelectedEntryButton.setBounds(16, 100, 200, 20);
		frame.add(loadSelectedEntryButton);

		// Alle Einträge für die Combobox laden
		BoersenService boerse = new BoersenService();
		try {
			lastEntrys = boerse.getBoerse();
			ArrayList<String> a = new ArrayList<String>();
			for (BoersenEintrag be : lastEntrys.getBoersenEintrag()) {
				a.add(be.getTitel());
			}
			titels = a.toArray();
			eintraege = new JComboBox(titels);
			eintraege.setSelectedIndex(0);
			eintraege.setBounds(17, 50, 404, 30);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		frame.getContentPane().add(eintraege);
		frame.getContentPane().add(loadSelectedEntryButton);
		loadSelectedEntryButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					int listIndex = eintraege.getSelectedIndex();
					int entryId = lastEntrys.getBoersenEintrag().get(listIndex).getBoerseneintragsID();
					GUI_Eintrag page = new GUI_Eintrag(entryId);
					page.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}

				super.mouseClicked(e);
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Boerse", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(6, 17, 427, 114);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		frame.setVisible(true);
		frame.setVisible(true);
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
