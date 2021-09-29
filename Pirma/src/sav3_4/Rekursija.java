package sav3_4;

public class Rekursija {
	
	public static int faktorialas(int n) {
		if (n==1) {
			return 1;
		} else {
			return faktorialas(n-1)*n;
		}
	}

	public static void main(String[] args) {
		
		System.out.println(faktorialas(3));
	
	}

}
