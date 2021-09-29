package Stekas;

import java.util.Scanner;

public class Vykdymas {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		//Stack<Integer> s=new Stack<>();
		Sarasas<Integer> s=new Sarasas<>();
		
		Integer y=in.nextInt();
		while (y!=0) {
			s.add(y);
			y=in.nextInt();
		}
		
		s.add(2,10);
		s.remove(3);
		System.out.println("Antras elementas: "+s.get(4)); 
		
		
		while (! s.isEmpty()) {
			System.out.print(s.get()+" ");
		}
		
		
	}

}
