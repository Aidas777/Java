package lapai;

import java.util.Scanner;

public class Uzduotis_3 {

	public static void main(String[] args) {
		int x1, y1, x2, y2;
		
		Scanner ivesk = new Scanner(System.in);
		
		System.out.println("Iveskite koordinatę x1: ");
		x1 = ivesk.nextInt();
		System.out.println("Iveskite koordinatę y1: ");
		y1 = ivesk.nextInt();
		System.out.println("Iveskite koordinatę x2: ");
		x2 = ivesk.nextInt();
		System.out.println("Iveskite koordinatę y2: ");
		y2 = ivesk.nextInt();
		
		int xLen = Math.abs(x2 - x1);
		int yLen = Math.abs(y2 - y1);
		
		int plot = xLen * yLen;
		int perim = (xLen * 2) + (yLen * 2);
		
		System.out.print("Stačiakampio plotas ('m2') yra: " + plot);
		System.out.print("Stačiakampio perimteras yra: " + perim);
		
		ivesk.close();

	}

}
