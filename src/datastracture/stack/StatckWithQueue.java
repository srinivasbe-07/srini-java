package datastracture.stack;

import java.util.LinkedList;
import java.util.Queue;


public class StatckWithQueue {

	int size ;
    Queue<Integer> queue;
	public StatckWithQueue(int size) {
		this.size = size;
		queue = new LinkedList<Integer>();
	}
	
	public int push(int data) {
		
		if(queue.size() == size) {
			System.out.println("Statck is full");
			return 0;
		}
		if(queue.size() == 0) {
			queue.add(data);
		}
		else {
			Queue<Integer> tempQueue = new LinkedList<Integer>();
            while(queue.size() > 0) {
            	tempQueue.add((Integer) queue.poll());
            }
            queue.add(data);
            while(tempQueue.size() > 0) {
            	queue.add((Integer) tempQueue.poll());
            }
		}
		return data;
	}
	
	public int pop() {
		if(queue.size() == 0) {
			System.out.println("Queue is empty");	
			return size;
		}
		else {
			return (int) queue.poll();
		}
		
		
	}
	
	public static void main(String[] args) {
		StatckWithQueue statckWithQueue = new StatckWithQueue(5);
		System.out.println(statckWithQueue.push(1));
		System.out.println(statckWithQueue.push(2));
		System.out.println(statckWithQueue.push(3));
		System.out.println(statckWithQueue.push(4));
		System.out.println(statckWithQueue.push(5));
		System.out.println(statckWithQueue.push(6));

		
		System.out.println(statckWithQueue.pop());
		System.out.println(statckWithQueue.pop());
		System.out.println(statckWithQueue.pop());
		System.out.println(statckWithQueue.pop());
		System.out.println(statckWithQueue.pop());
		System.out.println(statckWithQueue.pop());
	}
}
