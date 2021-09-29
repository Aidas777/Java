package NdOroTemp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Oras {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("OroT.txt"));
		LinkedList <Integer> saras=new LinkedList<>();
		
		
		while (in.hasNextInt()) {
			saras.add(in.nextInt());
		}
		
		int tmax=0;
		for (Integer temp:saras) {
			if (tmax<temp) {
				tmax=temp;
			}
		}
		
		int tmin=tmax;
		for (Integer temp:saras) {
			if (tmin>temp) {
				tmin=temp;
			}
		}
		
		int tsum=0;
		int tavg=0;
		for (Integer temp:saras) {
			tsum=tsum+temp;
			tavg =tsum /saras.size();
		}
		
		System.out.println(saras);
		System.out.println("Auksciausia temperatura: " +tmax);
		System.out.println("Zemiausia temperatura: " +tmin);
		System.out.println("Temperaturu vidurkis: " +tavg);
//		System.out.println(saras.get(2));
	}

}
