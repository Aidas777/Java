import java.util.Scanner;

public class Pazymiai {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite studento semestro pazymius (abu): ");
		
		
		int p1=in.nextInt();
		int p2=in.nextInt();

		System.out.println("Iveskite egzo pazimi: ");
		int eg=in.nextInt();
		
		int gal= (int) Math.round( ( (p1+p2)/2.0 + eg)/2.0);
		
//		System.out.println("Galutinis vidurkis:" + gal);
		
		switch (gal) {
			case 10:
				System.out.println("10 - puikiai");
				break;
			case 9:
				System.out.println("9 - labai gerai");
				break;
			case 8:
				System.out.println("8 - gerai");
				break;
			case 7:
				System.out.println("7 - vidutiniskai");
				break;
			case 6:
				System.out.println("6 - patenkinamai");
				break;
			case 5:
				System.out.println("5 - silpnai");
				break;
			case 4:
			case 3:
			case 2:
			case 1:
				System.out.println("nepatenkinamai");
				break;
		}
	}

}
