package datastracture.queue.linkedlist;


public class LinkListUtil {

public void createLoop(int index, MyLinkedlist<Integer> myLinkedlist
		) {
    	
    	Node temp = myLinkedlist.head;
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
    
    public void printMiddle(MyLinkedlist<Integer> myLinkedlist) {
    	
    	Node<Integer> slowPointer = myLinkedlist.head;
    	Node<Integer> fastpointer = myLinkedlist.head;
    	
    	while(fastpointer  != null && fastpointer.next != null)
    	{
    		slowPointer = slowPointer.next;
    		fastpointer = fastpointer.next.next;
    		
    	}
    	System.out.println("Middle Node: " + slowPointer.data);
    }
    public boolean detectLoop(MyLinkedlist<Integer> myLinkedlist) {
    	Node slowPointer = myLinkedlist.head;
    	Node fastPointer = myLinkedlist.head;
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
}
