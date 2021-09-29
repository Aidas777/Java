package sav3_4;

public class RekurFSkaiSekosSum {
	
	public static int skSuma (int x) {
		if (x==0) return 0;
		return skSuma(x/10) + x % 10;
	}

	public static void main(String[] args) {
	
		System.out.println(skSuma(321));

	}

}
