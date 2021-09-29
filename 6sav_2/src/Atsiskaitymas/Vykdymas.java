package Atsiskaitymas;

public class Vykdymas {

	public static void main(String[] args) {
	
		
		int c=1;
		int a= 1;
		int b=0;
		try {
			c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			c=0;
			System.out.println(c);
		}
		
		int m[][]= {{4,3,2}, {5,6}};
		System.out.println(m[1][1]);

	}

}
