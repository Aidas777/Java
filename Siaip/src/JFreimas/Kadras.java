package JFreimas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kadras extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kadras frame = new Kadras();
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
	public Kadras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStac = new JLabel("Staviakampis");
		lblStac.setHorizontalAlignment(SwingConstants.CENTER);
		lblStac.setBounds(59, 66, 160, 67);
		
		lblStac.setBackground(Color.red);
		
		contentPane.add(lblStac);
		
		JButton btnNewButton = new JButton("Movinam");

		btnNewButton.setBounds(110, 209, 89, 23);
		contentPane.add(btnNewButton);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//				for (int i = 0; i<100;i=i+0.1) {
//					
//					lblStac.setBounds(i, i, i, i);
					
//				}
			}
			
		});
		
		
	}
}
