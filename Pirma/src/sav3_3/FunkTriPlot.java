package sav3_3;

import java.util.Scanner;

public class FunkTriPlot {
	
//	public static int plotas(int a, int b) {
//		int s= a*b/2;
//		return s;
//	}
	
	public static int plotas2(int x, int y) {
		return x*y;
	}
	
	public static double plotas(double a, double b) {
		double s= a*b/2;
		return s;
	}
	
	

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
		
		System.out.println("Plotas yra: " + plotas(3.9,4.2));
		
		int x=5;
		int y=10;
		
		System.out.println(plotas2(25,3));
		
		
	}

}
