package playjavaTrickyQuestion.java8.stream.mapdemo;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
public static void main(String[] args) {
	List<String> names =  Arrays.asList("bus", "cars", "bycicle", "flights", "train");
	names.stream().map(n->n.length()).forEach(System.out::println);

}
}
