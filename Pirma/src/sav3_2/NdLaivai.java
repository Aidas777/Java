package sav3_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NdLaivai {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws FileNotFoundException {
	
		Scanner in = new Scanner(new File("laivaiDB.txt"));
		
		int mdyd=in.nextInt();
		int mas[][]=new int [mdyd][mdyd];
				
		for (int y=0;y<mdyd;y++) {
			for (int x=0;x<mdyd;x++) {
				mas[y][x]=in.nextInt();
			}
		}
		
		int neg;
		do {
		
		System.out.print("  ");
		for (int i =0; i<mdyd;i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		int visiSum=0;
		for (int y=0;y<mdyd;y++) {
			System.out.print(y+" ");
			for (int x=0;x<mdyd;x++) {
				if (mas[y][x]==-1) {
					System.out.print("+ ");
				} else if (mas[y][x]==-2) {
					System.out.print("0 ");
				} else {
//					System.out.print(mas[y][x]+ " ");
					System.out.print("  ");
				}
				visiSum=visiSum+mas[y][x];
			}
			System.out.println();
		}
		System.out.println("Visu skaiciu suma: " + visiSum);  //SITA EILUTE REIKIA UZKOMENTINTI
		
		System.out.print("Iveskite taikinio koordinates 'x y': ");
		Scanner inS= new Scanner(System.in);
		System.out.println();
		
		int xs=inS.nextInt();
		int ys=inS.nextInt();
		
		System.out.print("  ");
		for (int i =0; i<mdyd;i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		for (int y=0;y<mdyd;y++) {
			System.out.print(y+" ");
			for (int x=0;x<mdyd;x++) {
				if (mas[y][x] !=0 && y==ys && x==xs) {
					mas[y][x]= -1;
				}
				if (mas[y][x] ==0 && y==ys && x==xs) {
					mas[y][x]= -2;
				}
				if (mas[y][x]==-1) {
					System.out.print("+ ");
				} else if (mas[y][x]==-2) {
					System.out.print("0 ");
				} else {
//					System.out.print(mas[y][x]+ " ");
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		boolean baigta = false;
		neg=0;
		for (int y=0;y<mdyd;y++) {
			for (int x=0;x<mdyd;x++) {
				if (mas[y][x]>=0) {
					neg=neg+mas[y][x];
				}
			}
		}
		System.out.println();
		System.out.println("Visu skaiciu suma: " + neg); //SITA EILUTE REIKIA UZKOMENTINTI

		
		if (neg==0) {
			System.out.println("Zaidimas baigtas - visi laivai nusauti.");
		} else {
			System.out.println("Ne visi laivai nusauti - teskite saudyma !");
		}
		
		} while (neg>0);
		
		
	}

}
