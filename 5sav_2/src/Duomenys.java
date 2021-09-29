
public class Duomenys<T> {
//	private int d[]=new int [10];
	
	private T d;
	
//	public Duomenys() {
//		d=data;
//	}
	
	public void setData(T data, int i) {
		d=data;
	}
	
	public T getData(int i) {
		return d;
	}

	@Override
	public String toString() {

		return d.toString();
	}
	
	
}
