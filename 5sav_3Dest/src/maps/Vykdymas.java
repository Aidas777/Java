package maps;

import java.util.TreeMap;

public class Vykdymas {
	public static void main(String[] args) {
		
		TreeMap<SID, Studentas> stud=new TreeMap<>();
		stud.put(new SID(1, 1),  new Studentas("Jonas", "Jonaitis", 8));
		stud.put(new SID(1, 2), new Studentas("Petras", "Petraitis", 9));
		stud.put(new SID(2, 1),  new Studentas("Kazys", "Kazlauskas", 10));
		
		//stud.get(2).setPazimys(5);
		
		System.out.println(stud);
		
		System.out.println( stud.get(new SID(2,1)) );
		
		
		
	}
}
