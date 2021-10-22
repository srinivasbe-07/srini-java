package designpattern.behaviour.observer.newspaper;

public class NewsPaperSubscriber1 implements NewsPaperSubscriber {

	@Override
	public void addNewsPaper(NewsPaper newsPaper) {

		System.out.println("Got News paper:" + newsPaper);
	}
	
	

}
