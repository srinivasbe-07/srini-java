package playjavaTrickyQuestion.java8.stream.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FlatMapDemo1{
	
	public static void main(String[] args) {
		//map()
		List<Integer> list1 = Arrays.asList(34,1,24,7,12,13,56,18,4,3,6);
		List<Integer> result1 = list1.stream().map(n->n+10).collect(Collectors.toList());
	    System.out.println(result1);
	    
	    //flatMap()
	    List<Integer> lst1 = Arrays.asList(12,43,12);
	    List<Integer> lst2 = Arrays.asList(10,31,50);
	    List<Integer> lst3 = Arrays.asList(15,35,61);
	    
	    List<List<Integer>> finalList = Arrays.asList(lst1, lst2, lst3);
	    System.out.println(finalList);
	    finalList.stream().map(li->li).forEach(System.out::println);
	    
	    finalList.stream().flatMap(x->x.stream().map(n->n+10)).forEach(System.out::println);
	    }

}
