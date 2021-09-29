import java.util.Scanner;

public class LaikVersk {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Iveskite valanda: ");
		int h = in.nextInt();
		
		System.out.println("Iveskite minutes: ");
		int m = in.nextInt();
		
		System.out.println("Iveskite sekundes: ");
		int s = in.nextInt();
		
		if (h<0 || m<0 || s<0) {
			System.out.println("Laiko formatas netinkamas");
			in.close();
			return;
		}
		
		s++;
		if (s >= 60) { 
			m = m + s / 60;
			s = s % 60;
		}
		
		if (m >= 60) {
			h = h + m / 60;
			m = m % 60; 
		}

		if (h >= 24) {
			h = h % 24;
		}
		
		System.out.println("Po sekundes laikrodis rodis: " + h + " val. " + m + " min. " + s + " s ");
		
		in.close();
	}

}
