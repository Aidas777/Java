package papildoma;

public class StaffMembers {
	protected  String name;
	protected  String surname;
	protected  String phone;
	
	public StaffMembers() {
	}
	
	
	public StaffMembers(String name, String surname, String phone) {
		this.name=name;
		this.surname=surname;
		this.phone= phone;
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



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	@Override
	public String toString() {
		return this.name + " " + this.surname + " Phone: " + this.phone;
	}
	
	public void addStaffMember(StaffMembers staff) {
		
	}
	
	public double pay() {
		return 0;
	}
	
	
}
