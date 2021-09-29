package Pvm;

public class Vykdymas {

	public static void main(String[] args) {
		
		Preke a1=new Preke("Duona",1,10);
		Preke a2=new Preke("Arbuzas",1,5);
		Preke s1=new Preke("Laikrastis",3, 1.5);
		
//		System.out.println(s1.getTipas());
		
		
		a1.setPvmas(new Pvm9());
		System.out.println(a1.getKainaSu());
		
		a1.setPvmas(new PvmLengvatinis());
		System.out.println(a1.getKainaSu());
	}
	
}
