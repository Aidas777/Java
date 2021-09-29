import java.io.*;

import java.util.Scanner;

public class KlasesVidurk {

	public static void main(String[] args) throws FileNotFoundException {


		Scanner inF = new Scanner(System.in);
		System.out.println("Nurodykite faila: ");
		String f = inF.next();
		
		Scanner in = new Scanner(new File(f));
		
		int n = in.nextInt();
		// klvid.txt
		
		double vid = 0;
		
		for (int i=1; i<=n; i++) {
			int v = in.nextInt();
			vid = (vid +v);
		}
		vid = vid / n;
		System.out.printf("%5.2f", vid);

	}

}
