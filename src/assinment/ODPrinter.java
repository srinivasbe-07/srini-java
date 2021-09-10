package assinment;

public class ODPrinter {
	
  private boolean flag = false;
	
  public synchronized  void produce() {
	  
	  if(flag)
	  {
		  try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  System.out.println("produe");
	  flag = true;
	  notify();
	  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  
  public synchronized  void consume() {
	  

	  if(!flag)
	  {
		  try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  System.out.println("consume");
	  flag = false;
	  notify();
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}

