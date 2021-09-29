package universitetas;

public class Student {
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
	public Student(String name, String surname, Integer grade) {
		this.name = name;
		this.surname = surname;
		this.grade = grade;
	}

	public Student(String name, String surname) {
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

//	public String getName() {
//		return this.name;
//	}
//	
//	public void setName(String name) {
//		this.name=name;
//	}

}
