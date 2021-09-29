import java.util.Scanner;

public class Vykdymas {

	public static void main(String[] args) {
		
		Student studentai [] = new Student[5];
		studentai[0]= new Student("Jonas","Bilounas", 54, "PROG1");
		studentai[1]= new Student("Vincas","Kudirkas", 28, "PROG1");
		studentai[2]= new Student("Bronius","Bradauskas", 39, "PROG2");
		studentai[3]= new Student("Mykolas","Putinasis", 34, "PROG2");
		studentai[4]= new Student("Salomeja","Neris", 35, "PROG3");
		
		DarbasSuStudentais dss= new DarbasSuStudentais();
//		dss.surikiuotiStudentus(studentai);
//		
		for (int i =0; i<5; i++) {
			System.out.println(studentai[i]);
		}
//		
		System.out.println("-------------------------");
		
//		DarbasSuStudentais dssp= new DarbasSuStudentaisP();
//		dssp.surikiuotiStudentus(studentai);
//		for (int i =0; i<5; i++) {
//			System.out.println(studentai[i]);
//		}
		
		DarbasSuStudentais dssp= new DarbasSuStudentais();
//		DarbasSuStudentais dssp= new DarbasSuStudentais() {
//		@Override
//		public boolean palygink(Student a,Student b) {
////		dssp.surikiuotiStudentus(studentai);
//			return a.group.compareTo(b.group)>0;
//			}
//		};
		
//		DarbasSuStudentais dssp= new DarbasSuStudentais(); 

		
//		dssp.surikiuotiStudentus(studentai, new PalyginkP());
		dssp.surikiuotiStudentus(studentai, new PalyginkStudentus() {
			
			@Override
			public boolean palygink(Student a, Student b) {
				
				return a.surname.compareTo(b.surname) >0;
			}
		});
		
		
		for (int i =0; i<5; i++) {
		System.out.println(studentai[i]);
	}
		
		
		
		
		///PETRAS
		//PETRUI REIKIA KAD STUDENTAI BUTU SURIKIUOTI PAGAL VARDA
		

	}

}
