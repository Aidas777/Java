package sav3_3;

import java.util.Scanner;

public class Boolean {
	
	public static boolean pirminis(int x) {
		boolean pirminis = true;
		for (int i=2;i<x;i++) {
			if (x%i ==0) {
//				pirminis = false;
//				break;
				return false; //arba tiesiog taip
			}
		}
		
		return pirminis;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite skaiciu: ");
		int i = in.nextInt();

		if (pirminis(i)) {
			System.out.println("Skacius pirminis");
		} else {
			System.out.println("Skacius paprastas");
		}
	}

}
