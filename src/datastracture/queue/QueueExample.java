package datastracture.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		//add elements into the queue [0, 1, 2, 3, 4, 5] to the queue
		for(int i = 0; i < 5; i++) {
			queue.add(i);
		}
		
		//Display content of the quaue
		System.out.println("ELememts of queue" + queue);
		
		//To remove head of the queue
		int removable = queue.remove();
		System.out.println("Rmovable element: " + removable);
		
		System.out.println(queue);
		
		
		//to view the head of the queue
		int head = queue.peek();
		System.out.println("Head of the queue: " + head);

		
		// Rest all methods of collection
        // interface like size and contains
        // can be used with this
        // implementation.
        int size = queue.size();
        System.out.println("Size of queue-"
                           + size);
        
        
        Queue<String> pq = new PriorityQueue<>();
        
        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
  
        System.out.println("Initial Queue " + pq);
  
        pq.remove("Geeks");
  
        System.out.println("After Remove " + pq);
  
        System.out.println("Poll Method " + pq.poll());
  
        System.out.println("Final Queue " + pq);
	}
}
