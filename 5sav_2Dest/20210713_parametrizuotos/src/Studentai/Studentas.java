package Studentai;

public class Studentas {
	public String vardas;
	public String pavarde;
	public int pazimys;

	public Studentas(String vardas, String pavarde, int pazimys) {
		super();
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.pazimys = pazimys;
	}

	public String getVardas() {
		return vardas;
	}

	public void setVardas(String vardas) {
		this.vardas = vardas;
	}

	public String getPavarde() {
		return pavarde;
	}

	public void setPavarde(String pavarde) {
		this.pavarde = pavarde;
	}

	public int getPazimys() {
		return pazimys;
	}

	public void setPazimys(int pazimys) {
		this.pazimys = pazimys;
	}

	@Override
	public String toString() {
		return vardas + " " + pavarde + " " + pazimys ;
	}
	
	

}
