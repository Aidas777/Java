package Panaudojimas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Stekas.Sarasas;

public class Vykdymas {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in=new Scanner(new File("data.txt"));
		
		List<Integer> l=new LinkedList<>();
		
		
		
		while (in.hasNextInt()) {
			l.add(in.nextInt());
		}
		
		System.out.println(l);

	}

}
