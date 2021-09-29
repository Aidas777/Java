
public class Manager extends Employee {
	public Integer employeeCount;

	public Manager(String name, String surname, Integer workingHours, Double rate) {
		super(name, surname, workingHours, rate);
	}
	
	public Manager(String name, String surname, Integer workingHours, Double rate, Integer employeeCount) {
		super(name, surname, workingHours, rate);
		this.employeeCount = employeeCount;
	}

	@Override
	public Double getSalary() {
//		double algaV= (getWorkingHours()* getRate());
		return super.getSalary() + this.employeeCount*getWorkingHours();
//		return algaV;
	}

	@Override
	public String toString() {
		return super.toString()+", " + this.employeeCount;
	}
	
	
	
	
}
