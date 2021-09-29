package sav2_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Statistika {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("klvid.txt"));
		int n= in.nextInt();
		
		int m[]=new int[n];
		int suma=0;
		
		for (int i=0;i<n;i++) {
			m[i]=in.nextInt();
			suma=suma+m[i];
		}
		
		System.out.println("Vidurkis: " + (double) suma/n);

		Arrays.sort(m);
		
		if (n % 2 !=0) {
			System.out.println("Mediana: " + m[n /2]);
		} else {
			System.out.println("Mediana: " + (double)(m[n/2-1] +m[n/2]) /2);
		}
		
		System.out.println( Arrays.toString(m));
	}

}
