package datastracture.queue.linkedlist;


import array.reverse;

public class AddLinkList {

	
	private static MyLinkedlist<Integer> doSum(MyLinkedlist<Integer> l1, MyLinkedlist<Integer> l2) {
		int size1 = l1.getSize();
		int size2 = l2.getSize();
		if(size1 == 0)
			return l2;
		else if(size2 == 0)
			return l1;		
		MyLinkedlist<Integer> sumList = new MyLinkedlist<Integer>();
		if(size1 < size2) {
			MyLinkedlist<Integer> temp;
			temp = l1;
			l1 = l2;
			l2 = temp;
		}
		
		Node<Integer> t1 = l1.head;
		Node<Integer> t2 = l2.head;

		int carry = 0;
		
		while(t1 != null) {
			int sum = 0;

			if(t2 != null) {
				sum = t1.data + t2.data + carry;
				carry = sum /10;
				sumList.addNode(sum % 10);
			}
			else {
				sum = t1.data + carry;
				carry = sum /10;
				
				sumList.addNode(sum%10);

			}
			t1 = t1.next;
			if(t2 != null) {
				t2 = t2.next;
			}
			
		}
		if(carry > 0) {
			sumList.addNode(carry);
		}
		sumList.reverse();
		return sumList;
	}
	public static MyLinkedlist<Integer> sum(MyLinkedlist<Integer> l1, MyLinkedlist<Integer> l2) {
		l1.reverse();
		
		l2.reverse();
		
		return doSum(l1, l2);
		
		
		
	}
	public static void main(String[] args) {
		MyLinkedlist<Integer> linkList1 = new MyLinkedlist<Integer>();	
		linkList1.addNode(9);
		linkList1.addNode(2);
		linkList1.addNode(6);
		System.out.print("First: ");
		linkList1.printNode();
		
		MyLinkedlist<Integer> linkList2 = new MyLinkedlist<Integer>();
		linkList2.addNode(9);
		linkList2.addNode(8);
		System.out.print("Second: ");
		linkList2.printNode();
		
		MyLinkedlist<Integer> sum = sum(linkList1, linkList2);
		System.out.print("Sum: ");
		sum.printNode();
		
	}
	
}
