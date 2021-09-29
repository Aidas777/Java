import java.util.Scanner;

public class MenDienos {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Iveskite metus, menesi ir diena: ");
		
		int metai = in.nextInt();
		int menuo = in.nextInt();
		int diena = in.nextInt();
		
		int dienu = 0;
		
		switch (menuo) {
		case 12:
//			dienu = dienu +30;
			dienu+= 31;
		case 11:
			dienu += 31;
		case 10:
			dienu += 30;
		case 9:
			dienu += 31;
		case 8:
			dienu += 31;
		case 7:
			dienu += 30;
		case 6:
			dienu += 31;
		case 5:
			dienu += 30;
		case 4:
			dienu += 31;
		case 3:
			dienu += 28;
		case 2:
			dienu += 31;
			
		}

		if (menuo > 2) {
		if (metai % 4==0 && metai % 400 !=0 || metai % 400 ==0)
			dienu++;
		}
		dienu+=diena;
		
		System.out.println("Nuo metu pradzios praejo dienu: " + dienu);
		

	}

}
