package playjavaTrickyQuestion.java8.stream.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> nos = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(nos.stream().reduce(0,(total, n)->{
			return total + n;
		}));
		
		System.out.println(nos.stream().reduce(0, Integer::sum));
		
		List<String> characters = Arrays.asList("a","b", "c", "d");
		System.out.println(characters.stream().reduce("", (partial, ch)-> partial + ch));
		System.out.println(characters.stream().reduce("", String::concat));
		

		
	}
}
