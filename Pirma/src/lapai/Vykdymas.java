package lapai;

import java.util.Scanner;

public class Vykdymas {

	public static void main(String[] args) {
		Scanner ivedimas=new Scanner(System.in);
		int s, u;
		System.out.println("Koks yra Jūsų kūno svoris kg: ");
		s=ivedimas.nextInt();
		System.out.println("Koks ūgis cm: ");
		u=ivedimas.nextInt();
		

		double koef;
		double um=(double)u/100;
		koef=s/Math.pow(um, 2);
		
		System.out.println("Jūsų KMS koeficientas yra: " + koef);
		
		ivedimas.close();
	}

}
