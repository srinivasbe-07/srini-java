package datastracture.queue;

import java.util.Stack;

public class QueueWithStatck {
  int size;
  Stack<Integer> stack;
  
  public QueueWithStatck(int size) {

   this.size = size;
   stack = new Stack<Integer>();
  }
  
  public int enqueue(int data) {
	  if(stack.size() == size) {
		  System.out.println("Queue is full");
		  return 0;
	  }
	  else if(stack.isEmpty()) {
		  stack.push(data);
		  
	  }
	  else {
		  Stack< Integer> tempStack = new Stack<Integer>();
		  while(stack.size() >0) {
			  tempStack.push(stack.pop());
		  }
		  stack.push(data);
		  while(tempStack.size() >0) {
			  stack.push(tempStack.pop());
		  }
	  }
	  return data;
  }
  
public int dqueue() {
	if(stack.size() == 0)
	{
		System.out.println("queue is empty");
		return 0;
	}
	return stack.pop();
	  
  }

public static void main(String[] args) {
	QueueWithStatck  queueWithStatck = new QueueWithStatck(5);
	System.out.println(queueWithStatck.enqueue(1));
	System.out.println(queueWithStatck.enqueue(2));
	System.out.println(queueWithStatck.enqueue(3));
	System.out.println(queueWithStatck.enqueue(4));
	System.out.println(queueWithStatck.enqueue(5));
	System.out.println(queueWithStatck.enqueue(6));
	
	System.out.println(queueWithStatck.dqueue());
	System.out.println(queueWithStatck.dqueue());
	System.out.println(queueWithStatck.dqueue());
	System.out.println(queueWithStatck.dqueue());
	System.out.println(queueWithStatck.dqueue());
	System.out.println(queueWithStatck.dqueue());
}
}
