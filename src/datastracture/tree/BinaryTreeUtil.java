package datastracture.tree;

public class BinaryTreeUtil {

	public static boolean isIdentical(Node node1, Node node2) {
		if (node1 == null && node2 == null) {
			return true;
		}

		if (node1 != null && node2 != null) {
			return (node1.data == node2.data && isIdentical(node1.left, node2.left)
					&& isIdentical(node1.right, node2.right));
		}
		
		return false;
	}

	public static void main(String[] args) {
		BinarySearchTree tree1 = new BinarySearchTree();
		tree1.insert(10);
		tree1.insert(5);
		tree1.insert(15);
		tree1.insert(25);


		
		BinarySearchTree tree2 = new BinarySearchTree();
		tree2.insert(10);
		tree2.insert(5);
		tree2.insert(15);
		tree2.insert(25);

		System.out.println(isIdentical(tree1.root, tree2.root));

	}

}
