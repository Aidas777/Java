package Gyvunai;

public class Gyvunas {

	public String vardas;
	public String tipas;
	protected String id;
	
//	public final int amzius;
	
	
	
	public Gyvunas() {
//		System.out.println("Vykdimas Gyvuno tuscias konstytuktorius");
//		amzius=5;
	}
	
	public Gyvunas(String vardas, String tipas) {  //,int amzius
//		System.out.println("Vykdomas Gyvuno su kintamaisiais konstriktorius");
//		this.amzius=amzius;
		this.vardas = vardas;
		this.tipas = tipas;
	}
	
	public void suzymeti(int id) {
		this.id="G - " + id;
	}
	
	/**
	 * Paima varda ir ji grazina oplia
	 * @return vardas
	 */

	public String getVardas() {
		return vardas;
	}

	public void setVardas(String vardas) {
		this.vardas = vardas;
	}

	public String getTipas() {
		return tipas;
	}

	public void setTipas(String tipas) {
		this.tipas = tipas;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return vardas + ", " + tipas + " id=" + id;
	}
	
	
	
	
	
	
	
}
