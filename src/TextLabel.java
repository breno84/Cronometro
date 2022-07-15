import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextLabel extends JPanel{
	
	private JLabel txtNumber;
	
	

	public void setTxtNumber(JLabel txtNumber) {
		this.txtNumber = txtNumber;
	}

	public TextLabel() {
		setLayout(new FlowLayout());
		
		txtNumber = new JLabel("00:00:00");
		txtNumber.setFont(new Font(txtNumber.getName(), Font.PLAIN, 80));
		txtNumber.setEnabled(false);
		add(txtNumber, BorderLayout.CENTER);
		
	}

	public JLabel getTxtNumber() {
		return txtNumber;
	}

	public static void setText(String format) {
		// TODO Auto-generated method stub
		
	}

	
	
}
