package grafika;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Pagrindine extends JFrame {

	private JPanel contentPane;
	public static JTextField tfSk;
//	public static Pagrindine forma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pagrindine frame = new Pagrindine();
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
	public Pagrindine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pagrindine Forma");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(121, 30, 219, 14);
		contentPane.add(lblNewLabel);
		
		JButton btSkaiciuoti = new JButton("Skaiciuoti");
		btSkaiciuoti.setBounds(153, 96, 149, 23);
		contentPane.add(btSkaiciuoti);
		
		tfSk = new JTextField();
		tfSk.setBounds(185, 145, 86, 20);
		contentPane.add(tfSk);
		tfSk.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(87, 148, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		btSkaiciuoti.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Atsakymas atsakymasF=new Atsakymas(tfSk);
				atsakymasF.setVisible(true);
				
			}
		});
	}
}
