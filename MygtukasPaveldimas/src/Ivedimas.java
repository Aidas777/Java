import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Ivedimas extends JFrame {

	private JPanel contentPane;
	private JTextField tfIn;
	private JLabel lbMano;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ivedimas frame = new Ivedimas();
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
	public Ivedimas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfIn = new JTextField();
		tfIn.setBounds(10, 77, 275, 20);
		contentPane.add(tfIn);
		tfIn.setColumns(10);
		
		JButton btnIn = new JButton("New button");
		btnIn.setBounds(307, 76, 117, 23);
		contentPane.add(btnIn);
		
		JLabel bLabel = new BigLabel("New label");
//		JLabel lbMano8 = new MyLbl("Antraste");
		
		
		bLabel.setBounds(10, 122, 414, 14);
		contentPane.add(bLabel);
		
		
		btnIn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String txt = tfIn.getText();
				String adTxt = "Labas vakaras";
				String alltxt = adTxt+" "+txt;
				bLabel.setText(alltxt);
				
//				myLbl.setText(adTxt+" "+txt);
			}
		});
			

			
	
	}
}
