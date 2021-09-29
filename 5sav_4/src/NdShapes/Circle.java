package NdShapes;

public class Circle extends Shape {
	public double duomuo;

	public Circle(double cost, double duomuo) {
		super(cost);
		this.duomuo = duomuo;
	}

	public double getDuomuo() {
		return duomuo;
	}

	public void setDuomuo(double duomuo) {
		this.duomuo = duomuo;
	}


	@Override
	public String toString() {
		return "Apskritimas R= " +duomuo + " / kvadrato kaina: " + cost + " eur";
	}



}
