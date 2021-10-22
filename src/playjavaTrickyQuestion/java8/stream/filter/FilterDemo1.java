package playjavaTrickyQuestion.java8.stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
public static void main(String[] args) {
	/*List<Number> numbers =  new ArrayList<>();
	numbers.add(10);
	numbers.add(31);
	numbers.add(45);
	numbers.add(21);
	numbers.add(67);*/
	List<Integer> numbers =  new ArrayList<>();
	numbers.add(null);
	numbers.add(null);

	numbers.add(null);

	System.out.println(numbers);
//	Integer[] num = {34,12,56,12,43};
//	Collections.addAll(numbers, num);
//	numbers.remove(2);
//	List<Integer> evenNumbers = new ArrayList<>();
//	
//	//Without streams
//    for(int n : numbers) {
//    	if(n%2 == 0) {
//    		evenNumbers.add(n);
//    	
//    }}
//	System.out.println(evenNumbers);
//	
//	List<Integer> streamedEvenNumbers = new ArrayList<>();
//	
//	//withStreams
//	
//	streamedEvenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
//	
//	System.out.println(streamedEvenNumbers);
//	System.out.println(numbers);
//	numbers.stream().filter(n->n%2==0).forEach(n->System.out.print(n +" "));
//	numbers.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
