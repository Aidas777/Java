package sav3_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ApverstMass2 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(new File("massRoll.txt"));
		
		int y=in.nextInt();
		int x=in.nextInt();
		
		int mas[][]=new int [y][x];
		
		for (int i=0;i<y;i++) {
			for (int j=0;j<x;j++) {
				mas[i][j]=in.nextInt();
			}
		}
		
		//y=3
		//x=4
		
		System.out.println("Pirminias masyvas (i:y/j:x)");
		
		for (int i=0;i<y;i++) {
//			System.out.print(mas[i][0]+" ");
			for (int j=0;j<x;j++) {
				System.out.print(mas[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Apverstas masyvas");
		
		//y=3
		//x=4
		
		int masr[][]=new int [x][y];
		for (int i=0; i<x;i++) {
			for (int j=0;j<y;j++) {
				masr[i][j]=mas[y-j-1][i];
				   //4//3      x  y
//				System.out.print(masr[i][j]+" ");
			}
//			System.out.println();
		}
		
		for (int i=0; i<x;i++) {
			for (int j=0;j<y;j++) {
//				System.out.print(masr[y-1-j][i]+ " ");
				System.out.print(masr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}
