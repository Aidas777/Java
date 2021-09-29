import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.SwingConstants;

public class TxtLen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TxtLen frame = new TxtLen();
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
//	public void setTitle("as");
	
	public TxtLen() {
		setTitle("Á Ascii kodà");
		setName("ManoF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtA = new JTextArea();
		txtA.setLineWrap(true);
		txtA.setBounds(40, 59, 400, 123);
		txtA.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(txtA);
		
		JLabel lbMy = new ManoLb("\u012Eveskite tekst\u0105");
//		JLabel lbMy = new ManoLb("AAASDASDASD");
		lbMy.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbMy.setBounds(40, 34, 149, 16);
		contentPane.add(lbMy);
		
		JTextArea txtAscii = new JTextArea();
		txtAscii.setBounds(40, 220, 400, 166);
		txtAscii.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(txtAscii);
		
		JLabel lblNewLabel = new JLabel("Ascii kodas");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(40, 195, 400, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Teksto konvertorius \u012F Ascii kodà");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(40, 9, 400, 18);
		contentPane.add(lblNewLabel_1);
		
		txtA.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {}
			
			@Override
			public void keyReleased(KeyEvent e) {
				int Letters=(txtA.getText()).length();
	//			System.out.print(Letters);
				
				if (Letters==0) {
					lbMy.setText("\u012Eveskite tekst\u0105");
				} else {
					lbMy.setText("Ávestas simboliø skaièius: " +Integer.toString(Letters));
				}
				
				int r=0;
				String p="";
				String inTxt=txtA.getText();
				for (int i=0;i<inTxt.length();i++) {
					r = inTxt.charAt(i);
					p=p+Integer.toString(r);
//					System.out.print(r);
				}
				txtAscii.setText(p);
			}
			
			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
	}
}
