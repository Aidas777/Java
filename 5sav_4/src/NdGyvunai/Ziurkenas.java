package NdGyvunai;

public class Ziurkenas extends Gyvunas{
	public int uodegosL;
	public String spalva;

	public Ziurkenas(String vardas) {
		super(vardas, "Ziurkenas");
	}

	public Ziurkenas(String vardas, int uodegosL, String spalva) {
		super(vardas, "Ziurkenas");
		this.uodegosL = uodegosL;
		this.spalva = spalva;
	}


	public int getUodegosL() {
		return uodegosL;
	}

	public void setUodegosL(int uodegosL) {
		this.uodegosL = uodegosL;
	}

	public String getSpalva() {
		return spalva;
	}

	public void setSpalva(String spalva) {
		this.spalva = spalva;
	}
	
//	public boolean equals (Object obj) {
//	return this.vardas.equals(((Gyvunas) obj).vardas);
//	
//}
//	
//	@Override
//	public int compareTo(Gyvunas o) {
//		return vardas.compareTo(o.vardas);
////		return o.vardas.compareTo(this.vardas);
//
//	}

	@Override
	public String toString() {
		return tipas+ ": " +vardas + ", Uodegos ilgis: "+uodegosL + ", Spalva: "+ spalva;
	}

}
