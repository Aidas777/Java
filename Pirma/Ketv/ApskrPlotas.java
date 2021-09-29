import java.util.Scanner;

public class ApskrPlotas {

	public static void main(String[] args) {

		double s = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Iveskite skrituliuku skaiciu N: ");
		int n = in.nextInt();

		System.out.println("Iveskite pirmojo skritulio spinduli R: ");
		double r = in.nextDouble();

		for (int k = 1; k <= n; k++) {

			s = s + Math.PI * Math.pow(r, 2);
			r = r * 2;
		}

		System.out.printf("Visu " + n +" apskritimu bendras plotas yra: %5.2f", s);
		in.close();
	}

}
