import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Button01 extends JPanel implements ActionListener {
	
	private JLabel txtText;
	private Timer tm;
	private int contador = 0;
	private boolean rodando = false;
	
	
	public Button01(JLabel txtText) {
		
		
		
		this.txtText = txtText;
		
		setLayout(new GridLayout(3,1));
		
		JButton btn1 = new JButton("iniciar");	
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!rodando) {
					tm = new Timer();
					rodando = true;
				
				
				tm.scheduleAtFixedRate(new TimerTask() {
					
					@Override
					public void run() {
						contador++;
						int seg = contador % 60;
						int min = contador / 60;
						int hora = min /60;
						hora %= 60;
						txtText.setText(String.format("%02d:%02d:%02d", hora, min,seg));
						
					}
				}, 1000, 1000);
				
			}
			}});
		add(btn1);
		
		
		
	
		
		
		JButton btn3 = new JButton("zerar");	
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tm = new Timer();
				if(!rodando | rodando) {
				
					
				
				
				tm.scheduleAtFixedRate(new TimerTask() {
					
					@Override
					public void run() {
						tm.cancel();
						rodando = false;
						contador = 0;
						int seg = contador ;
						int min = contador ;
						int hora = min;
						txtText.setText(String.format("%02d:%02d:%02d", hora, min,seg));
					}
				}, 1000, 1000);
				
			}
			}});
		add(btn3);
		
		JButton btn4 = new JButton("zerar 2.0");	
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tm .cancel();
				if(rodando | !rodando) {
					tm.cancel();
					rodando = false;
					contador = 0;
					int seg = contador ;
					int min = contador ;
					int hora = min;
					txtText.setText(String.format("%02d:%02d:%02d", hora, min,seg));
				}
				
			}
		});
		add(btn4);
		
		
		JButton btn2 = new JButton("pausar");	
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tm .cancel();
				if(rodando | !rodando) {
					tm.cancel();
					
					rodando = false;
				}
				
			}
		});
		add(btn2);
		
		
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
