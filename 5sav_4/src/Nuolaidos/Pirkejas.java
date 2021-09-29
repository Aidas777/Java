package Nuolaidos;

public class Pirkejas {
	public String vardas;
	public String pavarde;
	public double isleista;
	public double isleistaMen;
	public NuolaidaInterface nuolaidaI;
	
	
	public Pirkejas(String vardas, String pavarde, double isleista, double isleistaMen) {
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.isleista = isleista;
		this.isleistaMen = isleistaMen;
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
	public double getIsleista() {
		return isleista;
	}
	public void setIsleista(double isleista) {
		this.isleista = isleista;
	}
	public double getIsleistaMen() {
		return isleistaMen;
	}
	public void setIsleistaMen(double isleistaMen) {
		this.isleistaMen = isleistaMen;
	}
	
	public int nuolaida() {
		if (this.nuolaidaI==null) {
			System.out.println("");
			System.err.println("Nera nuolaidos skaiciavimo metodo");
			return 0;
		}
		return this.nuolaidaI.nuolaidaI(isleista,isleistaMen);
		
//		return (int) Math.sin(isleista);
	}
	public NuolaidaInterface getNuolaidaI() {
		return nuolaidaI;
	}
	public void setNuolaidaI(NuolaidaInterface nuolaidaI) {
		this.nuolaidaI = nuolaidaI;
	}
	
	
}
