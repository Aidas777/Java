import java.io.*;
import java.util.Scanner;

public class SkaitIsFailo {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner inC = new Scanner(System.in);
		
		System.out.print("Is kokio failo skaityti duomenys: ");
		String f=inC.next();
		
		Scanner in = new Scanner(new File(f));
		
		int n = in.nextInt();
		int suma = 0;
		for (int i=1; i<=n; i++) {
			int t=in.nextInt();

		
			suma=suma+t;
			System.out.println(i + " d.Temperatura:" +t);
			
		}

		System.out.println("Visu temperaturu suma: " + suma);
				
		in.close();
		inC.close();
	}

}
