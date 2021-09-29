package Atsiskaitymas;

public class AB {

	public static void main(String[] args) {
		class A {
			int value() {
				return 3;
			}
		}
		
		class B extends A {
			int value() {
				return 5;
			}
		}
		
		A a = new A();
		B b = new B();
		A c = new B();
		
		System.out.println(a.value()+b.value()+c.value());
	}

}
