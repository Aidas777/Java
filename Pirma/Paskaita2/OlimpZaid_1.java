import java.util.Scanner;

public class OlimpZaid_1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Iveskite tikrinamus metus: ");
		int m = in.nextInt();
		
		if (m < 1896) {
			System.out.println("Olimpinės žaidynės dar neprasidėjo (jų pradžia 1896m.)");
		} else {
			if ((m - 1896) % 4 == 0) {
				int olNr = ((m - 1896) / 4) + 1;
				System.out.println("Metai yra olimpiniai ir olimpinų žaidynių nr. yra: " + olNr);
			} else {
				System.out.println("Metai NE olimpiniai");
			}
		}
		
		in.close();
	}

}
