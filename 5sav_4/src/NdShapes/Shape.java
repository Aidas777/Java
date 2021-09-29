package NdShapes;

public abstract class Shape {
	public double cost;

	public Shape(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public Double getPaintCost(Shape s, double cost) {
		return cost;
		
	}


	
	
	
	
	
	
}
