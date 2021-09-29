package Stekas;

public class Stack {
	public Data q;
	
	public void push (int d) {
		Data t=new Data(d);
		t.next=this.q;
		q=t;
		
	}
	
	public int pop() {
		int result = q.getData();
		q=q.next;
		return result;
	}
	
	public boolean isEmpty() {
		return q==null;
	}
}
