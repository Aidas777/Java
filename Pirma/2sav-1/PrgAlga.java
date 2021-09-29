import java.util.Scanner;

public class PrgAlga {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Ivesktie kiek gausite idarbinimo metu: ");
		int alga = in.nextInt();
		System.out.println("Ivesktie kiek kas menesi dides alga: ");
		int padidejimas = in.nextInt();
		
		int men=0;
		int algaE=alga;
		while (algaE<alga*2) {
			men++;
			algaE+=padidejimas;
		}

		System.out.println("Jus gausite dviegubai po " + men + " men.");
	}

}
