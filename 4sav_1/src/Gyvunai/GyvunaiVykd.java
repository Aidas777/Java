package Gyvunai;

public class GyvunaiVykd {

	public static void main(String[] args) {
		
		

		Suo g1=new Suo("Brisius","Suo","Naminukas");
//		Suo g4=new Suo("Dingas","Suo");

//		Gyvunas g1=new Gyvunas("Brisius","Suo");
//		g1.suzymeti(3);
		
		Suo g2=new Suo("Lese","Suo", "Koli");
		Suo g3=new Suo("Dingas", "Suo", "Laukinis skalikas");
		Gyvunas g4=new Gyvunas("Barnis","Ziurkenas");
		Kate g5=new Kate("Murklys", "Kate", "Trupmaplauke");
		
		Gyvunas g6=new Kate("Rainis", "Kate", "Siamo");

		
		g1.suzymeti(3);
		g2.suzymeti(4);
		g3.suzymeti(15);
		g4.suzymeti(8);
		g5.suzymeti(17);
		g6.suzymeti(23);
		
//		g4.amzius=20;
		
//		g4.veisle="Laukinis suo";
		
		//g4=g1; gyvunas=suo GALIMA
		//g1=g4; suo=gyvunas NEGALIMA
		
		
		
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		System.out.println(g4);
		System.out.println(g5);
		System.out.println(g6);


//		System.out.println(g5.veisle);
//		System.out.println(g6.veisle); taip nerodo
	}

}
