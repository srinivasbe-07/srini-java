package playWithThreads.reentrentDeadLock.blockingqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;



class Producer implements Runnable{

	MyBlockingQueue<Integer> blockingQueue;
	public Producer(MyBlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}
	@Override
	public void run() {
		int i =1;
		while(true) {
			System.out.println(blockingQueue.put(i++));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
}

class Consumer implements Runnable{

	MyBlockingQueue<Integer> blockingQueue;
	public Consumer(MyBlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}
	@Override
	public void run() {
		while(true) {
			System.out.println(blockingQueue.take());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class MyBlockingQueue<E>{
	private Queue<E> queue;
	private final int CAPACITY;
	private ReentrantLock reentrantLock = new ReentrantLock();
	private Condition putCondition = reentrantLock.newCondition();
	private Condition takeCondition = reentrantLock.newCondition();
	public MyBlockingQueue(int capacity) {
		this.CAPACITY = capacity;
		queue = new LinkedList<E>();
	}
	
	public E put(E data) {
		reentrantLock.lock();
		try {
			while(queue.size() >= CAPACITY)
			{
				try {
					putCondition.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			queue.add(data);
			takeCondition.signal();
			
			return data;
			
		}
		finally {
			reentrantLock.unlock();
		}
		
		
	}
	public E take() {
		reentrantLock.lock();
		try {
			while(queue.isEmpty()) {
				try {
					takeCondition.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			E data = queue.remove();
			putCondition.signal();
			return data;
		}
		finally {
			reentrantLock.unlock();
		}
		
	}
	public static void main(String[] args) {
		MyBlockingQueue<Integer> myBlockingQueue = new MyBlockingQueue<Integer>(5);
		Thread t1 = new Thread(new Producer(myBlockingQueue));
		Thread t2 = new Thread(new Consumer(myBlockingQueue));
		t1.start();
		t2.start();
	}
	
}