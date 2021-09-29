package sav3_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Student5x5 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("studentai5x5.txt"));
		
		int x=in.nextInt();
		int y=in.nextInt();
		
		int paz [][] = new int [x][y];
		
		for (int px=0; px<x;px++) {
			for (int py=0;py<y;py++) {
				paz[px][py]=in.nextInt();
			}
		}
		
		for (int px=0; px<x;px++) {
			for (int py=0;py<y;py++) {
				System.out.print(paz[px][py]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int allsum=0;
		int gerB=0;  //geriausiai besimokancio nr
		double gerV=0; //vidurkis
		int sumax=0;
		
		for (int px = 0; px<x;px++) {
			sumax=0;
			for (int py=0;py<y;py++) {
				sumax=sumax+ paz[px][py];
				allsum=allsum+paz[px][py];
			}
			System.out.printf((px+1) +"-ojo mokinio vidurkis: %2.2f\n" , (double) (sumax /(double) y));
			if ((double) sumax / y > gerV) {
				gerV=(double) sumax /y;
				gerB=px;
			}
		}
		System.out.println("Visu studentu pazymiu vidurkis: " + (double) allsum /(x*y));
		System.out.println("Geriausias: " + (gerB+1));
		
		System.out.println("Nepazangus mokiniai: ");
		for (int px=0; px<x;px++) {
			boolean pazangus=true;
			for (int py=0;py<y;py++) {
				if (paz[px][py] <5) {
					pazangus=false;
					break;
				}
			}
			if (!pazangus) {
				System.out.print((px+1)+ " ");
			}
		}
		
		

//		for (int i=0;i<x;i++) {
//			int suma=0;
//			for (int d=0;d<7;d++) {
//				suma=suma+paz[i][d];
//			}
//			System.out.println(i +" savaites vidurkis: " + suma /7.0);
//		}

	}

}
