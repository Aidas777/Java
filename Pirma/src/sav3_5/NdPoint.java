package sav3_5;

public class NdPoint {

	public static void main(String[] args) {
		
		Point taskas1 = new Point(5,3);
		Point taskasOld = new Point();
		taskasOld.setX(taskas1.getX());
		taskasOld.setY(taskas1.getY());
		
		Point taskTest = new Point(15,3);
		
//		Point p = new Point(15,8);
		
		System.out.println("taskas1 koordinates yra: " + taskas1);
		System.out.println("Atstumas nuo koordinaciu pradzios [0;0] yra: "+ taskas1.distanceFromOrigin() );
		System.out.println();

		System.out.println("taskTest Tasko koordinates yra: " +taskTest);
		System.out.println("Atstumas nuo koordinaciu pradzios [0;0] yra: "+ taskTest.distanceFromOrigin() );
		System.out.println();
		
		int dx=2;
		int dy=1;
		
		System.out.println("--------------------------");
		taskas1.tranzlate(dx, dy);
		
		double atstTarp=(taskas1.distance(taskasOld));
		
		System.out.println("taskas1 " + taskasOld + " Po keitimo (+" + dx +", +" + dy + "): " + taskas1);
		System.out.println("Atstumas tarp " + taskasOld + " ir " + taskas1 +" yra: "+ atstTarp);
		
		System.out.println("--------------------------");
//		taskas.setLocation(taskas);
		taskas1.setLocation(10,11);
		System.out.println("taskas1 perkeistas i [" + taskas1.getX() + ";" + taskas1.getY() + "]"); //istraukiau ne per toString pabandymui
		
//		double atstumas = distance(Point p);
		
		
		
		
//		int iks = taskas.getX();
//		System.out.println(iks);
		Point p1=taskasOld;
		Point p2=taskas1;
		Line line1 = new Line(p1, p2);
		
		System.out.println("line1: " + line1.p1 + "-" + line1.p2);
//		System.out.println(line1.p1.getX()+line1.p2.getX());
		System.out.println("Linijos line1 ilgis: " +line1.lLen());
	}
}
