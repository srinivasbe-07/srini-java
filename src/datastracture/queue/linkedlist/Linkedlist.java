package datastracture.queue.linkedlist;

import java.util.LinkedList;

public class Linkedlist<E> {

	Node head;

	class Node {
		E data;
		Node next;

		Node(E data) {
			this.data = data;
			this.next = null;
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

	public void insert(E data) {

		// 1. create new node
		Node newNode = new Node(data);

		// 2. if the linklist is empty then make new node as head node
		if (head == null) {
			head = newNode;
			return;
		}

		// 3. else traverse till last node
		Node tempNode = head;
		while (tempNode.next != null) {
			tempNode = tempNode.next;
		}

		// 4 add new node at the last
		tempNode.next = newNode;

	}

	public void addAfter(Node prevNode, E data) {

		// checl for prev node it should not be null
		if (prevNode == null) {
			System.out.println("Previous node can not be null");
			return;
		}

		// 2 create new node
		Node newNode = new Node(data);

		// 3 link it to previous node
		newNode.next = prevNode.next;
		prevNode.next = newNode;

	}

	public Node getNode(int index) {
		int count = 0;

		Node temp = head;
		while (temp.next != null && count != index) {
			
			count++;
			temp = temp.next;
		}
		return temp;
	}

	public void delete(int index) {
		int count = 0;

		Node temp = head, prev = null;
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
		Node temp = head, prev = null;

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

	public void print() {
		Node pointer = head;
		while (pointer != null) {
			System.out.print(pointer.data + "--->");
			pointer = pointer.next;
		}
		System.out.println("null");
	}
    public void printMiddle() {
	
    	Node slowPointer = head;
    	Node fastpointer = head;
    	
    	while(fastpointer  != null && fastpointer.next != null)
    	{
    		slowPointer = slowPointer.next;
    		fastpointer = fastpointer.next.next;
    		
    	}
    	System.out.println("Middle Node: " + slowPointer.data);
    }
    
    public void createLoop(int index) {
    	
    	Node temp = head;
    	Node loopNode = null;
    	int count = 0;
    	while(temp.next != null) {
    		count++;
    		if(index == count) {
    			loopNode = temp;
    		}
    		
    		temp = temp.next;
    	}
    	temp.next = loopNode;
    	
    }
    
    private int getloopCount(Node loopNode) {
    	int count = 1;
    	Node temp = loopNode;
    	while(temp.next != loopNode) {
    		count++;
    		temp = temp.next;
    	}
    	return count;
    }
    public boolean detectLoop() {
    	Node slowPointer = head;
    	Node fastPointer = head;
    	while(slowPointer!= null &&  fastPointer != null && fastPointer.next != null) {
    		slowPointer = slowPointer.next;
    		fastPointer = fastPointer.next.next;
    		if(slowPointer == fastPointer) {
    			System.out.println("Loop Count:" + getloopCount(fastPointer));
    			return true;
    		}
    	}
    	return false;
    }
    public void printReversrLinkList(Node list) {
    	
    	if(list == null) {
    		return;
    	}
    	printReversrLinkList(list.next);
    	System.out.print(list.data + "-->");
    }
    public void reverseLinkList() {
    	Node curr = head, temp;
    	while(curr.next != null) {
    		temp = curr.next;
    		curr.next = temp.next;
    		temp.next = head;
    		head = temp;
    	}
    }
	public static void main(String[] args) {
		Linkedlist<Integer> linkedlist = new Linkedlist<Integer>();
		linkedlist.insert(10);
		linkedlist.printMiddle();
		linkedlist.insert(20);
		linkedlist.printMiddle();
		linkedlist.insert(30);
		linkedlist.printMiddle();
		linkedlist.insert(40);
		linkedlist.print();
		linkedlist.printMiddle();


		linkedlist.addFront(5);
		linkedlist.print();
		linkedlist.printMiddle();
		
		linkedlist.addAfter(linkedlist.getNode(2), 25);
		linkedlist.print();
		linkedlist.printMiddle();
		
		linkedlist.deleteNode(40);
		linkedlist.print();
		linkedlist.printMiddle();
		
		linkedlist.delete(0);
		linkedlist.print();
		linkedlist.printMiddle();
		linkedlist.insert(40);
		linkedlist.print();
		linkedlist.printReversrLinkList(linkedlist.head);
		linkedlist.print();

		linkedlist.reverseLinkList();
		linkedlist.print();
		linkedlist.createLoop(3);
		//linkedlist.print();
		System.out.println("Loop Node: " + linkedlist.detectLoop());
	}
}