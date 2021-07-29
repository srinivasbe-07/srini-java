package playWithThreads.oddeventhread;

public class OddEvenPrinter {

	private boolean isEvenPrinted = true;
	public synchronized void  printOdd(int oddNumber) {
		
		if(!isEvenPrinted) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(oddNumber);
		notify();
		isEvenPrinted = false;
	}
	public synchronized void printEven(int oddNumber) {
		if(isEvenPrinted) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(oddNumber);
		notify();
		isEvenPrinted = true;
	}
	
}
