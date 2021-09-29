import java.util.Scanner;

public class Skaic {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Iveskite skaiciu: ");
		int n=in.nextInt();
		
		int suma = 0;
		while (n!=0) {
			suma=suma+n % 10;
			n = n /10;
		}
		System.out.println("Skaitmenu suma: " + suma);

	}

}
