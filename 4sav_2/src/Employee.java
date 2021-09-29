
public class Employee {
	private String name;
	private String surname;
	private Integer workingHours;
	private Double rate;
	
	
	public Employee(String name, String surname, Integer workingHours, Double rate) {
		this.name = name;
		this.surname = surname;
		this.workingHours = workingHours;
		this.rate = rate;
	}
	
	public String toString() {
		return this.name + " "+ this.surname+ " " + this.workingHours + ", " +this.rate;
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

	public Integer getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(Integer workingHours) {
		this.workingHours = workingHours;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getSalary() {
		double salary= (double) (this.workingHours * this.rate);
		return (double) ((int) (salary *100))/100;
	}
	
	
}
