import java.util.Scanner;

public class Palukanos {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Ivesktie pradini indeli: ");
		double indelis = in.nextDouble();
		
		System.out.println("Ivesktie palukanu procenta: ");
		double pal = in.nextInt();
		pal = 1+ pal / 100;
		
		System.out.println(pal);
		
		System.out.println("Ivesktie siekiama suma: ");
		int ikiSumos = in.nextInt();
		
		int metai=0;
		while (indelis < ikiSumos ) {
			indelis = indelis *pal;

			metai++;
			System.out.println("Suma While: " + indelis);
		}
		
		System.out.println("Metai " + metai);
		
		
		

		in.close();
//		System.out.println("Suma bus padiekta po " + met + " metu.");

	}

}
