package lapai;

import java.util.Scanner;

public class Staciakamp {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite krastiniu ilgius: ");
		
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double d = in.nextDouble();
		
		if ((a==b && c==d) || (a==c && b==d) || (a==d && b==c)) {
			System.out.println("GALIME sudaryti staciakampi.");
		} else {
			System.out.println("NEgalime sudaryti staciakampio.");
		}
			

		in.close();
	}

}
