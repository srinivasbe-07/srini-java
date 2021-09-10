package playjavaTrickyQuestion.java8.stream.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class MethodDemo2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4,1,12,-3,5,1,6,15);
		// count
		
		long count = numbers.stream().filter(n -> n%2==0).count();
		System.out.println("Even Number count: " + count);
		
		//max
		Optional<Integer> min = numbers.stream().min((v1,v2)->{
			return v1.compareTo(v2);
		});
		System.out.println("Minimum: " + min.get());
		
		//reduce
		Optional<Integer> nOptional = numbers.stream().reduce((value, combinedValue)-> {
		     System.out.println("value= " + value);
		     System.out.println("combinedValue= " +  combinedValue);
			return value + combinedValue;
		});
		
		System.out.println("reduced Value whic is sum:" + nOptional.get());
	}
}
