package playWithThreads.reentrunt.oddeventhread;

public class OddEventTask implements Runnable {

	private OddEvenPrinter oddEvenPrinter;
	private boolean isOdd;

	public OddEventTask(OddEvenPrinter oddEvenPrinter, boolean isOdd) {
		this.oddEvenPrinter = oddEvenPrinter;
		this.isOdd = isOdd;
	}

	@Override
	public void run() {

		int count = 1;
		if (!isOdd) {
			count = 2;
		}

		while (true) {
			if (isOdd) {
				oddEvenPrinter.oddPrint(count);
			} else {
				oddEvenPrinter.evenPrint(count);

			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count += 2;
		}
	}

}
