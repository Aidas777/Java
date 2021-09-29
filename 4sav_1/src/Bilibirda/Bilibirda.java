package Bilibirda;

	public class Bilibirda {
		


		public String name;
		public String make;

		public Bilibirda(String name, String make) {
			this.name=name;
			this.make="make";
			
		}

		public static void main(String[] args) {
			Bilibirda m = new Bilibirda("HZ-3000 Ninja", "Honda");
			
			
			
//			m.name = "HZ-3000 Ninja";
//			m.make = "Honda";
			
			System.out.println(m.name + " " + m.make);
			
	}

	
}
