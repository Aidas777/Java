package sav3_3;

public class Uzd1 {
	
	/**
	 * Funkcija skirta apso ploto skaiciavimui
	 * @param r Apskritimo spindulys
	 * @return Grazinamas apso plotas
	 */
	
	public static double plotas(double r) {
		double p=Math.PI* Math.pow(r, 2);
		return p;
//		arba iskart taip return Math.PI* Math.pow(r, 2);
	}

	public static void main(String[] args) {

		double plotas = plotas(2.2);

		

	}

}
