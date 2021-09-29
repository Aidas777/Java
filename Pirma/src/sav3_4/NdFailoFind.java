package sav3_4;

import java.io.File;
import java.util.Scanner;

public class NdFailoFind {
	//E:\wamp64\www
	// index.php
	
//	public static void isvesk(String x) {
//		System.out.println(x);
//	}
	
	public static void failas(File p, String filas) {
		
//		System.out.println(filas);
//		boolean rasta = false;
		

		String names[]=p.list();
		
		for (int i=0; i<names.length;i++) {
//			System.out.print(f.getAbsolutePath()+"\\" +names[i]);
			File fi = new File(p.getAbsolutePath()+"/"+ names[i]);
			
			if (names[i].equals(filas)) {
				System.out.println("Failas rastas: " +p.getAbsolutePath()+"\\"+ names[i]);
//				rasta=true;
//				return f.getAbsolutePath()+"\\"+ names[i];
			}
			
//			System.out.println();
			if (fi.isDirectory() ) {
//				System.out.println("[katalogas]");
				failas(fi, filas);
			}
//			} else {

//			}
//			System.out.println(names[i] + " ///// filas: " + filas);

		}
		
	}
	public static void main(String[] args) {
		
		String papke = "E:/wamp64/www/var6";
		System.out.println("Paeiskos katalogas yra: " + papke);
		
		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite failo pavadinima paeieskai: ");
		String filas= in.next();
		
//		String filas = "index.php";
		
		File p=new File(papke);
		failas(p, filas);


	}
}
