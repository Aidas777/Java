package Nuolaidos;

public class Vykdymas {

	public static void main(String[] args) {
		Pirkejas p1=new Pirkejas("Jonas","Jonaitis", 1100, 600);
		Pirkejas p2=new Pirkejas("Petras","Petraitis", 300, 100);
		Pirkejas p3=new Pirkejas("Kazys","Kazlauskas", 800, 400);
		
		p1.setNuolaidaI(new NuolaidaInterface() {
			
			@Override
			public int nuolaidaI(double isleista, double isleistaNem) {
				int nuolaida =0;
				
				if (isleista>=1000) nuolaida+=5;
				if (isleistaNem>=500) nuolaida+=5;
				if (isleistaNem>=250) nuolaida+=5;
				return nuolaida;
			}
		});
		
		System.out.println("Pirkejui " + p1.pavarde + " priklauso nuolaida: " + p1.nuolaida());
		System.out.println("Pirkejui " + p2.pavarde + " priklauso nuolaida: " + p1.nuolaida());
		System.out.println("Pirkejui " + p3.pavarde + " priklauso nuolaida: " + p1.nuolaida());
	}

}
