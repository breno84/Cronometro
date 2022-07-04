import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Crono extends JFrame{
	
	public Crono() throws Exception {
		super("Cronometro");
		
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,350);
		setLocation(400, 200);
		
		setLayout(new BorderLayout());
		
		TextPanel textPanel = new TextPanel();
		add(BorderLayout.CENTER, textPanel);
		
		
		JPanel digitsPanel = new JPanel();
		digitsPanel.setLayout(new BorderLayout());
		
		add(BorderLayout.SOUTH, digitsPanel);
		
	}
	
	public static void main (String[] args) throws Exception{
		new Crono();
	}

}
