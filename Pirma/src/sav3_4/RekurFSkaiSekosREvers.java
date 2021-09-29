package sav3_4;

public class RekurFSkaiSekosREvers {
	
	public static void revers (int x) {
		if (x!=0) {
		System.out.print(x%10 +" ");
		revers(x/10);
		//System.out.print(x%10 +" "); //jei reikia apversti si eil turi buti sitoj vietoj
		}

	}

	public static void main(String[] args) {
	
		revers(1234);

	}

}
