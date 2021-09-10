package playjavaTrickyQuestion.java8.stream.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OddEven {
  public static void main(String[] args) {
	List<Integer> num = Arrays.asList(1,14,5,13,2,11,10,14,11);
	
	num.stream().filter(n-> n%2 == 0).map(n-> n + ", ").forEach(System.out::print);
	System.out.println();
	num.stream().filter(n-> n%2 != 0).map(n-> n + ", ").forEach(System.out::print);
	
	Map<String, List<Integer>> out = num.stream().collect(Collectors.groupingBy((a)->
	
	{
		if(a%2 == 0)
		return "Even Numbers";
		else
			return "odd numbers";}, Collectors.toList()));
	System.out.println(out);
	Map<Boolean, List<Integer>> oddEvenList = num.stream().collect(Collectors.partitioningBy(n->n%2!=0));
	System.out.println(oddEvenList.get(true).stream().collect(Collectors.toList()));
	System.out.println(oddEvenList.get(false).stream().collect(Collectors.toList()));

}
}
