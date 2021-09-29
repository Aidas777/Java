package NdGame;

import javax.swing.JLabel;

public class Uzduotys extends Thread{
	public JLabel lblUzd;
	public int ats;
	
	public Uzduotys(JLabel lblUzd) {
		this.lblUzd = lblUzd;
	}

//	public String getUzd() {
//		return uzd;
//	}
//
//	public void setUzd(String uzd) {
//		this.uzd = uzd;
//	}

	public int getAts() {
		return ats;
	}

	public void setAts(int ats) {
		this.ats = ats;
	}
	
	public String getUzduotys() {
	
		int a = (int) (Math.random()*10);
		int b = (int) (Math.random()*10);
		
		int ats = 0;
		String veiksmas = "";
		if (a<=5) {
			a++;
			veiksmas="*";
			ats = a*b;
			this.ats=ats;
		} else {
			veiksmas="+";
			ats = a+b;
			this.ats=ats;
		}
		String uzd = a + " " + veiksmas +" " + b + " =";
//		this.lblUzd.setText(uzd);
		return uzd;
	}
	
	public void putUzduotys() {
		int a = (int) (Math.random()*10);
		int b = (int) (Math.random()*10);
		
		int ats = 0;
		String veiksmas = "";
		if (a<=5) {
			a++;
			veiksmas="*";
			ats = a*b;
			this.ats=ats;
		} else {
			veiksmas="+";
			ats = a+b;
			this.ats=ats;
		}
		this.lblUzd.setText(a + " " + veiksmas +" " + b + " =");
	}
	
	

	@Override
	public String toString() {
		return lblUzd + ", ats=" + ats;
	}
	
	
	
}
