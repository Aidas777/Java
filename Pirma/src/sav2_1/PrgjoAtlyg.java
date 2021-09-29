package sav2_1;

import java.util.Scanner;

public class PrgjoAtlyg {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite programerio pradini atlyginima: ");
		double pirmAlga = in.nextDouble();
		
		System.out.println("Iveskite kiek didinamas atlyginimas kas menesi: ");
		double algosUp = in.nextDouble();
		
		System.out.println("Iveskite suma, kuria norite pasiekti: ");
		int maxAlga = in.nextInt();
		
		
		double algaDinam = pirmAlga;
		int men = 0;
		while (algaDinam < pirmAlga * 2) {
			
			men++;
			algaDinam = algaDinam + algosUp;
		}
		

		
		int men2 = 0;
		algaDinam = pirmAlga;
		while (algaDinam <= maxAlga) {
			men2++;
			algaDinam = algaDinam + algosUp;
		}
		System.out.println("Programerio alga bus 2 kartus didesne po " + men + " menesiu.");
		System.out.println("Programerio alga pasieks "+ maxAlga + " eur atlygi po " + men2 + " menesiu.");
		

		in.close();
	}

}
