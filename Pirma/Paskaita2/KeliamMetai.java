import java.util.Scanner;

public class KeliamMetai {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Iveskite metus: ");
		int i = in.nextInt();
		
		if (i % 400 == 0) {
			System.out.println("Metai YRA keliamieji ir dalinasi is 400.");
		} else {
		
			if ((i % 4 == 0) && (i % 100 != 0) ) {
				System.out.println("Metai YRA keliamieji, nors nesidalina is 400.");
			} else {
				System.out.println("Metai NERA keliamieji ir nesidalina is 400");
			}
		}
		
		in.close();
	}

}
