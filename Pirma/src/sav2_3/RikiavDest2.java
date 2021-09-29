package sav2_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class RikiavDest2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in=new Scanner(new File("klvid.txt"));
		int n=in.nextInt();
		int m[]=new int[n];
		
		for (int i=0; i<n;i++) {
			m[i]=in.nextInt();
		}
		
//		for (int i=0; i<n;i++) {
//			System.out.print(m[i]+" ");
//		}
		
		System.out.println(Arrays.toString(m));
		System.out.println();
		
	
		for (int i=0;i<n-1;i++) {
			for (int y=i+1; y<n;y++) {
				if (m[i]<m[y]) { //cia keiciam zenkla < jei reikia mazejancia tvarka
					int t=m[i];
					m[i]=m[y];
					m[y]=t;
				}
			}
		}
//		for (int i=0; i<n;i++) {
//			System.out.print(m[i]+" ");
//		}
		
		System.out.println(Arrays.toString(m));
		System.out.println();

	}

}
