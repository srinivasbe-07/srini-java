package lambdabasic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import javabasic.immutable.Person;

public class Unit1Exercise {

	public static void main(String[] args) {
		Person person = new Person(37, "Srini", "Hi");
		
		List<Person> persons = Arrays.asList(new Person(37, "Rana", "Hi"),
				new Person(33, "Rahim", "sri"),
				new Person(31, "Manju", "Sri"),
				new Person(30, "Kavita", "Hi"),
				new Person(22, "Rani", "Nama"),
				new Person(11, "jaa", "Hi"));
		
		
		
		//step1 :sort list by last name
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getFirstname().compareTo(o2.getFirstname());
			}

			
 			
		});
		
		Collections.sort(persons, (p1,p2)-> p1.getFirstname().compareTo(p2.getFirstname()));		
		//step2: create a method that prints all elements in the list
		printAll(persons);
		
		
		//step3: Print all the last name print with H
		System.out.println();
		printConditionallyList(persons, (p)->p.getSecondName().startsWith("H"));
		
		
		printConditionallyPredicateList(persons, (p)->p.getSecondName().startsWith("S"));
	}

	private static void printConditionallyPredicateList(List<Person> persons, Predicate<Person> condition) {
		System.out.println();
		
		persons.forEach(new Consumer<Person>() {

			

			@Override
			public void accept(Person t) {
			System.out.println(t);
				
			}
		});
	}
	
	private static void printConditionallyList(List<Person> persons, Condition condition) {
		System.out.println();
		for(Person p : persons) {
			if(condition.test(p))
			System.out.println(p);
		}
	}

	private static void printAll(List<Person> persons) {
		
		for(Person p : persons) {
			System.out.println(p);
		}
	}
	
	interface Condition{
	
		public boolean test(Person p);
	}
}
