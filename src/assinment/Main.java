package assinment;



class Main{
	public static void main(String[] args) {
	
    ODPrinter odPrinter = new ODPrinter();
	Thread producerThread = new Thread(()->{
		
		while(true) {
			odPrinter.produce();
		}
	});
	
Thread consumerThread = new Thread(()->{
		
		while(true) {
			odPrinter.consume();
		}
	});

producerThread.start();

consumerThread.start();
	}
	
}   