package NdGame;

import javax.swing.JLabel;

public class TimeBack extends Thread{
	public JLabel taimas;
	public int periodas=100;

	public TimeBack(JLabel lblTime) {
		this.taimas = lblTime;

	}
	
	@Override
	public void run() {
		taimas.setText(""+periodas/10.0);
		for (int i=periodas; i>=0; i--) {
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i>0) {
				taimas.setText(""+i/10.0);
			}else {
				taimas.setText("LAIKAS BAIGESI !!!");
			}
		}
	}

}
