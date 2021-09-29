package InterfaceNamie;


public class Mokinys {
	
	public String vardas;
	public int pazimys;
	public MokInterface pazRez;
	
	public Mokinys(String vardas, int pazimys) {
		this.vardas = vardas;
		this.pazimys = pazimys;
	}

	public String getVardas() {
		return vardas;
	}

	public void setVardas(String vardas) {
		this.vardas = vardas;
	}

	public int getPazimys() {
		return pazimys;
	}

	public void setPazimys(int pazimys) {
		this.pazimys = pazimys;
	}

	@Override
	public String toString() {
		return vardas + " " + pazimys;
	}

	public MokInterface getPazRez() {
		return pazRez;
	}

	public void setPazRez(MokInterface pazRez) {
		this.pazRez=pazRez;
	}
	
//	public void setPvmas(PvmInterface pvmas) {
//		this.pvmas = pvmas;
//	}
	
	public int SkaiciuokPaz() {
		return pazRez.SkaiciuokPaz(pazimys);
		
	}
	

	

}
