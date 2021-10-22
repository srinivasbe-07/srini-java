package datastracture.queue.linkedlist;


class Node<E>{
	public  E data;
	public Node<E> next;
	public Node(E data) {
		this.data = data;
		this.next = null;
	}
	
	
}


public class MyLinkedlist <E>{
	public Node<Integer> head;
	
	public MyLinkedlist() {
		this.head = null;
	}
	
	public void addNode(E data) {
		Node newNode  = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			Node nodePointer = head;
			
			while(nodePointer.next != null) {
				
				nodePointer = nodePointer.next;
			}
			nodePointer.next = newNode;
		}
		
	}
	
	public void addFront(E data) {

		// allocate the node
		Node newNode = new Node(data);

		// make next of new node as head
		newNode.next = head;

		// make head as new node since new node set at he front
		head = newNode;
	}

	
	
	@SuppressWarnings("unchecked")
	public void printNode() {
		Node<Integer> nodePointer = head;
		while(nodePointer != null) {
			System.out.print("[" + nodePointer.data + "]--->");
			nodePointer = nodePointer.next;
		}
		System.out.println();
	}
	
	public int getSize() {
		int count = 0;
		Node<Integer> nodePointer = head;

		while(nodePointer != null) {
			count++;
			nodePointer = nodePointer.next;
		}
		return count;
	}
	public void reverse() {
		
		Node<Integer> curr = head;
		Node<Integer> temp;
		while(curr.next != null) {
			temp = curr.next;
    		curr.next = temp.next;
    		temp.next = head;
    		head = temp;
			
		}
	}
	

	public void addAfter(Node prevNode, E data) {

		// checl for prev node it should not be null
		if (prevNode == null) {
			System.out.println("Previous node can not be null");
			return;
		}
	}
	
	
	public Node getNode(int index) {
		int count = 0;

		Node<Integer> temp = head;
		while (temp.next != null && count != index) {
			
			count++;
			temp = temp.next;
		}
		return temp;
	}

	public void delete(int index) {
		int count = 0;

		Node<Integer> temp = head, prev = null;
		while (temp != null && count != index) {
			
			count++;
			prev = temp;
			temp = temp.next;
		}

		if(temp != null) {
			if(prev == null) {
			    head = head.next;	
			}
			else {
				
				prev.next = temp.next;
			}
		}
	}
	
	public void deleteNode(E key) {

		// store head node
		Node<Integer> temp = head, prev = null;

		//traverse till to get key or till end
		while (temp != null && key != temp.data) {
			prev = temp;
			temp = temp.next;
		}
		if(temp != null) {
			if(prev == null) {
			    head = head.next;	
			}
			else {
				
				prev.next = temp.next;
			}
		}
	}

}

	

