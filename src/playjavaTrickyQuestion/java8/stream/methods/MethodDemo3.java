package playjavaTrickyQuestion.java8.stream.methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class MethodDemo3 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(9,1,5,8,6,3);
		//numbers.sort(null);
		//System.out.println(numbers);
		List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		
		List<Integer> decsSortedList = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(decsSortedList);
	}
}
