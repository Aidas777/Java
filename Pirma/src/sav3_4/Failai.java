package sav3_4;

import java.io.File;
import java.io.FileNotFoundException;

public class Failai {
	
	public static void isvedimas(File f) {
//		System.out.println(f.getAbsoluteFile());
//		return;
		String names [] = f.list();
		
		for (int i = 0; i<names.length;i++) {
			System.out.print(names[i]);
			File fi=new File(f.getAbsoluteFile() + "/" +names[i]);
			if (fi.isDirectory()) {
				System.out.print(" [katalogas]");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		//C:\Users\Aidas7\Desktop\Trinti lauk\

//		Scanner in = new Scanner(new File (""));
		isvedimas(new File("C:/Users/Aidas7/Desktop/Trinti lauk/"));

	}

}
