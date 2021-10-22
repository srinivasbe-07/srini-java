package playWithThreads.reentrunt.oddeventhread;


public class Main {
	public static void main(String[] args) {
		OddEvenPrinter oddEvenPrinter = new OddEvenPrinter();
		Thread t1 = new Thread(new OddEventTask(oddEvenPrinter, true));
		Thread t2 = new Thread(new OddEventTask(oddEvenPrinter, false));
		t1.start();
		t2.start();
	}
}
