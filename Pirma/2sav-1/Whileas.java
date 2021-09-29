import java.util.Scanner;

public class Whileas {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite kiek turite plytu: ");
		
		int p=in.nextInt();
		
		int aukstis = 0;
		while (p>aukstis) {
			aukstis++;
			p=p-aukstis;
		}
		System.out.println("Galime pastatyti: " + aukstis);
		
		
		
	}
}
	
