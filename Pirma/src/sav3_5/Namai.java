package sav3_5;


public class Namai {

	public static void main(String[] args) {
		Namas pirmas = new Namas("Penkiaaukstis",15);
		Namas antras = new Namas("Devynaukstis",65);
		
		
		System.out.println(pirmas);
		System.out.println(antras);
		System.out.println("Pirmo tipas: " + pirmas.getTipas()+ " " + "///Pirmo butu sk: " +pirmas.getButuSk());
	}
}
