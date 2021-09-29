package Stekas;

public class Data {
	private Integer data;
	public Data next;
	
	
	
	
	
	public Data(Integer data) {
		this.data = data;
	}
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public Data getNext() {
		return next;
	}
	public void setNext(Data next) {
		this.next = next;
	}
	

}
