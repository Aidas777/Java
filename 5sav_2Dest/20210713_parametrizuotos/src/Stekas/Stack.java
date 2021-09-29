package Stekas;

public class Stack<T> {
	public Data<T> q;
	
	public void push (T d) {
		Data<T> t=new Data<>(d);
		t.next=this.q;
		q=t;
	}
	
	public T pop() {
		T result=q.getData();
		q=q.next;
		return result;
	}
	
	public boolean isEmpty() {
		return q==null;
	}

}
