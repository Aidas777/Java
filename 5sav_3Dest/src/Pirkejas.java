
public class Pirkejas {
	public String vardas;
	public String pavarde;
	public int isleista;
	
	public Pirkejas(String vardas, String pavarde, int isleista) {
	
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.isleista = isleista;
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

	public int getIsleista() {
		return isleista;
	}

	public void setIsleista(int isleista) {
		this.isleista = isleista;
	}

	@Override
	public String toString() {
		return vardas + " " + pavarde + "," + isleista ;
	}
	
	

}
