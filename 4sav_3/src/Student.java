
public class Student {
	public String name;
	public String surname;
	public int age;
	public String group;
	
	
	public Student() {
		super();

	}
	
	public Student(String name, String surname, int age, String group) {

		this.name = name;
		this.surname = surname;
		this.age = age;
		this.group = group;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return name + "\t" + surname + "\t" + age + "\t" + group;
	}
	
	
	
}
