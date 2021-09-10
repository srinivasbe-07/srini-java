package playWithThreads.oddeventhread;

public class OddEven {
public static void main(String[] args) {
	
	  OddEvenPrinter oddEvenPrinter = new OddEvenPrinter();
       Thread t1= new Thread(new OddEvenTask(oddEvenPrinter, true));
       Thread t2 = new Thread(new OddEvenTask(oddEvenPrinter, false));
       t1.start();
       t2.start();

}
}
