package sav3_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Temperat {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("temper2.txt"));
		
		int n=in.nextInt();
		int temp [][] = new int [n][7];
		
		for (int i=0; i<n;i++) {
			for (int d=0;d<7;d++) {
				temp[i][d]=in.nextInt();
			}
		}

		for (int i=0;i<n;i++) {
			int suma=0;
			for (int d=0;d<7;d++) {
				suma=suma+temp[i][d];
			}
			System.out.println(i +" savaites vidurkis: " + suma /7.0);
		}
	}

}
