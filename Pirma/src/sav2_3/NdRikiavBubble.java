package sav2_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class NdRikiavBubble {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("mass.txt"));
		int kiek = in.nextInt();
		
		System.out.println("Skaitmenu kiekis: " +kiek);
		//GALECIAU PANAUDOTI SI SKAITMENU KIEKI, BET MOKYMUISI PABANDYSIU APSEITI BE JO 
		
		int mas[]=new int[0];
		while (in.hasNextInt()) {
			int sk = in.nextInt();
			int masTemp [] = new int [mas.length+1];
			
			for (int i=0;i<mas.length;i++) {
				masTemp[i]=mas[i];
			}
			masTemp[masTemp.length-1]=sk;
			mas=masTemp;
		}
		
		System.out.println("Pirminis masyvas: ");
		System.out.println(Arrays.toString(mas));
		System.out.println();
		
		for (int i =0; i<mas.length-1; i++) {
			for (int k=i+1;k<mas.length;k++) {
				if (mas[i]<mas[k]) {
					int t=mas[i];
					mas[i]=mas[k];
					mas[k]=t;
				}
			}
		}

		System.out.println("Isrikiuotas mazejanciai masyvas: ");
		for (int i=0;i<mas.length;i++) {
			System.out.print(mas[i] + ", ");
		}
		
		in.close();

	}

}
