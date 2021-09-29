package knigynas;

import java.io.Serializable;

public class Knyga implements Serializable{

	private static final long serialVersionUID = 1L;
	public String pavadinimas;
	public int puslapiai;

	public Knyga(String pavadinimas, int puslapiai) {
		super();
		this.pavadinimas = pavadinimas;
		this.puslapiai = puslapiai;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public int getPuslapiai() {
		return puslapiai;
	}

	public void setPuslapiai(int puslapiai) {
		this.puslapiai = puslapiai;
	}

	@Override
	public String toString() {
		return pavadinimas + ", " + puslapiai ;
	}
	
	

}
