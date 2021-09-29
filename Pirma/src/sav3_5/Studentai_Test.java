package sav3_5;

//import universitetas.Student;

class TestKlases {

	public static void main(String[] args) {
		Studentai_Test jonas=new Studentai_Test("JonasBBB", "Jonaitizz", 99 ); //jonas - objektas,
		
		Studentai_Test petras=new Studentai_Test("Petras", "Petraitis");
		
		System.out.println(jonas.getName() + " " +jonas.getSurname() +" "+jonas.getGrade() );
		System.out.println( petras );
		System.out.println();
		
		System.out.println( jonas ); //cia toString() yra sukurtas metodas Student.java faile
		System.out.println( petras );

	}

}

public class Studentai_Test {
	private String name; // jei private, tai bus matomas tik sitoj klasej
	private String surname; // jei protected - matomas ir paveldetose klasese.
	private Integer grade;
	

//	public Student(String name, String surname, Integer grade) {
////		System.out.println("KURIU OBJEKTA");
//		this.name=name;
//		this.surname=surname;
//		this.grade=grade;
//		
//	}
	public Studentai_Test(String name, String surname, Integer grade) {
		this.name = name;
		this.surname = surname;
		this.grade = grade;
	}

	public Studentai_Test(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public void ivertinti(Integer grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public String toString() {
		return this.name + " " + this.surname + ": " + this.grade;
	}
	
}
