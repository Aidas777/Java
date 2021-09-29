package sav3_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MassUzd2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in=new Scanner(new File("magicCube.txt"));
		int n=in.nextInt();

		int[][] mas=new int[n][n];
		for (int i=0; i<n; i++) {
			for (int y=0; y<n; y++) {
				mas[i][y]=in.nextInt();
			}
		}

		boolean magiskas=true;
		int skX=0;
		
		//EILUTES
		for (int i=0; i<n; i++) {
			skX = skX+mas[0][i];
//			System.out.print(mas[0][i] + "; ");
		}
//		System.out.println();
		System.out.println("Pirmos eil. suma: " +skX);
		
		
		for (int i=0; i<n; i++) {
			int t=0;
			int t1=0;
			for (int y=0; y<n; y++) {
				t=t+mas[i][y];
				t1=t1+mas[y][i];
				System.out.print(mas[i][y]+" ");
			}
			System.out.print("t="+ t);
			System.out.print(" //t1="+ t1);
			if (t!=skX || t1!=skX) {
				magiskas=false;
			}
			System.out.println();
		}
		//ISTRIZAINES
		skX=0;
		for (int i=0; i<n; i++) {
			skX = skX+mas[0][i];
		}
		System.out.println(skX);
		

		
		int s1=0;
		int s2=0;
		
		for (int i=0;i<n;i++) {
			s1=s1+mas[i][i];
			s2=s2+mas[i][n-1-i];
		}
		
		
		if (s1!=skX || s2!=skX) {
			magiskas=false;
		}


		if (magiskas) {
			System.out.println("Kvadratas YRA magiskasis");
		} else {
			System.out.println("Kvadratas NERA magiskasis");
		}
			
		
		

//		for (int i=0; i<n; i++) {
//			for (int y=0; y<n; y++) {
//				System.out.print(mas[i][y]+" ");
//			}
//		System.out.println();
//		}

	}

}
