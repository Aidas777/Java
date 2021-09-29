package Studentai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Vykdymas {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in=new Scanner(new File("studentai.txt"));
		List<Studentas> l=new LinkedList<>();
		
		while (in.hasNext()) {
			String vardas=in.next();
			String pavarde=in.next();
			int pazimys=in.nextInt();
			l.add(new Studentas(vardas, pavarde, pazimys));
		}
		
		System.out.println(l);
		
		Studentas geriausias=l.get(0);
		for (Studentas s:l) {
			if (geriausias.getPazimys()<s.getPazimys()) {
				geriausias=s;
			}
		}
		System.out.println("Geriausiai besimokantis studentas: "+geriausias);
		

	}

}
