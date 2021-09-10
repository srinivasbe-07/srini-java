package datastracture.queue;

import java.util.NoSuchElementException;

public class Queue {
	int front;
	int rear;
	int size;
	int arr[];
	public Queue(int size) {
		this.size = size;
		front = rear =  -1;
		arr =  new int[size];
	}
	
	public int enque(int data) {
	
		if((front == 0 && rear == size-1)|| (rear + 1) %  size == front)
		{
			System.out.println("Queue is full -- throw unSupported element exception");
			return -1;
		}
		if(front == -1 && rear == -1) {
			front = rear = 0;
		}
		else
		{
			rear = (rear + 1)%(size);
		}
		arr[rear] = data;
		return data;
	}
	
	public int dqueue() {
		
		if(front == -1) {
			System.out.println("Queue is empty -- throw noSuch element exception");
			return -1;
			
		}
		int rData = arr[front];
		if(front == rear) {
			front = rear = -1;
		}
		else
		{
			front = (front +1)% size;
		}
		return rData;
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue(5);
		
		System.out.println(queue.enque(1));
		System.out.println(queue.enque(2));
		System.out.println(queue.enque(3));
		System.out.println(queue.enque(4));
		System.out.println(queue.enque(5));
		System.out.println(queue.enque(6));
		
		System.out.println(queue.dqueue());
		System.out.println(queue.dqueue());
		System.out.println(queue.dqueue());
		System.out.println(queue.dqueue());
		System.out.println(queue.dqueue());
		System.out.println(queue.dqueue());
	}
	
}
