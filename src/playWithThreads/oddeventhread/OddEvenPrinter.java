package playWithThreads.oddeventhread;

public class OddEvenPrinter {

	private boolean isEvenPrinted = false;
	Object lock = new Object();
	public void printOddNumber(int number) {
		
		  synchronized (this) {
			  if(!isEvenPrinted) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			  System.out.println(number);
			  isEvenPrinted = false;
			  try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  notifyAll();
			  
		}
			
	}
	
	public void printEvenNumber(int number) {
		synchronized (this) {
			  if(isEvenPrinted) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			  System.out.println(number);
			  isEvenPrinted = true;
			  try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  notifyAll();
		}
		
	}
}