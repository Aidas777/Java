package Panaudojimas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import java.util.List;

public class Vykdymas {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("dataD.txt"));
		
//		LinkedList<Integer> l = new LinkedList<>();
		List<Integer> l = new LinkedList<>();
		
		
		Integer y=in.nextInt();
		while (y!=0 ) {
			l.add(y);
			y=in.nextInt();
		}

		System.out.println(l);
	}

}
