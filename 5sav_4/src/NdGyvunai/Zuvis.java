package NdGyvunai;

public class Zuvis extends Gyvunas {
	public int pelekuSk;
	
	
	public Zuvis(String vardas) {
		super(vardas, "Zuvis");
		
	}

	public Zuvis(String vardas, int pelekuSk) {
		super(vardas, "Zuvis");
		this.pelekuSk = pelekuSk;
	}
	
//	public void setTipas(String tipas) {
//		super.tipas=tipas;
//	}

	public int getPelekuSk() {
		return pelekuSk;
	}

	public void setPelekuSk(int pelekuSk) {
		this.pelekuSk = pelekuSk;
	}

	@Override
	public String toString() {
		return tipas+ ": " + vardas + ", Peleku sk.: " + pelekuSk;
	}

//	@Override
//	public int compareTo(Gyvunas o) {
////		if (tipas>o.tipas) return 1;
////		if (tipas<o.tipas) return -1;
////		return tipas.compareTo(o.tipas);
//		System.out.println(vardas.compareTo(o.vardas));
//		return o.vardas.compareTo(vardas);
//		
////		return 0;
//	}
	
	
}
