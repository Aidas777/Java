package NdGyvunai;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class NdVykdGyvunai {

	public static void main(String[] args) {
		
//		Zuvis aukse = new Zuvis("Aukse","Zuvis",10);
//		Ziurkenas antanas = new Ziurkenas("Antanas","Ziurkenas",10, "baltas");
		
		LinkedList<Gyvunas> glist = new LinkedList<>();
//		LinkedList<Gyvunas> Ziurkenas = new LinkedList<>();
		
		glist.add(new Zuvis("Aukse",10));
		glist.add(new Zuvis("Zuke",8));
		glist.add(new Zuvis("Plaukike",4));
		glist.add(new Ziurkenas("Zandis", 10, "baltas"));
		glist.add(new Ziurkenas("Elbas", 4, "rudas"));
		glist.add(new Ziurkenas("Elbas", 12, "zalias"));

		Collections.sort(glist);

		
		for (Gyvunas g: glist) {
			System.out.println(g);
		}
		
		
		System.out.println("-------------------------------");
		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite ieskomo gyvuno varda: ");

		String gvard=in.next();

		
	

        System.out.println("-------------------------------");
        


        int rastaSk=0;
        for (int i = 0; i < glist.size(); i++) {
        	if (glist.get(i).vardas.equalsIgnoreCase(gvard)) {
        		System.out.println(glist.get(i));
        		rastaSk++;
        	}

        }
		
        if (rastaSk==0) {
        	System.out.println("Toks gyvunas " + gvard + " NERASTAS !");
        }
//		System.out.println(glist.get(new Gyvunas(new gvard)));
		
		
//		System.out.println(Ziurkenas);
		
//		System.out.println(g);
	}
}
