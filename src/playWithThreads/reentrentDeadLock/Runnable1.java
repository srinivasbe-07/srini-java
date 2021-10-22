package playWithThreads.reentrentDeadLock;

import java.util.concurrent.locks.Lock;

public class Runnable1 implements Runnable {

	private Lock lock1, lock2;
	
	public Runnable1(Lock lock1, Lock lock2) {
		super();
		this.lock1 = lock1;
		this.lock2 = lock2;
	}
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		
		System.out.println(threadName + " attempting to lock lock1");
		lock1.lock();
		System.out.println("Lock 1 locked by " + threadName);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(threadName + " attempting to lock lock2");
		lock2.lock();
		System.out.println("Lock 2 lockedby " + threadName);
		
		
		System.out.println("Unlocking lock 1 ");
		lock1.unlock();
		System.out.println("Unlocking lock 2");
		lock2.lock();
		
	}

}
