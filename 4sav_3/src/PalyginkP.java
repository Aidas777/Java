//
public class PalyginkP implements PalyginkStudentus {
//
	@Override
	public boolean palygink(Student a,Student b) {
		return a.group.compareTo(b.group) <0;
	}
}
