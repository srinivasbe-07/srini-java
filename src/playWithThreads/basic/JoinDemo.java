package playWithThreads.basic;

class Task implements Runnable {

	private Thread predecessor;

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started");
		if (null != predecessor) {
			try {
				predecessor.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " finished");

	}

	public void setPredecessor(Thread predecessor) {
		this.predecessor = predecessor;
	}
}

public class JoinDemo {

	public static void main(String[] args) {

		// we have three threads and we need to run in the
		// order T1, T2 and T3 i.e. T1 should start first
		// and T3 should start last.
		// You can enforce this ordering using join() method
		// but join method must be called from run() method
		// because the thread which will execute run() method
		// will wait for thread on which join is called.
		// Read more:
		// https://www.java67.com/2015/07/how-to-join-two-threads-in-java-example.html#ixzz72198Ro5z

		Task task1 = new Task();
		Task task2 = new Task();
		Task task3 = new Task();

		Thread t1 = new Thread(task1, "Thread 1");
		Thread t2 = new Thread(task2, "Thread 2");
		Thread t3 = new Thread(task3, "Thread 3");

		task3.setPredecessor(t1);
		task1.setPredecessor(t2);
		t1.start();
		t2.start();
		t3.start();
	}

}
