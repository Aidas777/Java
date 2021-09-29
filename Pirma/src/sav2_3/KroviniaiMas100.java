package sav2_3;

import java.util.Arrays;
import java.util.Scanner;

public class KroviniaiMas100 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite visu sandeliu skaiciu: "+"Index: "+0);
		int sandSk=in.nextInt();
		
		int mas[]=new int [20];
		mas[0]=sandSk;
		System.out.println(Arrays.toString(mas));
		
		int index=0;
		int eil=0;
		
		for (int sandNr =0; sandNr<sandSk;sandNr++) {
			index++;
			System.out.println("Iveskite kiek "+(sandNr+1)+ "-ame sandelyje kroviniu: "+"Index: "+index);

	
			int krSk=in.nextInt();
			
			
			mas[index]=krSk;
			index++;
			System.out.println(Arrays.toString(mas));
			
//			System.out.println("krSk: " + krSk + " /// i+eil: " + (i+eil) + " /// mas[i+eil]: " + mas[i+eil]);
			
			for (int p=0;p<krSk;p++) {
				System.out.println("Iveskite i kuri sandeli is " + (sandNr+1) +"-ojo sandelio bus vezmas " + (p+1) + "-asis krovinys: " +"Index: "+(index));
				mas[index] = in.nextInt();
				index++;
				System.out.println(Arrays.toString(mas));
//				System.out.println(mas[(p+1)]);
			}
			index--;

		}
		
		


		
		System.out.println(Arrays.toString(mas));

	}

}
