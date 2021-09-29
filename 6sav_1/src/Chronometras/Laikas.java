package Chronometras;

import javax.swing.JLabel;

public class Laikas extends Thread{
	public JLabel isvedimas;
	public volatile boolean runing=false; //volatile- kad konkreciai tik kintamasis o ne javos konstanta
	
	
	public Laikas(JLabel laikas) {
		this.isvedimas=laikas;
	}
	
//	public void
	
	@Override
	public void run() {
		int i=0;
		while(true) {
			try {
			sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			System.err.println(i);
			isvedimas.setText(""+i /10.0);
			i++;
		}
	}

}
