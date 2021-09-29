package Langai;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class MygtukoPaspaudimas implements ActionListener {

	private JLabel antraste;
	
	public MygtukoPaspaudimas(JLabel antraste) {
		this.antraste=antraste;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Mygtukas paspaustas");
		this.antraste.setText("Mygtuka papsaudem");
		
	}
	
	
	
	
	
	

	

//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("Mygtukas paspaustas");
//		this.antraste.setText("Mygtuka papsaudem");
//		
//	}

}
