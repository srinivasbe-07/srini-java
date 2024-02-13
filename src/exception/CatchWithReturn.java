package exception;

public class CatchWithReturn {

	public static void main(String[] args) {
		System.out.println(calculate());
		
		System.out.println();
		
		System.out.println();
		System.out.println(calculate1());
		
	}
	
	public static int calculate() {
		try {
			return 10/0;
		}
		catch (ArithmeticException e) {
			System.out.println("Error");
			return 1;
		}
		finally {
			System.out.println("final");
			return 0;
		}
	}
	
	public static int calculate1() {
		try {
			return 10/0;
		}
		catch (ArithmeticException e) {
			System.out.println("Error");
			System.exit(0);
			return 1;
		}
		finally {
			System.out.println("final");
			return 0;
		}
	}
}
