package sav2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Saukstai {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("sauks.txt"));
		
		int n=in.nextInt();
		
		int[] d = new int[7];
		int[] k=new int[n];
		
		while (in.hasNextInt()) {
			int dn=in.nextInt();
			int sk=in.nextInt();
			int dk=in.nextInt();
			d[dn-1]=d[dn-1]+sk;
			k[dk-1]=k[dk-1]+sk;
		}
		
		for (int i=0; i<7;i++) {
			System.out.println((i+1)+ " diena pagaminta " + d[i] + " saukstai");
		}
		
		for (int i=0; i<n;i++) {
			System.out.println((i+1)+ " darbuotojas pagamino " + k[i] + " saukstu");
		}
		
		in.close();
	}

}
