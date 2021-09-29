package lapai;

import java.util.Scanner;

public class Salyginis {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.print("Ivewskit pirma sk: ");
		int x=in.nextInt();
		
		System.out.print("Ivewskit sntra sk: ");
		int y=in.nextInt();
		
		
		int i = 5;
		int z = i & 3;
	
		
		
		if ((x==y) && ((x>10) || (y==0))) {
			System.out.println("Skaiciai yra lygus, arba ivestas 0");
		} else {
			System.out.println("Skaiciai yra NElygus ir ne nuliai");
		}
		
		System.out.println("Programa baige darba");
		
		in.close();

	}

}
