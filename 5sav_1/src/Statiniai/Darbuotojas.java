package Statiniai;

public class Darbuotojas {
	public static int id=0;
	public int dId=0;
	public String name;
	
	public Darbuotojas(String name) {
		this.name=name;
		id++;
		dId=id;
	}

//	public int getNr() {
//		return id;
//	}
//
//	public void setNr(int id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static Darbuotojas getNoName() {

		return new Darbuotojas("Bevardis ");
	}

	@Override
	public String toString() {
		
		return this.name+", id= " + dId;
	}
	
	
}


