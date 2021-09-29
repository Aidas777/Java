package sav3_4;

public class RekurFLaipsniu {
	
	public static int laipsniu(int x, int n) {
		if (n==1) return x;
		return laipsniu(x,n-1)*x;
	}
	

	public static void main(String[] args) {
		
		System.out.println(laipsniu(5,3));

	}

}
