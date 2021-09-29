package sav3_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MasUzd1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in=new Scanner(new File("duom2.txt"));
		int n=in.nextInt();

		int[][] mas=new int[n][n];
		for (int i=0; i<n; i++) {
			for (int y=0; y<n; y++) {
				mas[i][y]=in.nextInt();
			}
		}

		for (int i=0; i<n; i++) {
			for (int y=0; y<n; y++) {
				if (i==y || i==(n-1)-y) {
					mas[i][y]=0;
				}
			}
		}

		for (int i=0; i<n; i++) {
			for (int y=0; y<n; y++) {
				System.out.print(mas[i][y]+" ");
			}
		System.out.println();
		}
		
		
	}

}
