package Mass;

public class Mas {
	
	 static void swap(int x [], int i, int j) {
		int a=x[i];
		x[j]=x[i];
		x[i]=a;
	}

	public static void main(String[] args) {
		
		int x [] = {1,2,3,4};
		swap(x, 1, 2);
		System.out.println(x[2]-x[1]);


	}

}
