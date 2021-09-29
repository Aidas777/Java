package Ndshape2;

public class Circle extends Shape{
	public double area;

	public Circle(double duomuo ,double kaina) {
		super(duomuo, kaina);
	}

//	public double getDuomuo() {
//		return duomuo;
//	}
//
//	public void setDuomuo(double duomuo) {
//		this.duomuo = duomuo;
//	}


//	public double Skaiciuok() {
//	double s = (Math.PI)* duomuo*duomuo;
//	return s;
//	}

	@Override
	public double getArea() {
		double s = (Math.PI)* this.duomuo*this.duomuo;
		this.area=s;
		return s;

	}

	@Override
	public double getPerimeter() {
		
		return 0;
	}

	@Override
	public double getPaintCost(Shape s, double kaina) {
		return (this.area*kaina);
	}


}
