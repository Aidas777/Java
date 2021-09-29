package sav3_5;

public class Point {
	public Integer x;
	public Integer y;

	public Point(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}

	public Point() {

	}
	
	/**
	 * Paima suteikta x reikšmę ir ją grąžina
	 * @return x
	 */
	public Integer getX() {
		return this.x;
	}
	
	/**
	 * Priskiria x reiksme objektui. Nieko negrazina.
	 * @param x
	 */
	public void setX(Integer x) {
		this.x = x;
	}

	/**
	 * Paima suteikta y reikšmę ir ją grąžina
	 * @return y
	 */
	public Integer getY() {
		return this.y;
	}

	/**
	 * Priskiria y reiksme objektui. Nieko negrazina.
	 * @param y
	 */
	public void setY(Integer y) {
		this.y = y;
	}
	
	/**
	 * Apskaiciuoja ir grazina atstuma tarp tasko (x, y) ir koordinaciu pradzios tasko (0, 0)
	 * @return distanceFromOrigin
	 */
	public Double distanceFromOrigin() {
		double dist = (double) Math.sqrt(  Math.pow(this.x, 2) + Math.pow(this.y, 2)  );
		dist = (double) ((int) (dist *100))/100;
		return dist;

	}
	/**@author Aidas
	 * Paima tasko x ir y ir grazina string formate [x;y]
	 */
	public String toString() {
		return "[" + this.x + ";" + this.y + "]";
	}
	
	/**
	 * Prideda dx ir dy vienetus prie tasko x ir y reiksmiu ir tasko x ir y pakeicia i gauta rezultata. Nieko negrazina.
	 * @param dx
	 * @param dy
	 */
	public void tranzlate(Integer dx, Integer dy) {
		this.x=this.x+dx;
		this.y=this.y+dy;
	}
	
	/**
	 * Apskaiciuoja atstuma tarp dvieju tasku ir ji grazina (taskas1.distance(taskas2).
	 * @param p
	 * @return distance
	 */
	public Double distance(Point p) {
		double atst= (double) Math.sqrt(  Math.pow(this.x-p.x, 2) + Math.pow(this.y-p.y, 2)  );
		atst = (double) ((int) (atst *100))/100;
		return atst;
	}
	
	/**
	 * Priskiria tasko kordinatems x ir y. Nieko negrazina.
	 * @param x
	 * @param y
	 */
	public void setLocation(int x, int y) {
		this.x=x;
		this.y=y;
	}

}
