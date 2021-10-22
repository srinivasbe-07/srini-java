package datastracture.tree;


public class BinarySearchTree {

	
	Node root;
	public BinarySearchTree() {
		
	}
	public Node getRoot() {
		return root;
	}
	public void insert(int key) {
		
		root = insertRec(root, key);
	}
	
	private Node insertRec(Node root, int key ) {
		if(root == null) {
		    root = new Node(key);
		    return root;
		}
		
		
		if( key< root.data) {
			root.left = insertRec(root.left, key);
			
		}
		else
		{
			root.right = insertRec(root.right, key);
		}
		return root;
	}
	
	private void printRec(Node root) {
		if(root != null) {
			printRec(root.left);
			System.out.print(root.data + " ");
			printRec(root.right);
		}
	}
	public void printData() {
		
		printRec(root);
		System.out.println();
	}
	
	private Node deleteRec(int key, Node root) {
		if(root == null) {
			return root;
		}
		if(key < root.data) {
			root.left = deleteRec(key, root.left);
		}
		else if(key > root.data) {
			root.right = deleteRec(key, root.right);
		}
		else {
		
			if(root.left == null)
			{
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}
			int minValue = getMinValue(root.right);
			root.data = minValue;
			root.right = deleteRec(minValue, root.right);
			 
		}
			 return root;
		
	}
	public void delete(int key) {
		root = deleteRec(key, root);
	}
	private int getMinValue(Node node) {
		int mivVal = node.data;
		while(node.left!= null) {
			mivVal = node.data;
			node = node.left;
		}
		return mivVal;
	}
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(15);
		tree.insert(25);
		tree.insert(40);
		tree.insert(50);
		tree.insert(35);
		tree.printData();
		tree.delete(25);
		tree.printData();
	}
	
}
