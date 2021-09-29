package PvmRedo;

public class Preke {
	
	public String pavadinimas;
	public int tipas;
	public double kaina;
	
	public PvmInterface pvmas;
	
	
	public Preke(String pavadinimas, int tipas, double kaina) {
		this.pavadinimas = pavadinimas;
		this.tipas = tipas;
		this.kaina = kaina;
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


	public double getKaina() {
		return kaina;
	}


	public void setKaina(double kaina) {
		this.kaina = kaina;
	}


	@Override
	public String toString() {
		return pavadinimas + ", tipas:" + tipas + ", kaina:" + kaina;
	}


	public PvmInterface getPvmas() {
		return pvmas;
	}


	public void setPvmas(PvmInterface pvmas) {
		this.pvmas = pvmas;
	}
	
	public double getKainaSu() {
		return (double) kaina* (pvmas.getinkPvma(tipas) /100.0+1);
	}

}
