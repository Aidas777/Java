import java.io.*;
import java.util.Scanner;

public class ArmstrSk {

	public static void main(String[] args) throws FileNotFoundException {

		int sk, vRiba;
		int sk1 = 0;
		int sk2 = 0;
		int sk3 = 0;
		int sk4 = 0;
		int laip=0;
		int laipsnis = 3;

		Scanner in = new Scanner(new File("ArmSk.txt"));
		vRiba = in.nextInt();
		String laipStr=String.valueOf(vRiba);
		laip = laipStr.length();
		
		System.out.println("Armstrongo skaiciai intervale nuo 1 iki " + vRiba + "\n (skaitmenu kelimo laipsniai: " +laipsnis + "-"+ laip + "): ");

		for (laipsnis = 3; laipsnis <= laip;laipsnis++) {
			for (sk = 1; sk <= vRiba; sk++) {
	
				if (sk < 100) {
					sk = 100;
				}
	
				sk1 = sk / 1000;
	
				sk2 = (sk / 100) % 10;
	
				sk3 = (sk % 100)/10;
				
				sk4 = ((sk % 1000)%100)%10;
	//			int nr1= (int) Math.pow(sk,3);
	//			System.out.println("sk: " +sk + " /  sk1: " + sk1 + " /  sk2: " + sk2 + " /  sk3: " + sk3 + " /  sk4: " + sk4);
	
				int a = (int) Math.pow(sk1, laipsnis) + (int) Math.pow(sk2, laipsnis) + (int) Math.pow(sk3, laipsnis) + (int) Math.pow(sk4, laipsnis);
				if (a == sk) {
					System.out.println(a + " ("+laipsnis+" laipsniu)");
				}
			}
		}

	}

}
