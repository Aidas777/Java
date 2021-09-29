package NdGrafik;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pasirinkimas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pasirinkimas frame = new Pasirinkimas();
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
	public Pasirinkimas() {
		setTitle("Pasirinkite");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1uX = new JButton("y =cos (x / 10 ) * x / 10");
		btn1uX.setBounds(50, 34, 200, 23);
		contentPane.add(btn1uX);
		
		JButton btnXSin = new JButton("y = sin ( x )");
		btnXSin.setBounds(50, 87, 200, 23);
		contentPane.add(btnXSin);
		
		
		btn1uX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanele mp=new MainPanele(new Grafikas() {
					@Override
					public int getY(double x) {
//						return (int) (x / 5.0);
						return (int) (Math.cos(x/10.0)*x/10);
					}
				});
				mp.setVisible(true);
				
			}
		});
		
		btnXSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanele mp=new MainPanele(new Grafikas() {
					@Override
					public int getY(double x) {
						return (int) ((Math.sin(x /10.0))*100);
					}
				});
				mp.setVisible(true);
			}
		});
	}
}
