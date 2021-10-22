package lambdabasic;

public class Greeter {

	public void greet(Greeting greeting) {
		
		greeting.perform();
	}
	
	public static int getDouble(int num) {
    	return 2*num;
    };
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		HelloWorldGreating helloWorldGreating  = new HelloWorldGreating();
		greeter.greet(helloWorldGreating);
		
		Greeting greeting  = ()->System.out.println("Hello world11");
		greeting.perform();
	  
		Greeting greeting2 = new Greeting() {
			
			@Override
			public void perform() {
			System.out.println("hello");
				
			}
		};
		
        Greeting greeting3 = new Greeting() {
			
			@Override
			public void perform() {
			System.out.println("hello");
				
			}
		};
		
		int doubleNum = getDouble(1);
	   
	  DoubleNum doubleNum1 = (int num) -> {
	    	return 2*num;
	    };
	}
		
	
	interface DoubleNum {
		int doubleNum(int num);
	}
}
