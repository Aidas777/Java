import java.util.Scanner;

public class IvedimasWhile {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite skaiciu (pabaiga 0): ");

		int sk=0;
		try {
		sk=in.nextInt();
		} catch (Exception e) {
			in.nextLine();
			System.out.println("Ivedet ne skaiciu (pabaiga 0): ");
			sk=in.nextInt();
		}
		int suma = 0;
		int kartai=0;
		while (sk!=0) {
			suma=suma+sk;
			kartai++;
			
			System.out.print("Iveskite skaiciu (pabaiga 0): ");
			sk=in.nextInt();
		}
		
		double vid = (double) suma / kartai;
		System.out.println("Visu skaiciu suma: " + suma);
		System.out.printf("Visu skaiciu vidurkis: %5.2f" , vid);
	}

}
