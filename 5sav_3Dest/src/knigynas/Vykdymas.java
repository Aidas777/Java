package knigynas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Vykdymas {

	public static void main(String[] args) throws IOException {
	
		Map<Autorius, ArrayList<Knyga> > k=new TreeMap<>();
		
		k.put(new Autorius("Jonas", "Biliūnas"), new ArrayList<>());
		
		
		k.get(new Autorius("Jonas", "Biliūnas")).add(new Knyga("Brisiaus galas",3));
		k.get(new Autorius("Jonas", "Biliūnas")).add(new Knyga("Kliudžiau",3));
		
		k.put(new Autorius("Salomėja", "Nėris"), new ArrayList<>());
		k.get(new Autorius("Salomėja", "Nėris")).add(new Knyga("Per lūžtantį ledą", 100));
		k.get(new Autorius("Salomėja", "Nėris")).add(new Knyga("Saulė", 50));
		
		FileOutputStream fos=new FileOutputStream(new File("knygynas.txt"));
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(k);
		oos.close();
		
		System.out.println(k);

	}

}
