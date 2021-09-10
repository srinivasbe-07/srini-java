package playjavaTrickyQuestion.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		List<Integer> list =  new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {

				System.out.println(t);
			}
		});
		list.forEach((i)->{
			System.out.println(i);
		});
		
		list.forEach(new MyConsumer());
	}
}

class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		
		System.out.println(t);
	}
	
}
