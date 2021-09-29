package sav2_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MasyvoDydis {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in=new Scanner(new File("duom.txt"));

		int mas[]=new int[0];
		
		while (in.hasNextInt()) {
			int sk=in.nextInt();
			
			int t []=new int[mas.length+1];
			
			for (int i=0; i<mas.length; i++) {
				t[i]=mas[i];
			}
			t[t.length-1]=sk;
			mas=t;
		}
		
		for (int i=0;i<mas.length; i++) {
			System.out.print(mas[i] + " ");
		}

		System.out.println("\nMasyvo dydis: " +mas.length);
		in.close();
	}

}
