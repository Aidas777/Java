package sav3_3;

import java.util.Scanner;

public class Funkc {
	static int z=0; //PASIEKIAMAS IS VISUR (KAIP GLOBAL)
	
	public static int suma(int x, int y) {
		int t=x+y;
		x++;
		int z=0; //taip z tampa vidiniu ir turi aukstesni prioriteta
		z++;
				
		Funkc.z=5; //taip galim pasiekt globalu kintama
		return t;
	}
	
	public static void didink(int x []) {
//		x= new int [1];
		x[0]=9;
	}

	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in); //tai objektas
//		Darbuotojas jonas = new Darbuotojas(); //objektas
		
		
//		int x=8;
//		int y = 5;
//		z++;
//		System.out.println("skaiciu suma: " + suma(x,y));
//		System.out.println(x+y);
//		System.out.println(z);
		
		int z []= {5};
		didink(z);
		System.out.println(z[0]);
	}

}
