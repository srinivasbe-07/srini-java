package exception;

public class DealingWithException {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			System.out.println("result of divide:- " + divide(a, b));
		}
		catch (Exception e) {
		e.printStackTrace();
		System.out.println("Handled Exception");
		}
		finally {
			System.out.println("finally");
		}
		
	}
	
	public static int divide(int a , int b) {
		return a/b;
	}
}
