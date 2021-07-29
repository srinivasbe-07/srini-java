package playWithThreads.oddeventhread;

public class OddEvenTask implements Runnable{

	private boolean isEven;
	private OddEvenPrinter oddEvenPrinter;
	
	

	public OddEvenTask(boolean isEven, OddEvenPrinter oddEvenPrinter) {
		super();
		this.isEven = isEven;
		this.oddEvenPrinter = oddEvenPrinter;
	}



	@Override
	public void run() {
		
		int number = isEven ? 2 : 1;
		while(number <= 10) {
			if(isEven) {
				oddEvenPrinter.printEven(number);
			}
			else {
				oddEvenPrinter.printOdd(number);
			}
			number +=2;
		}
		
	}

}
