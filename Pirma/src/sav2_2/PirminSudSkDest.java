package sav2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PirminSudSkDest {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(new File("klvid.txt"));
		int n = in.nextInt();
		
		int m[]=new int[n];
		for (int i=0;i<n;i++) {
			m[i]=in.nextInt();
		}
		
		System.out.println("Pirminiai skaiciai: ");
		for (int i=0;i<n;i++) {
			boolean pirminis = true;
			for (int y=2;y<m[i];y++) {
				if (m[i] % y ==0 ) {
					pirminis=false;
					break;
				}
			}
			if (pirminis == true) {
				System.out.print(m[i] + " ");
			}
		}
		
		
		System.out.println("\nSudetiniai skaiciai: ");
		for (int i=0;i<n;i++) {
			boolean pirminis = true;
			for (int y=2;y<m[i];y++) {
				if (m[i] % y ==0 ) {
					pirminis=false;
					break;
				}
			}
			if (pirminis == false) {
				System.out.print(m[i] + " ");
			}
		}

	}

}
