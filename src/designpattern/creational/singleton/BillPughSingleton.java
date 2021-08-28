package designpattern.creational.singleton;

public class BillPughSingleton {
	
	private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	private BillPughSingleton() {
		
	}
	
	private static class SingletonHelper{
		public static BillPughSingleton getInstance() {
			return INSTANCE;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("1. " + BillPughSingleton.SingletonHelper.getInstance().hashCode());
		System.out.println("2. " + BillPughSingleton.SingletonHelper.getInstance().hashCode());
	}
}
