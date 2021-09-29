package sav3_3;

import java.util.Scanner;

public class NdApvalinimas {
	
	public static double apval(double sk, int pok) {
		double ss = (int) (sk*Math.pow(10, pok));
		double sd=  ss / (Math.pow(10, pok));
		return sd;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ivesk tu ta skaiciu: ");
		double sk = in.nextDouble();
		System.out.println("Ivesk kiek skaitmenu po kalbio nori matyti: ");
		int pok = in.nextInt();
		
		System.out.print(apval(sk, pok));
//		System.out.println(10^2);
		
		in.close();
	}

}
