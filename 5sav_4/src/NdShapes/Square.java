package NdShapes;

public class Square extends Shape {
	public double duomuo;
	
	public Square(double duomuo, double cost) {
		super(cost);
		this.duomuo=duomuo;
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "Kvadratas L= " +duomuo + " / kvadrato kaina: " + cost + " eur";
	}

}
