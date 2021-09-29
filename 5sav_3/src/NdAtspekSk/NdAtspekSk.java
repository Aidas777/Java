package NdAtspekSk;

import java.util.Scanner;
import java.util.TreeSet;

public class NdAtspekSk {

	public static void main(String[] args) {
		
		int pcSk= (int) (Math.random()*100);
		
		
		System.out.println("Bandykite ivede nuo 0-100 atspeti skaiciu, kuri kompas sumislyjo: ");

		Scanner in = new Scanner(System.in);
		int inSk=in.nextInt();

		/// CIA TBTI IDEJIMAS I SETA
		
		TreeSet<Integer> PanaudotiSk = new TreeSet<>();
		
		
		while (inSk !=pcSk) {
			
			
			while (PanaudotiSk.contains(inSk)==true) {
				System.out.println("Toki skaiciu jau bandete ivesti. Iveskite kita skaiciu: ");
				inSk=in.nextInt();
			}
			
			PanaudotiSk.add(inSk);
			
			if (inSk>pcSk) {
				System.out.println("Ivedete perDIDELI skaiciu !");
			} else if (inSk<pcSk) {
				System.out.println("Ivedete perMAZA skaiciu !");
			} else {
				
			}
			inSk=in.nextInt();
		}
		System.out.println("BINGO PARABINGO !!! Jus ATSPEJOTE SKAICIU ! Jis buvo: " + pcSk);

	}

}
