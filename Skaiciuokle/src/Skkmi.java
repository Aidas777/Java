import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Skkmi extends JFrame {
	private JTextField mase;
	private JTextField ugis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skkmi frame = new Skkmi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Skkmi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 288);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Iveskite mase kg");
		lblNewLabel.setBounds(55, 79, 161, 14);
		getContentPane().add(lblNewLabel);
		
		mase = new JTextField();
		mase.setBounds(55, 104, 161, 20);
		getContentPane().add(mase);
		mase.setColumns(10);
		
		ugis = new JTextField();
		ugis.setBounds(256, 104, 128, 20);
		getContentPane().add(ugis);
		ugis.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Iveskite ugi cm");
		lblNewLabel_1.setBounds(256, 79, 128, 14);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Skaiciuoti");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(181, 139, 128, 23);
		getContentPane().add(btnNewButton);
		
		JLabel rezult = new JLabel("");
		rezult.setBounds(55, 192, 229, 20);
		getContentPane().add(rezult);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double svoriss=Double.parseDouble(mase.getText());
				double ugiss=Double.parseDouble(ugis.getText());
				
				double kmi= svoriss /Math.pow(ugiss/100, 2);
//				rezult.setText("kmi yra: " + kmi);
				
				if (kmi<=18.5) rezult.setText("Permazas svoris");
				if (kmi>18.5 && kmi <=24.9) rezult.setText("Norm svoris");
				if (kmi>24.9 && kmi <=29.9) rezult.setText("Antsvoris");
				if (kmi>=29) rezult.setText("Nutukimas");
				
			}
		});
		
	
	}
}
