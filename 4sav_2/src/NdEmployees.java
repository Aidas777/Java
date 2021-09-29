
public class NdEmployees {

	public static void main(String[] args) {
		
		Employee pirmas = new Employee("Petras","Petraitis", 153, 15.41);
		Manager vadyb1 = new Manager("Andrius", "Andrijonaitis", 161, 18.55, 3);
		
		System.out.println(pirmas);
		System.out.println("Alga: " + pirmas.getSalary() + " Eur");
		System.out.println("------------------------------------");
		
		System.out.println("Vadybininkas: " +vadyb1);
		System.out.println("Alga: " + vadyb1.getSalary() + " Eur");
	}

}
