package designpattern.behaviour.observer;

public class Main {

	public static void main(String[] args) {
		Subject publisher = new Publisher();
		Observer subsriber = new Subsriber();
		
		publisher.attach(subsriber);
		
		publisher.notify(new Message("Hi 1"));

		publisher.detatch(subsriber);
	}
}