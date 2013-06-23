package swing;

import generated.Bestellung;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import minirestwebservice.BestellungService;

	public class GUI_Bestellung {

		private JFrame frame;
		private final Action action = new SwingAction();
		JLabel anzahl = new JLabel("Anzahl:");
		JLabel produktID = new JLabel("ProduktID:");
		JLabel produktname = new JLabel("Produktname:");
		JLabel dauerauftrag = new JLabel("Bestellungsart:");
		JLabel zahlung = new JLabel("Zahlungsart:");
		JLabel erfolg = new JLabel("Die Bestellung wurde verschickt!");
		
		JTextField tfanzahl = new JTextField();
		JTextField tfproduktID = new JTextField();
		JTextField tfproduktname = new JTextField();
		JComboBox dauerauftragAuswahl = new JComboBox();
		JComboBox zahlungAuswahl = new JComboBox();
		

		/**
		 * Create the application.
		 */
		public GUI_Bestellung() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 550, 500);
			// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			//Panel Bestellung
			JPanel panel_bestellung = new JPanel();
			panel_bestellung.setBorder(new TitledBorder(null, "Bestellungsformular", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_bestellung.setBounds(6, 57, 527, 214);
			frame.getContentPane().add(panel_bestellung);
			panel_bestellung.setLayout(null);
			
			final JLabel anzahl = new JLabel("Anzahl:");
			anzahl.setBounds(16, 22, 189, 16);
			panel_bestellung.add(anzahl);
			
			tfanzahl.setBounds(215, 16, 43, 28);
			tfanzahl.setSize(200, 30);
			panel_bestellung.add(tfanzahl);
			tfanzahl.setColumns(1);
			
			produktID.setBounds(16, 50, 189, 16);
			panel_bestellung.add(produktID);
			
			tfproduktID.setBounds(215, 46, 43, 28);
			tfproduktID.setSize(200, 30);
			panel_bestellung.add(tfproduktID);
			tfproduktID.setColumns(1);
			
			produktname.setBounds(16, 80, 189, 16);
			panel_bestellung.add(produktname);
			
			tfproduktname.setBounds(215, 76, 43, 28);
			tfproduktname.setSize(200, 30);
			panel_bestellung.add(tfproduktname);
			tfproduktname.setColumns(1);
			
			dauerauftrag.setBounds(16, 110, 189, 16);
			panel_bestellung.add(dauerauftrag);
			
			 String[] Dauerauftrag = {"Dauerauftrag", "Einmalige_Bestellung"};
			 JComboBox dauerauftragAuswahl = new JComboBox(Dauerauftrag);
			 dauerauftragAuswahl.setBounds(215,106,43,28);
			 //JList wird Panel hinzugefügt
			 panel_bestellung.add(dauerauftragAuswahl);
			 dauerauftragAuswahl.setVisible(true);
			 dauerauftragAuswahl.doLayout();
			 
			zahlung.setBounds(16, 140, 189, 16);
			panel_bestellung.add(zahlung);
				
			String[] Zahlungsart = {"Rechnung", "Lastschrift","Vorkasse","PayPal", "Kreditkarte"};
			JComboBox zahlungAuswahl = new JComboBox(Zahlungsart);
			zahlungAuswahl.setBounds(215,136,43,28);
			//JList wird Panel hinzugefügt
			panel_bestellung.add(zahlungAuswahl);
			zahlungAuswahl.setVisible(true);
			zahlungAuswahl.doLayout();
			
			JButton btnsenden = new JButton("Bestellung absenden");
			btnsenden.setBounds(100, 300, 166, 29);
			frame.add(btnsenden);
			
			erfolg.setBounds(16, 330, 43, 28);
			erfolg.setSize(200, 30);
			panel_bestellung.add(erfolg);
			erfolg.setVisible(false);
			
			btnsenden.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int anz = 0;
					anz = Integer.parseInt(tfanzahl.getText());
					int id = 0;
					id = Integer.parseInt(tfproduktID.getText());
					String Zahlungsart = zahlung.getText();
					String Bestellungsart = dauerauftrag.getText();
					//String Produktname = tfproduktname.getText();
					
					
					Bestellung bestellung = new Bestellung();
					bestellung.setAnzahl(anz);
					bestellung.getProdukt().setProduktID(id);
					//bestellung.getProdukt().getProduktangaben().setProduktname(Produktname);
					bestellung.setZahlungsart(Zahlungsart);
					bestellung.setBestellungsart(Bestellungsart);
					
					BestellungService neu = new BestellungService();
					try {
						neu.erstelleBestellung(bestellung);
						erfolg.setVisible(true);
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
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

	

