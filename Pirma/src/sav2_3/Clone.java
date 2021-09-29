package sav2_3;

import java.util.Arrays;

public class Clone {

	public static void main(String[] args) {
		int m[]= {2,3,5};
		
		int t[]=m.clone();
		
		t[0]=99;
		
		System.out.println(Arrays.toString(m));
		System.out.println(Arrays.toString(t));

	}

}
