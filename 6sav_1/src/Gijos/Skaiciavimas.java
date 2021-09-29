package Gijos;

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

public class Skaiciavimas extends JFrame {

	private JPanel contentPane;
	private JTextField tfIki;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skaiciavimas frame = new Skaiciavimas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private boolean pirminis(int x) {
		for (int i =2; i<x; i++) {
			if(x%i ==0) {
				return false;
			}
		}
		
		return true;
	}
	/**
	 * Create the frame.
	 */
	public Skaiciavimas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfIki = new JTextField();
		tfIki.setBounds(26, 81, 157, 20);
		contentPane.add(tfIki);
		tfIki.setColumns(10);
		
		JButton btnSK = new JButton("New button");
		btnSK.setBounds(265, 80, 89, 23);
		contentPane.add(btnSK);
		
		JLabel lblAtsak = new JLabel("New label");
		lblAtsak.setBounds(26, 139, 157, 14);
		contentPane.add(lblAtsak);
		
		btnSK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int iki=Integer.parseInt(tfIki.getText());
				int total=0;
				for (int i=1; i<iki;i++) {
					if (pirminis(i)) total++;
					
				}
				lblAtsak.setText(""+total);
			}
		});
	}
}
