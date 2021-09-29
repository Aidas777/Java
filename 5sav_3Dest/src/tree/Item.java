package tree;

public class Item {
	public int data;
	public Item left=null;
	public Item right=null;
	
	public Item(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Item getLeft() {
		return left;
	}

	public void setLeft(Item left) {
		this.left = left;
	}

	public Item getRight() {
		return right;
	}

	public void setRight(Item right) {
		this.right = right;
	}
	

}
