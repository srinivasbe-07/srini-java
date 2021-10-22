package designpattern.behaviour.observer.newspaper;

public class Main {

	  public static void main(String[] args) {
	
		NewsPaperPublisher newsPaperPublisher = new NewsPaperPublisher();
		
		NewsPaperSubscriber1 newsPaperSubscriber1 = new NewsPaperSubscriber1();
		NewsPaperSubscriber2 newPaperSubscriber2 = new NewsPaperSubscriber2();
		
		newsPaperPublisher.registerSubscriber(newsPaperSubscriber1);
		newsPaperPublisher.registerSubscriber(newPaperSubscriber2);
		
		newsPaperPublisher.publishNewsPaper(new NewsPaper("Monday News Paper", "1"));
		newsPaperPublisher.publishNewsPaper(new NewsPaper("T News Paper", "2"));
	}
	
}
