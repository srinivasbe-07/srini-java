package designpattern.creational.singleton;

public class LazzyInitialization {
	
	private static LazzyInitialization instance = null;
	
	private LazzyInitialization() {
		
	}
	
	public static LazzyInitialization getInstance() {
		if(null == instance) {
			instance = new LazzyInitialization();
		}
		return instance;
	}
	public static void main(String[] args) {
		System.out.println("Instance 1:- " + LazzyInitialization.getInstance().hashCode());
		System.out.println("Instance 2:- " + LazzyInitialization.getInstance().hashCode());
	}

}
