package Failai;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Vykdymas {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner in = new Scanner(System.in);
		
		File f= new File("studentai");
		List<Studentas> sarasas=new LinkedList<>();
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		sarasas=(List<Studentas>)ois.readObject();
		ois.close();
		
		int i=-1;
		while (i !=0) {
			System.out.println("1. Prideti studenta");
			System.out.println("2. Rodyti studentus");
			System.out.println("0. Baigti darba");
			System.out.println("Iveskite ka norite daryti: ");
			i=in.nextInt();
			if (i==1) {
				System.out.println("ivesk stud varda: ");
				String vardas = in.next();
				System.out.println("ivesk stud pazimi: ");
				int pazimys = in.nextInt();
				
				sarasas.add(new Studentas(vardas, pazimys));
			}
			if (i==2) {
				System.out.println(sarasas);
			}
		}
		
		

		
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(sarasas);
		
		oos.close();
		

		
		in.close();
	}

}
