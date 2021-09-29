package papildoma;

public class Staff {

	public static void main(String[] args) {
		
//		StaffMember staffList = new StaffMember("Vardenis", "Pavardenis");
		StaffMembers staffList []= new StaffMembers[4];
		staffList[0]=new StaffMembers("Petras","Petrauskas","+370 600");
		staffList[1]=new StaffMembers("Jonas","Jonauskas","+370 711");
		staffList[2]=new StaffMembers("Antanas","Antauskas","+370 222");
		staffList[3]=new StaffTyp("Juozas","Juozauskas","+370 111","Manager");
		
		for (int i = 0; i<staffList.length; i++) {
			System.out.println(staffList[i]);
		}
		
		
		
		
	}

}
