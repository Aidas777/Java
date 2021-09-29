package NdDarbuotojai;

public class Employee {
	public String vardas;
	public String pavarde;
	public String email;
	public Double alga;
	
	public Employee(String vardas, String pavarde, String email, Double alga) {
		super();
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.email = email;
		this.alga = alga;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getAlga() {
		return alga;
	}

	public void setAlga(Double alga) {
		this.alga = alga;
	}

	@Override
	public String toString() {
		return vardas + " " + pavarde + " " + email + " " + alga+"\n";
	}
	
//	public double algaSum() {
//		return alga;
//	}
	
	
	
	
}
