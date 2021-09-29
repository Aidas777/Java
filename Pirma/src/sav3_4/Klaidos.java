package sav3_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Klaidos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite du skaicius as juos padalinsiu: ");

		
		try {
			int i=in.nextInt();
			int y=in.nextInt();
			System.out.println("Padalinus: "+ i/y);
		} catch (ArithmeticException e){
			System.out.println("Atsiprasome dalyba is 0 negalima");
		} catch (InputMismatchException e) {
			System.out.println("Ivestas netinkamas duomuo");
		} catch (Exception e) { //sitas turi buti paskutinis pagal ierarcjija
			System.out.println("Ivyko nenustatyta klaida");
		}
		
		
		System.out.println("Viso gero iki pasimatymo");
		System.out.println("Systema baige darba");

	}

}
