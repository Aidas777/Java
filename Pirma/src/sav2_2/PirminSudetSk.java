package sav2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PirminSudetSk {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(new File("klvid.txt"));
		int enas=in.nextInt();
		
		int eil=0;
		int mas[] = new int[enas];
		while (in.hasNextInt()) {
			mas[eil]= in.nextInt();
			eil++;
		}
		
		System.out.println(eil);
		
		for (int i=0; i<eil;i++) {
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
		System.out.println();
		

		int sk;

		System.out.println("Sudetiniai skaiciai:");
		for (int i=0; i<eil;i++) {
			
			for (int dal=2; dal<mas[i]; dal++) {
				if (mas[i] % dal ==0) {
					System.out.print(mas[i]+"; ");
					break;
				}	
			}

		}
		System.out.println();
		System.out.println();
		System.out.println("Pirminiai skaiciai:");
		
		for (int i=0; i<eil;i++) {
			int typ=0;
			for (int dal=2; dal<mas[i]; dal++) {
				if (mas[i] % dal ==0) {
					typ=1;
					break;
				}
			}
				
			if (typ==0) {
				System.out.print(mas[i] + ", ");
			}
		}
		
	
	
	}

}
