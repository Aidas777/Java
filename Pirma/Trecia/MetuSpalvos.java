import java.util.Scanner;

public class MetuSpalvos {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite metus: ");
		int metai = in.nextInt();
		

		if (metai >= 1000) {
			metai = metai % 1000;
			if (metai >= 100) {
				metai = metai % 100;
			}
			if (metai >=10) {
				metai = metai % 10;
			}
		} else {
			System.out.println("Nurodykite metus bent jau vėlesnius nei 1000-ieji.");
			in.close();
			return;
		}
		
		switch (metai) {
		
			case 0:
			case 1:
				System.out.println("Metu spalva yra - BALTA.");
				break;
				
			case 2:
			case 3:
				System.out.println("Metu spalva yra - JUODA.");
				break;
				
			case 4:
			case 5:
				System.out.println("Metu spalva yra - ŽALIA.");
				break;
				
			case 6:
			case 7:
				System.out.println("Metu spalva yra - RAUDONA.");
				break;
				
			case 8:
			case 9:
				System.out.println("Metu spalva yra - GELTONA.");
				break;
				
		}
		
		
		
		in.close();
	}

}
