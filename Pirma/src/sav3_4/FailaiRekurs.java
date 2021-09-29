package sav3_4;

import java.io.File;
import java.io.FileNotFoundException;

public class FailaiRekurs {

	public static void isvedimas(File f) {
		String[] names = f.list();
		for (int i = 0; i < names.length; i++) {
			System.out.print(f.getAbsolutePath() + "\\" + names[i]);
			File fi = new File(f.getAbsolutePath() + "/" + names[i]);
			System.out.println();
			if (fi.isDirectory()) {
				System.out.println("[katalogas]");
				isvedimas(fi);
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
//		isvedimas(new File("C:/Users/Aidas7/Desktop/Trinti lauk/"));
		isvedimas(new File("E:/wamp64/www/var6"));
	}



}
