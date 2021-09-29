package sav2_2;

import java.util.Scanner;

public class Masyvai {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int[] temp = new int[5];
//		temp[0]=28;
//		temp[1]=30;
//		temp[2]=36;
//		temp[3]=31;
//		temp[4]=24;
		
		for (int i=0;i<5;i++) {
			System.out.println("iveskite masyvo "+i+" elementa:");
			temp[i]=in.nextInt();
		}
		
//		System.out.println("iveskite masyvo 1 elementa:");
//		temp[0]=in.nextInt();
//		
//		System.out.println("iveskite masyvo 2 elementa:");
//		temp[1]=in.nextInt();
		

		
//		System.out.println("Masyvo 1 elementas:" + temp[1]);
		

		
		int[] mas;
		mas=temp;
		
		mas[0]=999;
		temp[3]=0;
		
		for (int i=0;i<5;i++) {
			System.out.print(temp[i] + ", ");
		}
		
		System.out.println("\nMasyvas TEMP: ");
		for (int i=0;i<5;i++) {
			System.out.print(mas[i] + ", ");
		}
		
		
//		System.out.println();
//		System.out.println(temp);
		
//		System.gc; //garbage collectorius
//		temp=null;
		
	}

}
