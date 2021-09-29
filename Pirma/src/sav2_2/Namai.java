package sav2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Namai {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("namai.txt"));
		int namusk = in.nextInt();

		int mas[] = new int[namusk * 2];

		while (in.hasNextInt()) {
			int naNr = in.nextInt();
			int GySk = in.nextInt();

			mas[naNr - 1] = GySk;
		}

//		for (int i=0; i<namusk;i++) {
//			System.out.println((i+1) + " name yra: " +mas[i] + " gyventoju.");
//		}
//		
		int LygG = 0;
		int NeLygG = 0;
		int ly=0;
		int nely=0;

		for (int i = 0; i < namusk; i++) {
			if ((i + 1) % 2 == 0) {
				LygG = LygG + mas[i];
				ly++;
			} else {
				NeLygG = NeLygG + mas[i];
				nely++;
			}
		}
		
		double vidLyg= (double) LygG / ly;
		double vidNeLyg= (double) NeLygG / nely;
				
		System.out.println("Isviso gatveje gyvena: " + (LygG + NeLygG)+ " gyventojai");
		System.out.println("Namuose su Lyginiais numeriais gyvena: " + LygG + " gyventojai");
		System.out.println("Namuose su NElyginiais numeriais gyvena: " + NeLygG + " gyventojai");
		System.out.println();
		
		System.out.printf("Vidutiniskai viename is lyginiu namu gyvena: %5.2f" +" gyventojai \n" , vidLyg);
		System.out.printf("Vidutiniskai viename is NElyginiu namu gyvena: %5.2f" + " gyventojai", vidNeLyg);
		

	}

}
