package sav2_2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MoksleivioSk {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("duom.txt"));
		
		int [] sk = new int[10];
		int nr;
		int n;
		int i;

		
		while (in.hasNextInt()) {
			int k = in.nextInt();
			
			sk[k]++;
			
						
//			nr = in.nextInt();
//			if (nr==in.nextInt()) {
//				sk [nr] = nr;
//			}
		}
		
		
		
		for (i=0; i<10;i++) {
			System.out.print(sk[i] +", ");
		}
		
		
		in.close();

	}

}
