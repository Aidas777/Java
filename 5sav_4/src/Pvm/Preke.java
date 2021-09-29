package Pvm;

public class Preke {
	public String pavadinimas;
	public int tipas;
	public double kainaBe;
	public PvmInterface pvmas;
	
	
	
	public Preke(String pavadinimas, int tipas, double kainaBe) {
		this.pavadinimas = pavadinimas;
		this.tipas = tipas;
		this.kainaBe = kainaBe;
	}


	public String getPavadinimas() {
		return pavadinimas;
	}


	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}


	public int getTipas() {
		return tipas;
	}


	public void setTipas(int tipas) {
		this.tipas = tipas;
	}


	public double getKainaBe() {
		return kainaBe;
	}
	
	public double getKainaSu() {
		return kainaBe*((pvmas.gaukpvm(tipas))/100.0+1);
	}


	public void setKainaBe(double kainaBe) {
		this.kainaBe = kainaBe;
	}


	@Override
	public String toString() {
		return pavadinimas + " tipas: " + tipas + ", " + kainaBe + " eur";
	}


	public PvmInterface getPvmas() {
		return pvmas;
	}


	public void setPvmas(PvmInterface pvmas) {
		this.pvmas = pvmas;
	}
	
	
	
}
