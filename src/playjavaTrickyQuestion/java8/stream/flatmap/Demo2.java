package playjavaTrickyQuestion.java8.stream.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Demo2 {
public static void main(String[] args) {
	List<String> teamA= Arrays.asList("scott", "david", "jhon");
	List<String> teamB= Arrays.asList("srini", "rahim", "manju");

	List<String> teamC= Arrays.asList("sukesh", "jonna", "jack");
	
	List<List<String>> teams = Arrays.asList(teamA, teamB, teamC);
	
	List<String> murgedList = teams.stream().flatMap(t->t.stream()).collect(Collectors.toList());
	System.out.println(murgedList);

}
}
