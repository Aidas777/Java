package Ndshape2;

public class Vykdymas {

	public static void main(String[] args) {
		
		double cost = 3;

		Shape a1= new Circle(6, cost);
		Shape s1= new Square(8, cost);
		
		System.out.printf(a1.getClass().getSimpleName() + " plotas: %5.2f \n", a1.getArea());
		System.out.printf("Dazu kaina: %5.2f" + " eur", a1.getPaintCost(a1, cost));
		System.out.println("\n------------------------");
		System.out.printf(s1.getClass().getSimpleName() + " plotas: %5.2f \n", s1.getArea());
		System.out.printf("Dazu kaina: %5.2f" + " eur", s1.getPaintCost(s1, cost));

		
	}

}
