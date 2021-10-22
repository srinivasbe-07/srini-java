package playWithThreads.executorservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class Task implements Callable<Integer>{

	int i =0;
	public Task(int i) {
		this.i = i;
	}
	@Override
	public Integer call() throws Exception {
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//		}
		System.out.println("Executing any task " + i++ );

		return i;

	}
	
}
public class FixedThreadPoolDemo {

	static int i = 0;
	public static  Integer execuatingTask() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println("Executing task " + i++ );

		return i;

	}
	
	public static void throughCallable() {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for(int i = 0; i < 30; i++) {
			Future<Integer> f=  executorService.submit(()->execuatingTask());
			try {
				int out = f.get();
				System.out.println("output " + out );
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		executorService.shutdown();
	}
	
	public static void throughExecuateAny() {
		
		System.out.println("Any Task");
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		List<Task> task = new ArrayList<Task>();
		for(int i = 0; i < 30; i++) {
			
		
			task.add(new Task(i));
			
		}
		try {
			executorService.invokeAny(task);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		executorService.shutdown();
	}
	public static void throughExecuate() {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for(int i = 0; i < 30; i++) {
			executorService.execute(()->execuatingTask());			
		}
		
		executorService.shutdown();
	}
	public static void main(String[] args) {
		
		throughExecuate();
		
		throughCallable();
		
		throughExecuateAny();
	}
}
