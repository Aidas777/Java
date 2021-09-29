package Stekas;

public class Data<T> {
	private T data;
	public Data<T> next;
	
	public Data(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Data<T> getNext() {
		return next;
	}
	public void setNext(Data<T> next) {
		this.next = next;
	}
	

}
