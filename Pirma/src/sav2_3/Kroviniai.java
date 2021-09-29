package sav2_3;

import java.util.Arrays;
import java.util.Scanner;

public class Kroviniai {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite visu sandeliu skaiciu: ");
		int sandSk=in.nextInt();
		
		int mas[]=new int [0];
		
		for (int Mi = 0; Mi<sandSk; Mi++) {
			System.out.println("Iveskite kroviniu kieki is " + (Mi+1) + "-ojo sandelio ");
			int krkiek = in.nextInt();
			
			int masTemp[] = new int[mas.length+krkiek];
			
			for (int i=0; i<mas.length; i++) {
				masTemp[i] = mas[i];
			}
			
			masTemp[masTemp.length-1]=krkiek;
			mas=masTemp;
			
			for (int i=0; i<krkiek;i++) {
				System.out.println("Iveskite i kuri sandeli bus vezamas " + (i+1) + "-asis krovinys is " +(Mi+1) + "-ojo sandelio:");
			}
		}

		
		System.out.println(Arrays.toString(mas));
	}

}
