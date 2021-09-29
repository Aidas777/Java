package lapai;

import java.util.Scanner;

public class Uzduotis_2 {

	public static void main(String[] args) {
		
		int v, n;
		
		Scanner ivesk = new Scanner(System.in);
		
		System.out.print("Kiek knygų perskaito visi lankytojai vidutiniškai per mėn ?: ");
		v = ivesk.nextInt();
		double vmen = v *12; //VID. KNYGU SK PER METUS VISU LANKYTOJU
		
		System.out.print("Koks vidutinis lankytojų bibliotekoje skaičius per metus?: ");
		n = ivesk.nextInt();
		
		double knPerMet = vmen / n;
		knPerMet = Math.round(knPerMet * 100.0) /100.0;
		
//		double nmen = n /12; //LANKYTOJU VIDUTINISKAI PER MEN
//		double vmen = (double) (v/nmen)*12; //KNYGU PERSKAITO 1 LANKYTOJAS PER 12 MEN
		
		System.out.print("Knygų skaičius, kurį vidutiniškai per metus perskaito vienas bibliotekos lankytojas: " + knPerMet);
		ivesk.close();
	}

}
