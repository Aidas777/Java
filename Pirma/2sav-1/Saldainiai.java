import java.util.Scanner;

public class Saldainiai {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite saldainiu skaiciu: ");
		
		int sald=in.nextInt();
		int dienos=0;
		int liko = 0;
		
		while (sald > 0) {
			
			dienos++;
			sald=sald-dienos;
		}
		
		System.out.println(dienos);

	}

}
