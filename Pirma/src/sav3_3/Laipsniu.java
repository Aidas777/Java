package sav3_3;

public class Laipsniu {
	
	public static int laipsniu(int x, int n) {
		int rez=1;
		for (int i = 0; i<n;i++) {
			rez=rez*x;
		}
		return rez;
	}
	
	public static int laipsniu(int x) {
		return laipsniu(x,2);
	}
	
	public static void main(String[] args) {
		System.out.println( laipsniu(5));
		System.out.println( laipsniu(3));

	}

}
