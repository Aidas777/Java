import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Kvadratu extends JFrame {

	private JPanel contentPane;
	private JTextField tfSk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kvadratu frame = new Kvadratu();
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
	public Kvadratu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfSk = new JTextField();
		tfSk.setBounds(10, 34, 141, 20);
		contentPane.add(tfSk);
		tfSk.setColumns(10);
		
		JButton btnSK = new JButton("Skaiciuok");
		btnSK.setBounds(263, 33, 141, 23);
		contentPane.add(btnSK);
		
		JLabel lbAts = new JLabel("");
		lbAts.setBounds(10, 87, 141, 14);
		contentPane.add(lbAts);
		
		btnSK.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int x=Integer.parseInt(tfSk.getText());
				int ats=x*x;
				
				lbAts.setText("Atsakymas: "+ats);
			}
			
		});
		

	}

}
