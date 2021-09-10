package playjavaTrickyQuestion.java8.stream.filter;

import java.util.Arrays;
import java.util.List;

public class FilterDemo2 {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Srinivas", "Ravi", "Rahim", "manju", "Santosh");
		
		names.stream().filter(n->n.length()>=4 &&n.length()<=6).forEach(n->System.out.println(n));
	    names.stream().filter(s->s.length()>4 && s.length() < 6).forEach(System.out::println);
	}

}
