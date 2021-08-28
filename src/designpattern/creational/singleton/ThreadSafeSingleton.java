package designpattern.creational.singleton;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;
	private ThreadSafeSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static ThreadSafeSingleton getInstance() {
		if(null == instance) {
			synchronized (ThreadSafeSingleton.class) {
				if(null == instance)
				{
					instance = new ThreadSafeSingleton();
				}
				
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(()-> System.out.println("Thread 1: " + ThreadSafeSingleton.getInstance().hashCode()));
		Thread t2 = new Thread(()-> System.out.println("Thread 2: " + ThreadSafeSingleton.getInstance().hashCode()));
	    t1.start();
	    t2.start();
	}
}
