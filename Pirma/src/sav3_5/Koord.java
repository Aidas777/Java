package sav3_5;

public class Koord {
	public Double x;
	public Double y;
	
	public Koord(Double x, Double y) {
		this.x=x;
		this.y=y;
	}
	
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		this.x=x;
	}
	
	public Double suma () {
		return (this.x+this.y);
	}

}
	



