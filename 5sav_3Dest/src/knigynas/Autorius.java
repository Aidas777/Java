package knigynas;

import java.io.Serializable;

public class Autorius implements Comparable<Autorius>, Serializable{

	private static final long serialVersionUID = 1L;
	
	public String vardas;
	public String pavarde;
	
	public Autorius(String vardas, String pavarde) {
		super();
		this.vardas = vardas;
		this.pavarde = pavarde;
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
	
	@Override
	public boolean equals(Object obj) {
		if (this.vardas.equals( ((Autorius)obj ).vardas )){
			return this.pavarde.equals( ((Autorius)obj ).pavarde );
		}else {
			return false;
		}
		
	}
	
	@Override
	public int compareTo(Autorius o) {
		if (vardas.equals(o.vardas)) {
			return pavarde.compareTo(o.pavarde);
		}else {
			return vardas.compareTo(o.vardas);
		}
		
	}
	@Override
	public String toString() {
		return vardas + " " + pavarde;
	}
	
	

}
