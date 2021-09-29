package Ndshape2;

public class Square extends Shape {
	public double area;

	public Square(double duomuo, double kaina) {
		super(duomuo, kaina);
	}

	public double getDuomuo() {
		return duomuo;
	}

	public void setDuomuo(double duomuo) {
		this.duomuo = duomuo;
	}

	@Override
	public double getArea() {
		double s = duomuo* duomuo;
		this.area=s;
		return s;
	}

	@Override
	public double getPerimeter() {
		double p = duomuo* 4;
		return p;
	}

	@Override
	public double getPaintCost(Shape s, double cost) {
		return this.area * cost;
	}

}