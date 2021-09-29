package grafika;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Atsakymas extends JFrame {

	private JPanel contentPane;
	public JLabel lbAts;
	
	private JTextField laukas;
	private JButton btRefr;


	/**
	 * Create the frame.
	 */
	public Atsakymas() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 429, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.lbAts = new JLabel("New label");
		this.lbAts.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.lbAts.setBounds(171, 112, 100, 100);
		contentPane.add(this.lbAts);
		
		btRefr = new JButton("Atnaujinti");
		btRefr.setBounds(250, 247, 141, 35);
		contentPane.add(btRefr);
		
	//	int sk=Integer.parseInt(Pagrindine.tfSk.getText());
		
		btRefr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int i =Integer.parseInt(laukas.getText());
				lbAts.setText( ""+(i*i));
				
			}
		}); {
			
		}
		
	}
	
	public Atsakymas(JTextField tf) {
		this();
		this.laukas=tf;
		
		int i =Integer.parseInt(this.laukas.getText());
		this.lbAts.setText( ""+(i*i));
	}

}
