package LaikasBack;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;

public class TimeBack extends JFrame {

	private JPanel contentPane;
	private JTextField tfIn;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeBack frame = new TimeBack();
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
	public TimeBack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfIn = new JTextField();
		tfIn.setHorizontalAlignment(SwingConstants.CENTER);
		tfIn.setText("0");
		tfIn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfIn.setBounds(135, 22, 163, 26);
		contentPane.add(tfIn);
		tfIn.setColumns(10);
		
		JButton btnRun = new JButton("Skaiciuok");
		btnRun.setBounds(145, 190, 150, 23);
		contentPane.add(btnRun);
		
		JLabel lblrodom = new JLabel("0");
		lblrodom.setHorizontalAlignment(SwingConstants.CENTER);
		lblrodom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblrodom.setBounds(48, 73, 339, 63);
		contentPane.add(lblrodom);
		
		btnRun.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int pradzia = Integer.parseInt(tfIn.getText());
				LaikasBack lback= new LaikasBack(lblrodom, pradzia);
				lback.start();
			}
		});
		
	}

}
