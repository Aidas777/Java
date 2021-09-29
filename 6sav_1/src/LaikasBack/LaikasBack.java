package LaikasBack;

import javax.swing.JLabel;



public class LaikasBack extends Thread{
	public JLabel isvedimas;
	public int pradzia;
	
	public LaikasBack(JLabel lblrodom, int pradzia) {
		this.isvedimas=lblrodom;
		this.pradzia=pradzia;

	}

	@Override
	public void run() {
//		System.out.println(pradzia);
//		System.out.println(isvedimas.getText());
		
		for (int i=pradzia;i>=0;i--) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			isvedimas.setText(""+i);
		}
		isvedimas.setText("LAIKAS BAIGESI !");

	}
}
