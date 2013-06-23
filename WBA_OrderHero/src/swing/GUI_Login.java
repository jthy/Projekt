package swing;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

//import swing.gui.SwingAction;

public class GUI_Login {

	public static JTextField tfBenutzername;
	public static JPasswordField pwFeld = new JPasswordField();
	JPanel panel = new JPanel();

	
	public static void main(String[] args)
	{
		final JFrame meinFrame = new JFrame("OrderHero");
		meinFrame.setSize(500,500);
		
		// Login Bereich
		// Umrandung Login
		final JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(16, 30, 418, 114);
		meinFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		// Elementname
		final JLabel lblBenutzername = new JLabel("Benutzername");
		lblBenutzername.setBounds(16, 22, 189, 16);
		panel.add(lblBenutzername);
		
		final JLabel lblPasswort = new JLabel("Passwort");
		lblPasswort.setBounds(16,62, 189,16 );
		panel.add(lblPasswort);
		
		// Eingabefelder
		tfBenutzername = new JTextField();
		tfBenutzername.setBounds(215, 16, 43, 28);
		tfBenutzername.setSize(200, 30);
		panel.add(tfBenutzername);
		tfBenutzername.setColumns(1);
		
		//Passwortfeld wird erzeugt
		pwFeld = new JPasswordField();
		pwFeld.setBounds(215, 56, 43, 28);
		pwFeld.setSize(200, 30);
		panel.add(pwFeld);
		pwFeld.setColumns(1);
	
		tfBenutzername.setMaximumSize(new Dimension(100, 100));
		
		 //panel.setLayout(new GridBagLayout(1, 5));
		 
		// Button
			JButton btnLogin = new JButton("einloggen");
			btnLogin.setBounds(85, 120, 166, 29);
			panel.add(btnLogin);
			
			JButton btnRegisterieren = new JButton("registrieren");
			btnRegisterieren.setBounds(250, 120, 166, 29);
			panel.add(btnRegisterieren);
          
			// Login Kontrolle
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Benutzername=tfBenutzername.getText();
					/*String Passwort=pwFeld.getText();
					  if (Benutzername.equals("admin") && Passwort.equals("test123")) {*/
					GUI_Start page = new GUI_Start();
					page.setVisible(true);
					JLabel label = new JLabel("Welcome "+ Benutzername);
					label.setBounds(100,22, 189, 16);
					page.getContentPane().add(label);
					  
					 /* else{
					  System.out.println("enter the valid username and password");
					  JOptionPane.showInputDialog(this,"Incorrect login or password",
					"Error",JOptionPane.ERROR_MESSAGE);*/
					  }
				});
				
				
		meinFrame.setVisible(true);
 }
}