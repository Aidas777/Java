import java.util.Scanner;

public class PirminiaiSk {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite nuo kurio iki kurio skaiciau tikrinti: ");
		int n = in.nextInt();
		int m = in.nextInt();
		
		for (int a=n; a<=m;a++) {
		
			boolean pirminis = true;
			for (int y = 2; y <a; y++) {
				if (a % y == 0 ) {
					pirminis = false;
					break;
				} 
			}
			
			if (pirminis) {
				System.out.println(a + " - Pirminis");
			} else {
				System.out.println(a + " - Nepirminis");
			}
		}
		
		in.close();
	}
}
