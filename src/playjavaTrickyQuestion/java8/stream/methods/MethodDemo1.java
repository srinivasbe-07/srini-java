 package playjavaTrickyQuestion.java8.stream.methods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class MethodDemo1 {
	public static void main(String[] args) {
		List<String> vechList = Arrays.asList("bus", "car", "truck", "bycycle", "car", "bus", "bycycle", "car");
		List<String> distinctVechle = vechList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctVechle);
		System.out.println(new HashSet<String>(vechList));
		long count  = vechList.stream().distinct().count();
		
		System.out.println(count);
		
	    List<String> limitedVechle = vechList.stream().limit(3).collect(Collectors.toList());
	    System.out.println(limitedVechle);
	}

}
