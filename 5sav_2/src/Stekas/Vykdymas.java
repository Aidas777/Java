package Stekas;

import java.util.Scanner;

public class Vykdymas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int y =in.nextInt();
		Data d=null;
		
		while (y!=0) {
			Data t=new Data(y);
			t.next=d;
			d=t;
			y=in.nextInt();
		}
		
//		Data d= new Data(10);
//		d.next=new Data(9);
//		d.next.next=new Data(11);
//		d.next.next.next=new Data(19);
		
		
//		System.out.println(d.getData());
//		System.out.println(d.next.getData());
//		System.out.println(d.next.next.getData());
//		System.out.println(d.next.next.next.getData());
		
		Data t=d;
		while (t!=null) {
			System.out.println(d.getData());
			t=t.next;
		}
		t=d;
		while (d!=null) {
			System.out.println(d.getData());
			t=t.next;
		}
	}

}
