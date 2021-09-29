package sav3_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Failai {

	public static void paieska(File f, String name) {
		String[] names = f.list();
		for (int i = 0; i < names.length; i++) {
			File fi = new File(f.getAbsolutePath() + "/" + names[i]);
			if (names[i].equals(name)) {
				System.out.println(fi.getAbsolutePath());
			}
			if (fi.isDirectory()) {
				paieska(fi, name);
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite kataloga kuriame ieskosime failu: ");
		String dir = in.next();
		System.out.println("Iveskite faila kurio ieskosime: ");
		String file = in.next();
		paieska(new File(dir), file);

		// in.close();
	}
}
