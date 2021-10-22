package playjavaTrickyQuestion.java8.stream;

import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String[] args) {
		IntStream intStream = IntStream.of(-7, -9, -11);
		intStream.forEach((s)->{
			System.out.println(s);
		});
		
	   
	}
}
