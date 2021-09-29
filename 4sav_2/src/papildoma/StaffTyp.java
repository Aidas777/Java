package papildoma;

public class StaffTyp extends StaffMembers {
	public String typ;
	
	public StaffTyp(String name, String surname, String phone) {
	super(name, surname, phone);

	}
	
	public StaffTyp(String name, String surname, String phone, String typ) {
	super(name, surname, phone);
	this.typ=typ;
	}

	@Override
	public String toString() {
		
		return super.toString() + " " + this.typ;
	}
	
	
}
