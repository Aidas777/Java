package Gyvunai;

public class Suo extends Gyvunas{
	public String veisle;
	
	public Suo(String vardas, String tipas) {

		// int x=5; negali buti tokie eil pries super
		super(vardas, tipas);

//		this.tipas=tipas;
//		this.vardas=vardas;
	}

	public Suo(String vardas, String tipas, String veisle) {
		super(vardas, tipas);
		this.veisle = veisle;
	}
	
	
	
	@Override
	public void suzymeti(int id) {
		this.id="S-" + id;
	}

	@Override
	public String toString() {
		return super.toString() + " [veisle: "+ this.veisle +"]";
	}
	
}
