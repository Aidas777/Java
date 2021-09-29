package PvmRedo;

public class Vykdymas {

	public static void main(String[] args) {
		
		Preke p1 = new Preke("Obuolys",1,10);
		
		System.out.println(p1);

		p1.setPvmas(new pvm21());
		
		System.out.println(p1.getKainaSu());
	}

}
