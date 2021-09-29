package tree;

public class Tree {
	public Item root=null;

	public Tree() {
		super();
	}
	
	private Item add(Item root, int data) {
		if (root==null) return new Item(data);
		if (root.data>data) {
			root.left=add(root.left, data);
		}else {
			root.right=add(root.right,data);
		}
		return root;
	}
	
	public void add(int data) {
		this.root=add(this.root,data);
	}
	
	
	public void print(Item root) {
		if (root!=null) {
			print(root.left);
			System.out.println(root.data);
			print(root.right);
		}
	}
	
	public void print() {
		print(root);
	}
	
	public int count() {
		
		return 0;
	}
	

}
