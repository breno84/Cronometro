import java.awt.BorderLayout;
import java.awt.Button;

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
		add(BorderLayout.NORTH, textPanel);
		
		
		JPanel digitsPanel = new JPanel();
		digitsPanel.setLayout(new BorderLayout());
		
		add( digitsPanel);
		digitsPanel.add(BorderLayout.SOUTH,new Button01(textPanel.getTxtNumber()));
		
		
		
		
		setVisible(true);
		
	}
	
	public static void main (String[] args) throws Exception{
		new Crono();
	}

}
