package sav4_1;

public class TrupmenaVykd {

	public static void main(String[] args) {
		Trupmena t=new Trupmena(2,2,7);
//		t.setSkaitiklis(5);
//		t.setDaliklis(6);
		
//		t.sveikojiDalis=5;
//		t.skaitiklis=3;
//		t.daliklis=7;
		
		t.prideti(6,7);
		t.prideti(2,5,7);
		
		Trupmena t1=new Trupmena(1,2); //atimam is
		Trupmena t2=new Trupmena(1,3); //atimam ka
		
		t1.atimti(t2);
		
		System.out.println(t1.toDouble());

	}

}
