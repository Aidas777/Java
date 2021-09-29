package sav2_1;

import java.io.*;
import java.util.Scanner;

public class LygNeLygF {

	public static void main(String[] args) throws FileNotFoundException {

		String f = "duom.txt";
		Scanner in = new Scanner(new File(f));
		
		int t;
		int lyg=0;
		int nelyg=0;
		while (in.hasNextInt()) {
			t = in.nextInt();
			if (t % 2 == 0) {
				lyg++;
			} else {
				nelyg++;
			}
		}
		
		System.out.println("Duomenu faile '" + f + "':");
		System.out.println("Lyginiu skaiciu yra: " + lyg);
		System.out.print("NE-lyginiu skaiciu yra: " + nelyg);
		
		in.close();
	}

}
