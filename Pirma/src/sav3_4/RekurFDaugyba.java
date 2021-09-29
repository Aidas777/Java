package sav3_4;

public class RekurFDaugyba {
	
	public static int daugink(int x, int y) {
		if (y==1) return x;
		return x+daugink(x,y-1);
	}
	

	public static void main(String[] args) {
		
		System.out.println(daugink(8,10));

	}

}
