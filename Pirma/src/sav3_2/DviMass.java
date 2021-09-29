package sav3_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DviMass {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("dviMass.txt"));
		int sk=in.nextInt();
		int x,y;
		
		int mass[][]= new int [sk][sk];

		for (x=0;x<sk;x++) {
//			mass[i]=in.nextInt();
			for (y=0;y<sk;y++) {
				mass[x][y]=in.nextInt();
			}
//			System.out.println(mass[x][y]);
		}
		
		System.out.println("mass[x][y]: ");
		for (x=0;x<sk;x++) {
			
			for (y=0;y<sk;y++) {
				System.out.print(mass[x][y]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("mass[y][x]: ");
		for (x=0;x<sk;x++) {
			
			for (y=0;y<sk;y++) {
				System.out.print(mass[y][x]+" ");
			}
			System.out.println();
		}
	
		
		
		
//		// declaring and initializing 2D array
//        int arr[][] = { {11,12,13},{21,22,23},{31,32,33} };
//  
//        // printing 2D array
//        for (int i=0; i< 3 ; i++)
//        {
//            for (int j=0; j < 3 ; j++)
//                System.out.print(arr[i][j] + " ");
//  
//            System.out.println();
//        }
	}

}
