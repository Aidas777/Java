import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class KvLygtis extends JFrame {

	private JPanel contentPane;
	private JTextField tfA;
	private JTextField tfB;
	private JTextField tfC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KvLygtis frame = new KvLygtis();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public double apval(double x) {
		double y= (double) (int) (x*100)/100;
		return y;
	}

	/**
	 * Create the frame.
	 */
	public KvLygtis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfA = new JTextField();
		tfA.setBounds(65, 39, 86, 20);
		contentPane.add(tfA);
		tfA.setColumns(10);
		
		tfB = new JTextField();
		tfB.setBounds(65, 82, 86, 20);
		contentPane.add(tfB);
		tfB.setColumns(10);
		
		tfC = new JTextField();
		tfC.setBounds(65, 124, 86, 20);
		contentPane.add(tfC);
		tfC.setColumns(10);
		
		JLabel lbA = new JLabel("A:");
		lbA.setHorizontalAlignment(SwingConstants.CENTER);
		lbA.setBounds(10, 42, 30, 14);
		contentPane.add(lbA);
		
		JLabel lbB = new JLabel("B:");
		lbB.setHorizontalAlignment(SwingConstants.CENTER);
		lbB.setBounds(10, 85, 30, 14);
		contentPane.add(lbB);
		
		JLabel lbC = new JLabel("C:");
		lbC.setHorizontalAlignment(SwingConstants.CENTER);
		lbC.setBounds(10, 127, 30, 14);
		contentPane.add(lbC);
		
		JButton btSk = new JButton("Skaiciuoti");
		btSk.setBounds(251, 38, 110, 23);
		contentPane.add(btSk);
		
		JLabel lbAts = new JLabel(".");
		lbAts.setBounds(191, 85, 233, 14);
		contentPane.add(lbAts);
		
		
		btSk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double aa=Double.parseDouble(tfA.getText());
				double bb=Double.parseDouble(tfB.getText());
				double cc=Double.parseDouble(tfC.getText());
				
				double diskr= bb*bb - 4 * aa * cc;
				double ats = 0;
				double ats2=0;
				
				if (diskr >0) {
					ats = (double) (bb+Math.sqrt(diskr)) / 2* aa;
					ats2 = (double) (bb-Math.sqrt(diskr)) / 2* aa;
					lbAts.setText("x1 yra: "+apval(ats) + " // x2 yra: " + apval(ats2));
				} else if (diskr ==0) {
					ats = ats2= - bb / 2* aa;
					lbAts.setText("x1 yra: "+apval(ats) + " // x2 yra: " + apval(ats2));
				} else if (diskr <0 ){
					lbAts.setText("Diskriminantas <0: " +apval(diskr));
				}
				
				
				
			}
		});
	}
}
