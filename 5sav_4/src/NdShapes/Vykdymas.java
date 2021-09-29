package NdShapes;

import java.util.LinkedList;


public class Vykdymas {

	public static void main(String[] args) {
		double cost = 15;
	
		LinkedList<Shape> fig= new LinkedList<>();

		fig.add(new Circle(10.0, cost));
		fig.add(new Square(10.0, cost));
		
		System.out.println(fig);
		
//		double kaina=getPaintCost(Shape s, double cost)
	}

}
