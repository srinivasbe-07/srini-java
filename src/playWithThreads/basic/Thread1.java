package playWithThreads.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread1 {
		public static void main(String[] args) {
			new Thread(()->processTax()).start();
			new Thread(()->processTax()).start();
			
			ExecutorService es = Executors.newFixedThreadPool(4);
			for(int i = 0; i< 10; i++)
			{
				es.submit(()->processTax());
			}
				
			heavyCalculation();

		}
		
		public static void heavyCalculation() {
			System.out.println("Heavy calculation:" + Thread.currentThread());
		}
		
	    public static void processTax() {
	    	System.out.println("process Tax" + Thread.currentThread());
	    }
}
