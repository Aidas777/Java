//Fala kure Jonas
public class DarbasSuStudentais {
	
//	public boolean palygink(Student a, Student b) {
//		return a.age<b.age;
//	}
	
	public void surikiuotiStudentus(Student studentai [], PalyginkStudentus ps) {
//	public void surikiuotiStudentus(Student studentai []) {
		for (int i =0; i <studentai.length-1; i++) {
			for (int y=i; y<studentai.length; y++) {
//				System.out.println("i:" +i+ " /// y: " + y);
//				if (studentai[i].age > studentai[y].age) {
//				if ( palygink(studentai[i], studentai[y])) {
				if ( ps.palygink(studentai[i], studentai[y])) {
					Student tmp=studentai[i];
					studentai[i]=studentai[y];
					studentai[y]=tmp;
				}
			}
		}
	}
}
