package NdTelefKn;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TelefKnyga {

	public static void main(String[] args) {
		
		TreeMap< Pavarde, LinkedList <TelNr> > kn=  new TreeMap<>();
		
		kn.put(new Pavarde("Jonaitis"), new LinkedList<>());
		
		kn.get(new Pavarde("Jonaitis")).add(new TelNr("8670512223"));
		kn.get(new Pavarde("Jonaitis")).add(new TelNr("867058656"));
		kn.get(new Pavarde("Jonaitis")).add(new TelNr("1125544574"));
		
		
		kn.put(new Pavarde("Petraitis"), new LinkedList<>());
		
		kn.get(new Pavarde("Petraitis")).add(new TelNr("+370555123"));
		kn.get(new Pavarde("Petraitis")).add(new TelNr("+364546987"));
		kn.get(new Pavarde("Petraitis")).add(new TelNr("+365465484"));
		
		kn.put(new Pavarde("aa"), new LinkedList<>());
		
		kn.get(new Pavarde("aa")).add(new TelNr("8370555123"));
		kn.get(new Pavarde("aa")).add(new TelNr("8364546987"));
		kn.get(new Pavarde("aa")).add(new TelNr("8365465484"));
		

		
		
		
//		System.out.println(  kn.get(new Pavarde("Petraitis"))  );
		
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite pavarde: ");
		String pavIn=in.next();
		System.out.println("Iveskite nauja telefono nr: ");
		String TelIn=in.next();
		
		kn.get(new Pavarde(pavIn)).add(new TelNr(TelIn));
		
		
		
		System.out.println(pavIn+" numeriai: " +  kn.get(new Pavarde(pavIn))  );
		
		System.out.println();
		System.out.println("Visos pavardes: ");
		for (Pavarde p : kn.keySet()) {
			System.out.print(p+", ");
		}
		
		
		
//		System.out.println( kn. );
	}

}
