package datastracture.string;

public class PrintFirstCharacter {

	//1 -- print by odd thread
	//2. print by even thread
	private Object lock = new Object();
	public static void main(String[] args) {
		
		OddEvenTask task  = new OddEvenTask();
		Thread  oth = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i =1; i < 100; i++) {
					task.printOddThread(i);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
			
	
		Thread  eth = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i =1; i < 100; i++) {
					task.printEvenThread(i);
				}
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		oth.start();
		eth.start();
	}
	
}

class OddEvenTask {
	
	
	private boolean isOdd = true;
	public void printOddThread(int number) {
		
		int count = 1;
		synchronized (PrintFirstCharacter.class) {
			
			while(!isOdd) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Printed by odd thread" + number);
			isOdd = true;
			notifyAll();
			
		}
	}
	
     public void printEvenThread(int number) {
		
		int count = 1;
		synchronized (PrintFirstCharacter.class) {
			
			while(isOdd) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Printed by even thread" + number);
			isOdd = false;
			notifyAll();
			
		}
	}
}
