package Stekas;

public class Sarasas<T> {
	public Data<T> q;
	public Data<T> p;
	
	public void add(T d) {
		if (p==null) {
			p=new Data<>(d);
			q=p;
		}else {
			p.next=new Data<>(d);
			p=p.next;
		}
	}
	
	public void add(int i, T d) {
		Data<T> t=q;
		for (int y=0; y<i-1; y++) {
			t=t.next;
		}
		
		Data<T> tmp=new Data<>(d);
		tmp.next=t.next;
		t.next=tmp;
		
	}
	
	public T get() {
		T result=null;
		if (q!=null) {
			result=q.getData();
			q=q.next;
			if (q==null) p=null;
		}
		return result;
	}
	
	public T get(int i) {
		Data<T> t=q;
		for (int y=0; y<i; y++) {
			t=t.next;
		}
		return t.getData();
	}
	
	public boolean isEmpty() {
		return (q==null || p==null);
	}
	
	public void remove(int i) {
		
	}

}
