package swing;

import java.awt.event.*;
import java.io.FileNotFoundException;

import javax.swing.*;
import javax.xml.bind.JAXBException;

import org.jivesoftware.smack.XMPPException;

import minirestwebservice.*;
import xmpp.*;

public class OrderHeroGUI extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private final Action action = new SwingAction();
	private JLabel lblAusgabe;
    private JSpinner spinner;
    
	public OrderHeroGUI(){
		
		this.getContentPane().setLayout(null);
		this.initWindow();
		this.addWindowListener(new WindowListener() {
			public void windowClosed(WindowEvent arg0) {}
			public void windowActivated(WindowEvent e) {}
			public void windowClosing(WindowEvent e) {
				System.exit(0);}
			public void windowDeactivated(WindowEvent e) {}
			public void windowDeiconified(WindowEvent e) {}
			public void windowIconified(WindowEvent e) {}
			public void windowOpened(WindowEvent e) {}
		});

	}
	protected void initWindow(){
		//Allgemeines
		this.setTitle("OrderHero: Boerse");
		this.setResizable(false);
	}
	public static void main(String[] args)
	{
	 AppWindow theAppWindow = new AppWindow();
	 theAppWindow.setBounds(10, 10, 430, 300);
	 theAppWindow.setVisible(true);
	}
}
