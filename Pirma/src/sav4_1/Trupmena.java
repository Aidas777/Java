package sav4_1;

public class Trupmena {
	public int sveikojiDalis;
	public int skaitiklis;
	public int daliklis;
	

	public Trupmena() {
		
	}
	

	
	public Trupmena(int skaitiklis, int daliklis) {
		this.skaitiklis = skaitiklis;
		this.daliklis = daliklis;
	}
	

	public Trupmena(int sveikojiDalis, int skaitiklis, int daliklis) {
		this.sveikojiDalis = sveikojiDalis;
		this.skaitiklis = skaitiklis;
		this.daliklis = daliklis;
	}


	public int getSveikojiDalis() {
		return sveikojiDalis;
	}
	public void setSveikojiDalis(int sveikojiDalis) {
		this.sveikojiDalis = sveikojiDalis;
	}
	public int getSkaitiklis() {
		return skaitiklis;
	}
	public void setSkaitiklis(int skaitiklis) {
		this.skaitiklis = skaitiklis;
	}
	public int getDaliklis() {
		return daliklis;
	}
	public void setDaliklis(int daliklis) {
		this.daliklis = daliklis;
	}
	
//	public void setDaliklis(int dal) {
//		this.daliklis = dal;
//	}
	
	@Override
	public String toString( ) {
		if (sveikojiDalis !=0) {
			return sveikojiDalis + " " + skaitiklis + "/" + daliklis;
		} else {
			return skaitiklis + "/" + daliklis;
		}
	}
	
	/**  //2 ZVAIGZDES
	 * Metodas prie trupmenos prideda sveikaji skaiciu
	 * @param x sveikasis skaicius, kuri reikia prideti
	 */
	
	public void prideti(int x) {
		sveikojiDalis+=x;
	}
	
	private int dbd(int x, int y) {
		int dbd=1;
		for (int i =1; i<=x;i++) {
			if (x%i==0 && y%i==0) {
				dbd=i;
			}
		}
		return dbd;
	}
	
	public void prideti(int s, int d) {
		skaitiklis=daliklis*s+d *skaitiklis;
		daliklis=daliklis *d;
		sveikojiDalis=sveikojiDalis + (skaitiklis / daliklis);
		skaitiklis=skaitiklis % daliklis;
		int dbd=dbd(skaitiklis, daliklis);
		skaitiklis=skaitiklis / dbd;
		daliklis=daliklis / dbd;
		
	}
	
	public void prideti(int sveikas, int s, int d) {
		prideti(sveikas);
		prideti(s,d);
	}
	
	public void prideti(Trupmena t) {
		prideti(t.sveikojiDalis);
		prideti(t.skaitiklis, t.daliklis); //this.daliklis cia pirmojo objekto
	}
	

	//---
	
	public void atimti (int x) {
		sveikojiDalis=sveikojiDalis-x;
	}
	
	public void atimti (int s, int d) {
		skaitiklis=d *skaitiklis-daliklis*s;
		daliklis=daliklis *d;
		sveikojiDalis=sveikojiDalis + (skaitiklis / daliklis);
		skaitiklis=skaitiklis % daliklis;
		int dbd=dbd(skaitiklis, daliklis);
		skaitiklis=skaitiklis / dbd;
		daliklis=daliklis / dbd;
	}
	
	public void atimti(int sveikas, int s, int d) {
		atimti(sveikas);
		atimti(s,d);
	}
	
	public void atimti(Trupmena t) {
		atimti(t.sveikojiDalis);
		atimti(t.skaitiklis, t.daliklis); //this.daliklis cia pirmojo objekto
	}
	
	public double toDouble() {
		double d= sveikojiDalis + ((double) skaitiklis / daliklis);
		return d;
	}
}
