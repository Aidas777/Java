package sav3_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FailIsveDest {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		Scanner fIn = null;

		do {
			System.out.print("Įveskite failo pavadinimą: ");
			String s = in.next();
			try {
				File f = new File(s);
				fIn = new Scanner(f);
			} catch (Exception e) {
				System.out.println("Failas nerastas");
				fIn = null;
			}
		} while (fIn == null);

		while (fIn.hasNext()) {
			System.out.println(fIn.nextLine());
		}

	}

}