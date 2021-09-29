package lapai;

import java.util.Scanner;

public class Uzduotis_4 {

	public static void main(String[] args) {
		int h1, m1, h2, m2; 
		
		Scanner ivesk = new Scanner(System.in);
		System.out.print("Iveskite valanda, kada pradejo: ");
		h1 = ivesk.nextInt();
		System.out.print("Iveskite minutes, kada pradejo: ");
		m1 = ivesk.nextInt();
		
		System.out.print("Iveskite valanda, kada baigė: ");
		h2 = ivesk.nextInt();
		System.out.print("Iveskite minutes, kada baigė: ");
		m2 = ivesk.nextInt();
		
//		-----
//		SITAIP REIKEJO:
		int laikoSprende = m2 - m1 + (h2 - h1) * 60;
//		int h=laikoSprende / 60;
//		int m=laikoSprende % 60;  //TIK LIEKANA
//		-----
		
		int hL = laikoSprende / 60;
		int mL = laikoSprende % 60;
		
//		if (String.valueOf(hL).lenght < 2) {
//			String hLL = "0" + hL;
//		}
		
		System.out.println("Programos kūrimas truko: " + hL + " val. " + mL + " min.");
		
		ivesk.close();

	}

}
