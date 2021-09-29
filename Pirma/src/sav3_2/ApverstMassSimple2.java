package sav3_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ApverstMassSimple2 {

	public static void main(String[] args) throws FileNotFoundException {

		int mas [][] = new int [3][4];
		Scanner in = new Scanner(new File("massSimple.txt"));

		for (int y=0;y<3;y++) {
			for (int x=0;x<4;x++) {
				mas[y][x]=in.nextInt();
			}
		}
		
		System.out.println("Pirminis masyvas:");
		
		for (int y=0;y<3;y++) {
			for (int x=0;x<4;x++) {
				System.out.print(mas[y][x]+" ( y:" +y + " x:"+x + ") ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Pazaistas masyvas:");
		
		int masz[][]=new int [3][3];
		
		for (int y=0;y<3;y++) {
			for (int x=0;x<4;x++) {
				masz[y][x]=mas[4-x-1][y];
//				masz[y][x]=mas[x][y];
			}
		}
		
		
		
		for (int y=0;y<3;y++) {
			for (int x=0;x<4;x++) {
				System.out.print(masz[y][x]+" ( y:" + (4-x-1) + " x:"+x + ") ");
			}
			System.out.println();
		}
	}

}
