package lapai;

import java.util.Scanner;

public class Ifai {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Ivesk pirma sk: ");
		int sk = in.nextInt();

		double liekana = sk % 2;

		if (liekana == 0) {
			System.out.println("Skaicius yra lyginis " + liekana);
		} else {
			System.out.printf("Skaicius yra NElyginis %4.2f", liekana);
		}

		in.close();

	}

}
