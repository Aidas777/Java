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

public class Sumatorius extends JFrame {

	private JPanel contentPane;
	private JTextField tfX;
	private JTextField tfY;
	private JLabel lblNewLabel;
	private JLabel lblAntrasSkaicius;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sumatorius frame = new Sumatorius();
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
	public Sumatorius() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 137);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfX = new JTextField();
		tfX.setBounds(10, 36, 144, 20);
		contentPane.add(tfX);
		tfX.setColumns(10);
		
		tfY = new JTextField();
		tfY.setBounds(164, 36, 144, 20);
		contentPane.add(tfY);
		tfY.setColumns(10);
		
		JButton skaiciuoti = new JButton("Skaiciuokti");
		skaiciuoti.setBounds(318, 35, 106, 23);
		contentPane.add(skaiciuoti);
		
		JLabel atsakymas = new JLabel("");
		atsakymas.setBounds(10, 69, 414, 14);
		contentPane.add(atsakymas);
		
		lblNewLabel = new JLabel("Pirmas skaicius:");
		lblNewLabel.setBounds(10, 11, 144, 14);
		contentPane.add(lblNewLabel);
		
		lblAntrasSkaicius = new JLabel("Antras skaicius:");
		lblAntrasSkaicius.setBounds(164, 11, 144, 14);
		contentPane.add(lblAntrasSkaicius);
		
		skaiciuoti.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(tfX.getText());
				int y = Integer.parseInt(tfY.getText());
				int suma= x+y;
				
				atsakymas.setText("Atsakymas yra: " + suma);
			}
		});
	}

}
