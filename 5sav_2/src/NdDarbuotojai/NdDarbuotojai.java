package NdDarbuotojai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NdDarbuotojai {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("darbuot.txt"));
		
//		ArrayList <String> Employee = new ArrayList<>();
		ArrayList<Employee> dlist= new ArrayList<>();
		
		while(in.hasNext()) {
			String vardas=in.next();
			String pavarde=in.next();
			String email=in.next();
			Double alga=in.nextDouble();
			
			dlist.add(new Employee(vardas, pavarde, email, alga));
		}
		
//		System.out.println(dlist.size());
		
		double algaSum=0;
		for (int i=0;i<dlist.size();i++) {
			algaSum=algaSum+dlist.get(i).getAlga();
		}
		
		System.out.println(dlist);
		System.out.println("Darbuotoju algoms reikes: "+algaSum);
		

	}

}
