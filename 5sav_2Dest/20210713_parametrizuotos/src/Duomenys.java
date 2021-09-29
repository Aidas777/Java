
public class Duomenys<T> {
	
	private T d;
	
	
	
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
