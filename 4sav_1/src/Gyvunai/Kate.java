package Gyvunai;

public class Kate extends Gyvunas {
	public String veisle;
	
	public Kate(String vardas, String tipas) {
		super(vardas, tipas);
	}

	public Kate(String vardas, String tipas, String veisle) {
		super(vardas, tipas);
		this.veisle = veisle;
	}
	
	@Override
	public void suzymeti(int id) {
		this.id="K-" + id;
	}

	@Override
	public String toString() {
		return super.toString() + " [veisle: "+ this.veisle +"]";
	}
}
