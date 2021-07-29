package playWithThreads.oddeventhread;

public class OddEven {
public static void main(String[] args) {
	
	OddEvenPrinter oddEvenPrinter =  new OddEvenPrinter();
	Thread oddThread = new Thread(new OddEvenTask(false, oddEvenPrinter),"odd thread");
	Thread evenThread = new Thread(new OddEvenTask(true, oddEvenPrinter),"even thread");
	oddThread.start();
	evenThread.start();

}
}
