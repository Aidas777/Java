package lapai;

import java.util.Scanner;

public class Uzduotis_5 {

	public static void main(String[] args) {
	
		double a,b,c, s;
		Scanner ivesk = new Scanner(System.in);
		
		System.out.print("Ivesk krastine a: ");
		a = ivesk.nextDouble();
		System.out.print("Ivesk krastine b: ");
		b = ivesk.nextDouble();
		System.out.print("Ivesk krastine c: ");
		c = ivesk.nextDouble();
		
		double pusp = (a + b + c) / 2;
		s = Math.sqrt(pusp * (pusp-a) * (pusp-b) * (pusp-c));
		s=Math.round(s * 100.0) / 100.0;
		System.out.println("Trikampio plotas: " + s);
		
		ivesk.close();
	}

}
