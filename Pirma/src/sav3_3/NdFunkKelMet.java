package sav3_3;

import java.util.Scanner;

public class NdFunkKelMet {
	
	public static boolean keliamieji(int metai) {
		if ( ((metai % 400 ==0) && (metai % 100==0)) || ((metai % 100!=0) && (metai % 4==0)) ) {
			boolean keliamieji=true;
//			break;
//			return true;
			return keliamieji;
		} else {
			boolean keliamieji=false;
//			break;
//			return false;
			return keliamieji;
		}
//		return;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Ivesktie metus: ");
		int metai=in.nextInt();
		
		if (keliamieji(metai)) {
			System.out.println("Metai YRA keliamieji");
		} else {
			System.out.println("Metai NERA keliamieji");
		}
		
		in.close();

	}

}
