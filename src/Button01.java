import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Button01 extends JPanel implements ActionListener {
	
	private JTextField txtText;
	
	
	public Button01(JTextField txtText) {
		
		this.txtText = txtText;
		
		setLayout(new GridLayout(3,1));
		
		JButton btn1 = new JButton("iniciar");	
		btn1.addActionListener(this);
		add(btn1);
		JButton btn2 = new JButton("pausar");	
		btn1.addActionListener(this);
		add(btn2);
		JButton btn3 = new JButton("zerar");	
		btn1.addActionListener(this);
		add(btn3);
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
