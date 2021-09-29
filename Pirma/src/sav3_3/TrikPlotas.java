package sav3_3;

import java.util.Scanner;

public class TrikPlotas {
	
	public static double plotas(double a, double b, double c) {
		double pper=(a+b+c)/2;
//		System.out.println(pper);
		double s=Math.sqrt(( pper*(pper-a)*(pper-b)*(pper-c) ));
		return s;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite krastines a,b ir c: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		
		System.out.printf("Plotas yra: %5.2f" , plotas(a, b, c));
		

		in.close();
	}

}
