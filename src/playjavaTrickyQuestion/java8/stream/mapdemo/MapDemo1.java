package playjavaTrickyQuestion.java8.stream.mapdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
	
	public static void main(String[] args) {
		List<String> names =  Arrays.asList("bus", "cars", "bycicle", "flights", "train");
		
		List<String> capNames = names.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
        System.out.println(capNames);
		
	}

}
