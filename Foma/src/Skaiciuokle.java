import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Skaiciuokle extends JFrame {

	private JPanel contentPane;
	private JTextField tfIlgis;
	private JTextField tfPlotis;
	private JTextField tfKaina;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skaiciuokle frame = new Skaiciuokle();
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
	public Skaiciuokle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfIlgis = new JTextField();
		tfIlgis.setBounds(21, 44, 86, 20);
		contentPane.add(tfIlgis);
		tfIlgis.setColumns(10);
		
		tfPlotis = new JTextField();
		tfPlotis.setBounds(282, 44, 86, 20);
		contentPane.add(tfPlotis);
		tfPlotis.setColumns(10);
		
		JLabel lbl1 = new JLabel("Ilgis");
		lbl1.setBounds(21, 11, 46, 14);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Plotis");
		lbl2.setBounds(282, 11, 46, 14);
		contentPane.add(lbl2);
		
		JButton btnSkaiciuoti = new JButton("Skaiciuoti");
		btnSkaiciuoti.setBounds(279, 75, 89, 23);
		contentPane.add(btnSkaiciuoti);
		
		tfKaina = new JTextField();
		tfKaina.setBounds(21, 107, 86, 20);
		contentPane.add(tfKaina);
		tfKaina.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Kaina");
		lblNewLabel_2.setBounds(21, 79, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(21, 181, 347, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Kaina");
		lblNewLabel_2_1.setBounds(21, 153, 347, 14);
		contentPane.add(lblNewLabel_2_1);
				
		
		btnSkaiciuoti.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double plotis=Double.parseDouble(tfPlotis.getText());
				double ilgis=Double.parseDouble(tfIlgis.getText());
				double kaina=Double.parseDouble(tfKaina.getText());
			}
		}); 
			

		
	}
}
