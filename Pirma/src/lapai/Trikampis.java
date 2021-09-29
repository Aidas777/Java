package lapai;

import java.util.Scanner;

public class Trikampis {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ivesktie trikampio krastiniu ilgius: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if (a<b+c && b<a+c && c<a+b) {
			System.out.println("Is ivestu krastiniu GALIMA sudaryti trikampi");
		} else {
			System.out.println("Is ivestu krastiniu NEgalima sudaryti trikampio");
		}

		in.close();
	}

}
