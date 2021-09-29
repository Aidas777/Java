import java.util.Scanner;

public class Foras {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
//		System.out.println("Iveskite kokia daugybos lentele norite gauti: ");
//		int n = in.nextInt();

		for (int i = 0; i < 10; i++) {

//			System.out.println(n + " * " + i + " \t= " + (n * i));
			
			for (int y = 0; y<10;y++) {
				if (i==4 || i==5 || i == y || i==9-y || y == 4 || y==5) {
					System.out.print(" ");
				} else {
				System.out.print("*");
				}
			}
			System.out.println();
		}

		in.close();
	}

}
