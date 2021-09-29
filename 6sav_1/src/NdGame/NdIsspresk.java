package NdGame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class NdIsspresk extends JFrame {

	private JPanel contentPane;
	private JTextField tfIn;
	public String uzd;
	public JLabel lblUzd;
	public int ats;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NdIsspresk frame = new NdIsspresk();
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
//	public String Uzduotys();
	
	public NdIsspresk() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		Uzduotys u = new Uzduotys(lblUzd);
//		uzd=u.getUzduotys();
//		ats=u.getAts();
		
		int a = (int) (Math.random()*10);
		int b = (int) (Math.random()*10);
		
		int atsa = 0;
		String veiksmas = "";
		if (a<=5) {
			a++;
			veiksmas="*";
			atsa = a*b;
			this.ats=atsa;
		} else {
			veiksmas="+";
			atsa = a+b;
			this.ats=atsa;
		}
		String uzd = a + " " + veiksmas +" " + b + " =";
		

		
		JLabel lblUzd = new JLabel("Spauskite pradeti");
//		JLabel lblUzd = new JLabel("Zuduotis");
		lblUzd.setHorizontalAlignment(SwingConstants.CENTER);
		lblUzd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUzd.setBounds(180, 60, 140, 38);
		contentPane.add(lblUzd);
		
		tfIn = new JTextField();
		tfIn.setHorizontalAlignment(SwingConstants.CENTER);
		tfIn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfIn.setBounds(210, 115, 80, 30);
		contentPane.add(tfIn);
		tfIn.setColumns(10);
		
		JButton btnCh = new JButton("Pradeti");
		btnCh.setBounds(210, 183, 80, 23);
		contentPane.add(btnCh);
		
		JLabel lblTime = new JLabel("0");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTime.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTime.setBounds(280, 11, 170, 38);
		contentPane.add(lblTime);
		
//		 u = new Uzduotys(lblUzd);
		
		System.out.println(uzd + " " + ats);
		
		btnCh.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnCh.setText("Tikrinti");
				
				TimeBack tback = new TimeBack(lblTime);
				tback.start();
				
				lblUzd.setText(uzd);
				
				if (btnCh.getText().equals("Tikrinti")) {
					if (tfIn.getText().equals("")) tfIn.setText(""+0);
//					if (this.ats==null) ats=0;
					if (Integer.parseInt(tfIn.getText()) == ats) {
						System.out.println("Atspejai !!!");
					} else {
						System.out.println("NEatspejai ! Bandyk is naujo ... ");
					}
				}
				
//				Uzduotys u = new Uzduotys(lblUzd);
//				this.uzd=u.getUzduotys();
//				ats=u.getAts();
////				Uzduotys u = new Uzduotys(lblUzd);
//				System.out.println(uzd + " " + ats);
			}
		});

	}


}
