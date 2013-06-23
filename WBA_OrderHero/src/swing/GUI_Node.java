package swing;

import java.awt.Dimension;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class GUI_Node extends JFrame 
{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frameNode;
	 private static JLabel lblNodeWaehlen = new JLabel();
	 private static JLabel lblTitel  = new JLabel();
	 private static JLabel lblNachricht  = new JLabel();
	 JComboBox topicAuswahl = new JComboBox();
	 private static JTextField tfTitel = new JTextField();
	 private static JTextArea taText = new JTextArea();

	GUI_Node()
	  {
			initialize();
	}
	  
	  private void initialize() {
			frameNode = new JFrame();
			frameNode.setBounds(100, 100, 550, 500);
			//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frameNode.getContentPane().setLayout(null);
			frameNode.setVisible(true);
			
			// Publish
			JPanel panel_publish = new JPanel();
			panel_publish.setBorder(new TitledBorder(null, "Publisher", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_publish.setBounds(6, 57, 527, 214);
			frameNode.getContentPane().add(panel_publish);
			panel_publish.setLayout(null);
							
							final JLabel lblNodeWaehlen = new JLabel("Bitte Kategorie auswaehlen:");
							lblNodeWaehlen.setBounds(6, 22, 189, 16);
							panel_publish.add(lblNodeWaehlen);

							// manuell Liste hinzufügen
							 String[] Topics = {"Fleisch", "Fisch", "Gemüse"};
							 JComboBox topicAuswahl = new JComboBox(Topics);
							 topicAuswahl.setBounds(200,22,189,16);
							 //JList wird Panel hinzugefügt
							 panel_publish.add(topicAuswahl);
							 topicAuswahl.setVisible(true);
							 topicAuswahl.doLayout();
							 
							 // Titel mit Textfeld
							 JLabel lblTitel = new JLabel("Titel:");
								lblTitel.setBounds(6, 52, 189, 16);
								panel_publish.add(lblTitel);

								tfTitel = new JTextField();
								tfTitel.setBounds(200, 52, 189, 16);
								panel_publish.add(tfTitel);

								JLabel lblNachricht = new JLabel("Nachricht:");
								lblNachricht.setBounds(6, 82, 189, 16);
								panel_publish.add(lblNachricht);

								taText = new JTextArea("Was soll veroeffentlicht werden?");
								//taText.setEnabled(false);
								JScrollPane scr_ta_publishMessage = new JScrollPane(taText);
								scr_ta_publishMessage.setPreferredSize(new Dimension(309, 96));
								scr_ta_publishMessage.setBounds(200, 82, 309, 96);
								panel_publish.add(scr_ta_publishMessage);
								
}

public static void main(String[] args)
{
 GUI_Node gN = new GUI_Node();
 gN.initialize();
}
}