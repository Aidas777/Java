package sav2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MasPirma {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(new File("klvid.txt"));
		
		int n = in.nextInt();
		
		int [] mas = new int[n];
		for (int i=0; i<n;i++) {
			mas [i]=in.nextInt();
		}
		
		int suma=0, min=mas[0], max=mas[0];
		
		for (int i =0; i<n; i++) {
			if (mas[i]>max)
				max = mas[i];
			if (mas[i]<min)
				min= mas[i];
				suma=suma+mas[i];
		}
		System.out.println("Vidurkkis: " + (double) suma/n);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		
		for (int i =0; i<n; i++) {
			System.out.print(mas[i]+", ");
		}
		
	}

}
