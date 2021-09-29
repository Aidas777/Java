package NdGyvunai;

public abstract class Gyvunas implements Comparable<Gyvunas> {
	
	public String vardas;
	public String tipas;
	
	public Gyvunas(String vardas, String tipas) {
//		super();
		this.vardas = vardas;
		this.tipas = tipas;
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


	public boolean equals (Object obj) {
		return this.vardas.equals(((Gyvunas) obj).vardas);
		
	}
	
	public int compareTo(Gyvunas o) {
		if (this.tipas.equals(o.tipas)) {
			return this.vardas.compareTo(o.vardas);
		} else {
			return this.tipas.compareTo(o.tipas);
		}

	}

}
