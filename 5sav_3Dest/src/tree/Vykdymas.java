package tree;

import java.util.TreeSet;

public class Vykdymas {

	public static void main(String[] args) {
		/*
		Tree t=new Tree();
		t.add(10);
		t.add(20);
		t.add(8);
		t.add(5);
		t.add(9);
		t.add(2);
		t.add(3);
		t.add(11);
		
		t.print();
		
		t.count();
		*/
		
		
		
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(8);
		ts.add(9);
		ts.add(6);
		ts.add(12);
		ts.add(14);
		
		if (ts.contains(12)) {
			
		}
		
		for (Integer i:ts) {
			System.out.print(i+" ");
		}
		
		TreeSet<Studentas> stud=new TreeSet<>();
		stud.add(new Studentas("Jonas", "Jonaitis", 10));
		stud.add(new Studentas("Petras", "Petraitis", 6));
		stud.add(new Studentas("Kazys", "Kazlauskas", 10));
		stud.add(new Studentas("Jonas", "Biliunas", 10));
		
		System.out.println(stud);

	}

}
