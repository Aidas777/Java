package Statiniai;

public class Vykdymas {

	public static void main(String[] args) {
		Darbuotojas jonas = new Darbuotojas("Jonas");
		Darbuotojas petras = new Darbuotojas("Petras");
		
//		Darbuotojas nezinomas=(new Darbuotojas("Kostas")).getNoName();
//		Darbuotojas nezinomas1=Darbuotojas.getNoName();
//		Darbuotojas nezinomas2=Darbuotojas.getNoName();
//		Darbuotojas nezinomas3=Darbuotojas.getNoName();
		
		Darbuotojas nezinomas1=new Darbuotojas("Jinas");
		Darbuotojas nezinomas2=new Darbuotojas("Petras");
		Darbuotojas nezinomas3=new Darbuotojas("Vasia");
		
//		Darbuotojas.id=8;

		System.out.println(jonas);
		System.out.println(petras);
		System.out.println(nezinomas1);
		System.out.println(nezinomas2);
		System.out.println(nezinomas3);
		
		System.out.println("Nezinomu daruotoju " + Darbuotojas.id);
	}

}
