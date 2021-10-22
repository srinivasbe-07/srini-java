package designpattern.behaviour.observer;

public class Subsriber implements Observer{

	@Override
	public void updateMessage(Message m) {

		System.out.println("Publisher 1 publish");
	}

}
