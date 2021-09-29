package sav3_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MassMulti2D {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("duomenys2.txt"));
		int n=in.nextInt();
		int m = in.nextInt();
		

//		int m2d [][] = new int[2][];
//		m2d[0]=new int [3];
//		m2d[1]=new int [2];
		
		int m2d [][]=new int[n][m];
		for (int i=0; i<n;i++) {
			for (int y=0;y<m;y++) {
				m2d[i][y]=in.nextInt();
			}
		}
		
		
//	for (int i=0; i<3;i++) {
	for (int i=0; i<m2d.length;i++) {
//		for (int y=0; y<3;y++) {
		for (int y=0; y<m2d[i].length;y++) {
			System.out.print(m2d[i][y]+" ");
		}
		System.out.println();
		
	}

	}
}
