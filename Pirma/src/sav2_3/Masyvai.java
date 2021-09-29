package sav2_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Masyvai {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in=new Scanner(new File("duom.txt"));

		int mas[]=new int[0];
		
		while (in.hasNextInt()) {
			int sk=in.nextInt();
			mas=Arrays.copyOf(mas,mas.length+1);
			mas[mas.length-1]=sk;
		}
			

		
		

		System.out.println(Arrays.toString(mas));
		System.out.println("\nMasyvo dydis: " +mas.length);
		Scanner inC=new Scanner(System.in);
		System.out.println("Kelinta skaiciu panaikinti?: ");
		int n =inC.nextInt();
		n=n-1;
		
//		mas=Arrays.copyOf(mas,mas.length-1);
		int mas2[]=new int[mas.length-1];
		
		for (int i=0;i<mas2.length;i++) {
			if (i>=n) {
			mas2[i]=mas[i+1];
		} else {
			mas2[i]=mas[i];
		}
		}
		mas=mas2;
		
	
		
		System.out.println(Arrays.toString(mas2));
		System.out.println("\nMasyvo dydis: " +mas2.length);
		in.close();

	}

}
