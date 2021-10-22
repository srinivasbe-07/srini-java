package playWithThreads.reentrentDeadLock;

import java.util.concurrent.locks.ReentrantLock;

public class DeadLockMain {

	public static void main(String[] args) {

		ReentrantLock lock1 = new ReentrantLock();

		ReentrantLock lock2 = new ReentrantLock();

		Runnable runnable1 = new Runnable1(lock1, lock2);
		Runnable runnable2 = new Runnable2(lock1, lock2);

		Thread t1 = new Thread(runnable1, "th1");
		Thread t2 = new Thread(runnable2, "th2");
		
		
		t1.start();
		t2.start();
	}

}
