package playWithThreads.reentrunt.oddeventhread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class OddEvenPrinter {

	private ReentrantLock reentrantLock;
	private boolean isODD = true;
	Condition oddCondition;
	Condition evenCondition;

	public OddEvenPrinter() {
		reentrantLock = new ReentrantLock();
		oddCondition = reentrantLock.newCondition();
		evenCondition = reentrantLock.newCondition();
	}

	public void oddPrint(int num) {
		reentrantLock.lock();
		while (!isODD) {
			try {
				oddCondition.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(num);
		isODD = false;
		evenCondition.signalAll();
		reentrantLock.unlock();

	}

	public void evenPrint(int num) {
		reentrantLock.lock();

		while (isODD) {
			try {
				evenCondition.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(num);
		isODD = true;
		oddCondition.signalAll();
		reentrantLock.unlock();

	}
}
