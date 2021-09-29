package sav3_3;

import java.util.Arrays;

public class Masyvai {
	
	public static int [] add(int[] m, int data) {
		int t [] = new int [m.length+1];
		for (int i=0; i<m.length; i++) {
			t[i]=m[i];
		}
		t[t.length-1]=data;
		return t;
	}
	
	public static int [] del(int[] m, int index) {
		int t [] = new int [m.length-1] ;
		for (int i=0;i<index;i++) {
			t[i]=m[i];
		}
		
		for (int i=index;i<t.length;i++) {
			t[i]=m[i+1];
		}
		
		return t;
	}
	
	

	public static void main(String[] args) {
		int m [] = {3,7};
		
		System.out.println(Arrays.toString(m));
		m=add(m,8);
		m=add(m,7);
		m=add(m,9);
		
		m=del(m,2);
		m=del(m,3);
		System.out.println(Arrays.toString(m));
	}

}
