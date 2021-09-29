package Ndshape2;

public abstract class Shape {
	public double duomuo;
	public double kaina;
	

	public Shape(double duomuo, double kaina) {
		this.duomuo = duomuo;
		this.kaina = kaina;
	}

	public double getKaina() {
		return kaina;
	}

	public void setKaina(double kaina) {
		this.kaina = kaina;
	}
	


	public double getDuomuo() {
		return duomuo;
	}

	public void setDuomuo(double duomuo) {
		this.duomuo = duomuo;
	}

	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract double getPaintCost(Shape s, double kaina);

}
