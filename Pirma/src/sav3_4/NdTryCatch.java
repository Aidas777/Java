package sav3_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NdTryCatch {

	public static void main(String[] args) {
		


		String re="";
		while (re.equals("T") || re.equals("t") || re.equals("")) {
			
			Scanner in = new Scanner(System.in);
			Scanner inTN =new Scanner(System.in);
			
			re=null;
			double a=0;
			double b=0;
			
//			System.out.println("re: " + re);
			System.out.println("Ivesktite du skaicius a b: ");
			
			try {
				a = in.nextDouble();
				b = in.nextDouble();
				
				if (b==0) {
	//				System.out.println("Dalyba (ir NEsveikuju sk.) is 0 negalima !");
					throw new ArithmeticException();
					}
				double ats= (a / b);
			
				System.out.printf("Skirtumas yra:%5.2f"+" karto." , ats);
				
			} catch (InputMismatchException e) {
				System.out.println("Ivedete netinkamus duomenis !");
				System.out.println(e.getMessage()); //GALIMA DADETI SI PRANESIMA, GALIMA IR NE.
//				System.out.println("a: " + a + " /// b: " + b);
			} catch (ArithmeticException e) {
				System.out.println("Dalyba is 0 negalima !");
				System.out.println(e.getMessage());
//			} catch (NoSuchElementException e) {
//				System.out.println("Klaida: nera tokio elemento !");
			} catch (Exception e) {
				System.out.println("Ivyko nenumatyta klaida");
				System.out.println(e.getMessage());
			}

			System.out.println();
			System.out.println("Ar norite kartoti veiksma?: T(taip), N(ne)");
			re=null;
			re=inTN.next();

				while (!re.equalsIgnoreCase("T") && !re.equalsIgnoreCase("N")) {
					re="";
					System.out.println("Iveskite T (taip), arba N (ne) !");
//					System.out.println("B (baigti darba)");
					re=inTN.next();
//					if (re.equalsIgnoreCase("B")) System.exit(0);
				}
//			}
//			System.out.println("re: " + re);
			
//			if (re.equals("T") || re.equals("t")) {
//				System.out.println(re + " = t");
//			} else {
//				System.out.println(re + " NE = t");
//			}
			
			
		} 
//		in.close();
//		inTN.close();

	}

}
