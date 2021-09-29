package sav3_5;

public class Line {
	public Point p1;
	public Point p2;
	
	public Line(Point p1, Point p2) {
		this.p1=p1;
		this.p2=p2;
	}
	
	/**
	 * Apskaiciuoja ilgi tarp dvieju tasku (p1, p2) ir ji grazina
	 * @return lLen
	 */
	
	public double lLen() {
		double ilgis= (double) Math.sqrt(  Math.pow(this.p1.x-this.p2.x, 2) + Math.pow(this.p1.y-this.p2.y, 2)  );
		return (double) ((int) (ilgis *100))/100;
	}
}
