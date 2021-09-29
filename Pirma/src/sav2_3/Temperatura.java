package sav2_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("tempC.txt"));
		int n= in.nextInt();
		
		int mas[]=new int[n];
		int suma=0;
		int nuskaityta=0;
		
		for (int i=0;i<n;i++) {
			mas[i]=in.nextInt();
			nuskaityta++;
			suma=suma+mas[i];
		}
		
		System.out.println("Nuskaityta kartu: " +nuskaityta);
		
		Arrays.sort(mas);
		System.out.println( Arrays.toString(mas));
		
		System.out.println("Dvi maziausios temperaturos: ");
		for (int i=0; i<2;i++) {
			System.out.print(mas[i] + ", ");
		}
		
		System.out.println();
		
		System.out.println("Dvi didziausios temperaturos: ");
		for (int i=n-1; i>(n-3);i--) {
			System.out.print(mas[i] + ", ");
		}
		
		System.out.println();
		System.out.println("Vidutine temperatura: " + (double) suma / nuskaityta);

	}

}
