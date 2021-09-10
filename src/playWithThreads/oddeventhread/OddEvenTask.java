package playWithThreads.oddeventhread;

public class OddEvenTask implements Runnable {

	private boolean isOdd;
	private OddEvenPrinter oddEvenPrinter;

	public OddEvenTask(OddEvenPrinter oddEvenPrinter, boolean isOdd) {
		super();
		this.isOdd = isOdd;
		this.oddEvenPrinter = oddEvenPrinter;
	}

	@Override
	public void run() {


		while (true) {
			int number = isOdd ? 1 : 2;
			while (true) {
				if (isOdd) {
					oddEvenPrinter.printEvenNumber(number);
				} else {
					oddEvenPrinter.printOddNumber(number);
				}
				
				number += 2;
			}
		}
	}

}
