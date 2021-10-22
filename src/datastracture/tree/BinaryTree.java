package datastracture.tree;

import java.util.LinkedList;
import java.util.Queue;


class Node{
	int data;
	Node left, right;
		
		public Node(int key) {
			this.data = key;
			left = null;
			right = null;
		}
	}
public class BinaryTree {

	Node root;
	int data;

	BinaryTree(int data) {
		root = new Node(data);

	}

	// traverse in order

	public void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.data);
			traverseInOrder(node.right);
		}
	}

	public void traversePostOrder(Node node) {
		if (node != null) {
			traversePostOrder(node.left);

			traversePostOrder(node.right);
			System.out.print(" " + node.data);
		}
	}

	public void traversePreOrder(Node node) {
		if (node != null) {

			System.out.print(" " + node.data);
			traversePreOrder(node.left);

			traversePreOrder(node.right);

		}
	}

	public void printLeftView(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		System.out.println();

		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				Node curr = queue.remove();
				if (i == 0) {
					System.out.print(curr.data + " ");
				}
				if(!queue.isEmpty())
					queue.remove();
				if (curr.left != null)
					queue.add(curr.left);
				if (curr.right != null)
					queue.add(curr.right);
				size--;
			}
		
		}
		System.out.println();
	}

	public void breadthTraverse(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		System.out.println();
		while (!queue.isEmpty()) {
			Node n = queue.remove();
			if (n.left != null)
				queue.add(n.left);
			if (n.right != null)
				queue.add(n.right);
			System.out.print(n.data + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree(50);

		binaryTree.root.left = new Node(40);
		binaryTree.root.right = new Node(70);

		binaryTree.root.left.left = new Node(30);
		binaryTree.root.left.right = new Node(35);

		binaryTree.root.right.left = new Node(65);
		binaryTree.root.right.right = new Node(80);

		binaryTree.root.left.left.left = new Node(20);
		binaryTree.root.left.left.right = new Node(25);

		binaryTree.root.left.right.left = new Node(32);
		binaryTree.root.left.right.right = new Node(37);
		System.out.println("\nPre orde");
		binaryTree.traversePreOrder(binaryTree.root);
		System.out.println("\nPost Order");
		binaryTree.traversePostOrder(binaryTree.root);
		System.out.println("\nIn Order");
		binaryTree.traverseInOrder(binaryTree.root);

		System.out.println("\nbreath traverse");

		binaryTree.breadthTraverse(binaryTree.root);
		
		System.out.println("Left View");
		
		binaryTree.printLeftView(binaryTree.root);
	}
}
