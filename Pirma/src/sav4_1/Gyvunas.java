package sav4_1;

public class Gyvunas {

	public String vardas;
	public String tipas;
	private String id;
	
	public Gyvunas(String vardas, String tipas, String id) {
		this.vardas = vardas;
		this.tipas = tipas;

	}
	
	public void suzyneti(int id) {
		this.id="G - " + id;
	}

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

	public void setId(String id) {
		this.id = id;
	}
	
	public String toString() {
		return vardas +", " + tipas + " id=" + id; 
	}
	
	

}
