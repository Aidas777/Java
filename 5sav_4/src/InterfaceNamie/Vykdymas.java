package InterfaceNamie;

public class Vykdymas {

	public static void main(String[] args) {
		
		Mokinys mok = new Mokinys("Petras",9);
		Mokinys mok2 = new Mokinys("Astijus",7);
		
//		mok.setPazRez(mok.getPazimys());
//		mok.setPazimys(4);
//		mok.SkaiciuokPaz(new Skaiciuok());
		mok.setPazRez(new Skaiciuok());
		mok2.setPazRez(new Skaiciuok3());
		
		System.out.println(mok);
		System.out.println(mok.SkaiciuokPaz());
		System.out.println("------------------------");
		
		
		System.out.println(mok2);
		System.out.println(mok2.SkaiciuokPaz());
//		System.out.println(mok.getPazRez());

	}

}
