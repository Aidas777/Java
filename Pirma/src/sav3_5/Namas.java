package sav3_5;

public class Namas {
	private String tipas;
	private Integer butuSk;
	
	public Namas (String tipas, Integer butuSk) {
		this.tipas=tipas;
		this.butuSk=butuSk;
	}
	
	public void setTipas (String tipas) {
		this.tipas=tipas;
	}
	
	public String getTipas () {
		return this.tipas;
	}
	
	public void setButuSk (Integer butuSk) {
		this.butuSk=butuSk;
	}
	
	public Integer getButuSk () {
		return this.butuSk;
	}
	
	public String toString() {
		return this.tipas + " " +this.butuSk;
	}
	
	
}
