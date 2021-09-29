package sav3_5;
import universitetas.Student;

public class ObjPrg {

	public static void main(String[] args) {
//		int     x	= 	5;
		Student jonas=new Student("JonasBBB", "Jonaitizz", 99 ); //jonas - objektas,
		
		Student petras=new Student("Petras", "Petraitis");
		
		System.out.println(jonas.getName() + " " +jonas.getSurname() +" "+jonas.getGrade() );
		System.out.println( petras );
		System.out.println();
		
		System.out.println( jonas ); //cia toString() yra sukurtas metodas Student.java faile
		System.out.println( petras );

	}

}
