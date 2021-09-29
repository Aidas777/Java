package sav2_3;

import java.util.Arrays;
import java.util.Scanner;

public class KroviniaiOk {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite visu sandeliu skaiciu: ");
		int sandSk=in.nextInt();
		
		int mas[]=new int [sandSk];
		int k=0;
		
		for (int sandNr =0; sandNr<sandSk-1;sandNr++) {
			System.out.println("Iveskite kiek "+(sandNr+1)+ "-ame sandelyje kroviniu: ");

	
			int krSk=in.nextInt();

			System.out.println(Arrays.toString(mas));
			
			for (int p=0;p<krSk;p++) {
				System.out.println("Iveskite i kuri sandeli is " + (sandNr+1) +"-ojo sandelio bus vezmas " + (p+1) + "-asis krovinys: ");
				int iSand = in.nextInt();
				System.out.println("Iveskite jo svori: ");
				int kg=in.nextInt();
				
				for (int s=k;s<iSand-1;s++) {
//					System.out.println("s: " + s);
					mas[s]=mas[s]+kg;
				}

//				System.out.println(Arrays.toString(mas));
			}
			k++;
		}
		
		in.close();
		
		int ats=0;
		for (int i =0; i<sandSk;i++)
			if (mas[i]>ats) {
				ats=mas[i];
			}
		if (ats==0) {
			System.out.println("Klaida !!! Patikrinkite ar visus duomenis suvedet teisingai !");
			return;
		}
		System.out.println("Reikalingas automobilio minimalus krovumas yra: " + ats);

	}

}
