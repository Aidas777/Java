package lapai;

import java.util.Scanner;

public class DienuSkaiciav {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite dienos Nr: ");
		
		int diena = in.nextInt();
		
		int savDiena=(diena+4) % 7;
		
		if (savDiena==1) System.out.println("Primadienis");
		if (savDiena==2) System.out.println("Antradienis");
		if (savDiena==3) System.out.println("Trec");
		if (savDiena==4) System.out.println("Ketv");
		if (savDiena==5) System.out.println("Penkt");
		if (savDiena==6) System.out.println("Sest");
		if (savDiena==0) System.out.println("Sekm");
		
		in.close();
	}

}
