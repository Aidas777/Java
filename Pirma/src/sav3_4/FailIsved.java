package sav3_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FailIsved {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		System.out.println("iveskite failo pavadinima: ");
		
		String s=in.next();
		
		try {
			File f=new File(s);
			Scanner fin=new Scanner(f);
		
			while (fin.hasNext()) {
				System.out.println(fin.nextLine());
				}
		} catch (Exception e) {
			System.out.println("Failas nerastas");
			
		}

	}

}
