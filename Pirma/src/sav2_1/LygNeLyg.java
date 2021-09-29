package sav2_1;

import java.util.Scanner;

public class LygNeLyg {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Iveskite (dideli, sveika) skaiciu: ");
		
		int i = in.nextInt();
		
		int lyg=0;
		int nelyg=0;
		int m = 0;
		
		while (i != 0) {
			m = i % 10;
			if (m % 2==0) {
				lyg++;
			} else {
				nelyg++;
			}
			i =i /10;
//			System.out.println(m);

		}
		
		System.out.println("Lyginiu skaitmenu sioje sekoje yra: " +lyg);
		System.out.println("NE-lyginiu skaitmenu sioje sekoje yra: " +nelyg);

		in.close();
	}

}
