import java.util.Scanner;

public class CiklasColiai {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
//		System.out.println("Iveskite kokia daugybos lentele norite gauti: ");
//		int n = in.nextInt();

		for (int i = 1; i < 20; i++) {
			double n = i *2.54;
			double c = i / 2.54;

			System.out.printf("%d inc. - %5.2f cm.\t| %d cm. - %5.2f inc. \n",i,n,i,c );
//			printf("Pirmas kint: %d, antras kint: %f", a,b)
		}

		in.close();

	}

}
