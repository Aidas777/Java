package Langai;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vykdymas {

	public static void main(String[] args) {
		
		JFrame langas = new JFrame();
		langas.setBounds(300, 300, 500, 500);
		langas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		langas.setVisible(true);
		
		
		JPanel panele= new JPanel();
		panele.setLayout(new BorderLayout());;
		JButton mygtukas = new JButton("Mygtukas");
		langas.add(panele);
		
//		panele.setLayout(new BorderLayout());


//		
		JLabel tekstas = new JLabel("Tekstas");
//		MygtukoPaspaudimas mp=new MygtukoPaspaudimas(tekstas);
		
//		
		panele.add(tekstas, BorderLayout.NORTH);
		panele.add(mygtukas, BorderLayout.SOUTH);
//		int x= 10;
//		
		
//		mygtukas.addActionListener(mp);
		mygtukas.addActionListener( new  ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Labas rytas");
				
			}
		});
	}

}
