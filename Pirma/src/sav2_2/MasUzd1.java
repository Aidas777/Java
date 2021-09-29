package sav2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MasUzd1 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(new File("klvid.txt"));
		
		int n = in.nextInt();
		System.out.println("Elementu masyve yra: " + n);
		
		int [] mas = new int[n];
		for (int i=0; i<n;i++) {
			mas [i]=in.nextInt();
		}
		
		int suma=0, min=mas[0], max=mas[0];
//		int maxSk=0;
		int maxN=0;
//		int k=0;
		
		for (int i =0; i<n; i++) {
			if (mas[i]>max) {
				
				max = mas[i];
				
			}
		}
		
		for (int i =0; i<n; i++) {

			if (mas[i] == max) {
				maxN++;
			}
		}
		
		System.out.println("Didziausias spindulys yra: " + max);
		System.out.println("Tokiu didziausiu spinduliu yra: " + maxN);
		
//		for (int i =0; i<n; i++) {
//			System.out.print(mas[i]+", ");
//		}
		
	}

}

