package sav3_3;

import java.util.Arrays;

public class Vykdymas {
	
	public static void isveskSk(int i) {
		System.out.println("------------------");
		System.out.println("Skaiciaus tipas:\t integer");
		System.out.println("Skaiciaus reiksme:\t " + i);
	}
	
	public static void isveskSk(double i) {
		System.out.println("------------------");
		System.out.println("Skaiciaus tipas:\t double");
		System.out.println("Skaiciaus reiksme:\t " + i);
	}

	public static void main(String[] args) {
		double x=5;
		int z=7;
		
		z++;
		x--;
		
		isveskSk(z *2);
		isveskSk(x);
		
		int m[]=new int[10];
		double n []=new double [10];
		Arrays.sort(m);
		Arrays.sort(n);
	}

}
