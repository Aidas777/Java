package sav2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Skaic {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("duom.txt"));
		
		
		int [] m = new int[10];
		while (in.hasNextInt()) {
			int sk=in.nextInt();
			m[sk]++;
		}
		
		for (int i=0;i<10;i++) {
			System.out.println(i+ " - " + m[i]);
		}

	}

}
