package swing;

import swing.*;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import xmpp.Publisher;

public class GUI_Nodes extends JFrame
{
	 private JFrame frameNode;
	 private static JTextField tfNodeName;
	 private static JTextField tfNodeTitel;
	 private static JTextArea taText;
	 private static JButton btnPublish;
	 static String Benutzername2 = GUI_Login.tfBenutzername.getText();
	 static String Passwort2=GUI_Login.pwFeld.getText();
	 private Publisher publisher = new Publisher();
	 private static JComboBox topicAuswahl = new JComboBox();

	 

  GUI_Nodes()
  {
		initialize();
}
  
  private void initialize() {
		frameNode = new JFrame();
		frameNode.setBounds(100, 100, 450, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameNode.getContentPane().setLayout(null);
		frameNode.setVisible(true);
			
			
			// Publish
		JPanel panel_publish = new JPanel();
		panel_publish.setBorder(new TitledBorder(null, "Publisher", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_publish.setBounds(6, 17, 427, 114);
		frameNode.getContentPane().add(panel_publish);
		panel_publish.setLayout(null);
						
						final JLabel lblNodeWählen = new JLabel("Bitte Kategorie auswählen:");
						lblNodeWählen.setBounds(6, 22, 189, 16);
						panel_publish.add(lblNodeWählen);

						// manuell Liste hinzufügen
						 String[] Topics = {"Fleisch", "Fisch", "Gemüse"};
						 JComboBox topicAuswahl = new JComboBox(Topics);
						 topicAuswahl.setBounds(200,22,189,16);
						 //JList wird Panel hinzugefügt
						 panel_publish.add(topicAuswahl);
						 topicAuswahl.setVisible(true);
					        
						/*cb_allTopics = new JComboBox<String>(fullListItems);
						cb_allTopics.setBounds(120, 370, 150, 20);
						cb_allTopics.setEnabled(false);
						frameNode.add(cb_allTopics);*/

						/*JLabel lblNodeTitel = new JLabel("Titel:");
						lblNodeTitel.setBounds(20, 400, 150, 20);
						frameNode.add(lblNodeTitel);

						tfNodeTitel = new JTextField(255);
						tfNodeTitel.setBounds(120, 400, 150, 20);
						tfNodeTitel.setEnabled(false);
						frameNode.add(tfNodeTitel);

						JLabel lblNachricht = new JLabel("Nachricht:");
						lblNachricht.setBounds(20, 430, 150, 20);
						frameNode.add(lblNachricht);

						taText = new JTextArea("Was soll gepublished werden?");
						taText.setEnabled(false);
						JScrollPane scr_ta_publishMessage = new JScrollPane(taText);
						scr_ta_publishMessage.setPreferredSize(new Dimension(270, 100));
						scr_ta_publishMessage.setBounds(120, 430, 270, 100);
						frameNode.add(scr_ta_publishMessage);

						//TODO PUBLISH
						btnPublish = new JButton("Publishen");
						btnPublish.setBounds(120, 540, 150, 20);
						btnPublish.setEnabled(false);*/
						//btnPublish.addActionListener(new ActionListener() {
							//@Override
							//public void actionPerformed(ActionEvent e) {
								//boolean errorFound = false;

								//if(taText.getText().isEmpty()) {
									//errorFound = true;
									//throwError(frameNode, "Fehler: Bitte Nachricht eingeben!");
								//}

								//if(errorFound == false) {
									//!!String cb_allTopicsSelected = stripFormat(cb_allTopics.getSelectedItem().toString());
									//String ta_publishMessageText = taText.getText();
									//String tf_nodeTitleText = tfNodeTitel.getText();

									//publisher.erstelleFischNode()/*(tf_nodeTitleText, ta_publishMessageText))*/;
									//!!throwMessage(window,"Success!\n" + cb_allTopicsSelected + "\n" + ta_publishMessageText);
								//}
							//}
						//});
						//frameNode.add(btnPublish);

						
	// Anlegen neuer Nodes
				/*JLabel lbl_nodes_create = new JLabel("Nodes anlegen");
				lbl_nodes_create.setBounds(410, 340, 350, 20);
				lbl_nodes_create.setFont(lbl_nodes_create.getFont().deriveFont(Font.BOLD));
				add(lbl_nodes_create);

				JLabel lbl_parent = new JLabel("Parent waehlen:");
				lbl_parent.setBounds(410, 370, 150, 20);
				add(lbl_parent);

				/*cb_allTopics2 = new JComboBox<String>(fullListItems);
				cb_allTopics2.setBounds(530, 370, 150, 20);
				cb_allTopics2.setEnabled(false);
				window.add(cb_allTopics2);*/

				/*JLabel lbl_name = new JLabel("Name:");
				lbl_name.setBounds(410, 400, 150, 20);
				add(lbl_name);

				tfNodeName = new JTextField(255);
				tfNodeName.setBounds(530, 400, 150, 20);
				tfNodeName.setEnabled(false);
				add(tfNodeName);

				JButton btnCreateNode = new JButton("Node anlegen");
				btnCreateNode.setBounds(534, 440, 143, 20);
				btnCreateNode.setEnabled(false);*/
				/*btnCreateNode.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						boolean errorFound = false;*/
						/*!!
						if(btn_createnode.isEnabled()) {
							throwMessage(window, "aktiv");
						} else {
							throwMessage(window, "inaktiv");
						}!!
						*/
						/*if(tfNodeName.getText().length() == 0) {
							errorFound = true;
							throwError(frameNode,"Fehler: Bitte Namen eingeben!");
						}

						if(errorFound == false) {*/
							//!!String cb_allTopics2Selected = stripFormat(cb_allTopics2.getSelectedItem().toString());
							//String tf_nodeNameText = tfNodeName.getText();

							/*if(!publisher.createCollectionNode(tf_nodeNameText, cb_allTopics2Selected)){
								throwMessage(window,"Fail!\n" + tf_nodeNameText + " can not be created!");*/
							//}

							/*!!try {
								refreshLists();
							} catch (XMPPException e1) {
								e1.printStackTrace();
							}!!*/
						}
					
				//});
				//frameNode.add(btnCreateNode);
				
				
//}
  				
  				
				//public static void throwError(JFrame window, String message) {
					//JOptionPane.showMessageDialog(window, message, "Error!", JOptionPane.ERROR_MESSAGE);
				//}
				/*public static void main(String[] args)
				{
				 GUI_Nodes g = new GUI_Nodes();
				 g.initialize();
				}*/
				
}
