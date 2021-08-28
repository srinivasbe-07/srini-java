package designpattern.creational.singleton;

public class EagerInitialization {

	private EagerInitialization() {
		
	};
	private static EagerInitialization instance = new EagerInitialization();
	public static EagerInitialization getInstance() {
		return instance;
	}
	public static void main(String[] args) {
		System.out.println("Instance 1:- " + EagerInitialization.getInstance().hashCode());
		System.out.println("Instance 2:- " + EagerInitialization.getInstance().hashCode());
	}
}
