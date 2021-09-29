package sav2_2;

import java.io.*;
import java.util.Scanner;

public class FailoSkaitymas {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("duom.txt"));
		
		while (in.hasNextInt()) {
			int i =in.nextInt();
			if (i % 2 ==0) {
				System.out.println("Skaicius " + i+ " lyginis");
			} else {
				System.out.println("Skaicius " + i+ " nelyginis");
			}
			
//			System.out.print(i+", ");
		}
		
		in.close();

	}

}
