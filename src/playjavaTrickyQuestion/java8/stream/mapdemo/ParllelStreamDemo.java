package playjavaTrickyQuestion.java8.stream.mapdemo;

import java.util.Arrays;
import java.util.List;

class Student{
	String name;
	int mark;
	public Student(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	}
	
	

public class ParllelStreamDemo {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Ram", 70),
				new Student("sita", 65),
				new Student("gita", 82),
				new Student("nita", 34),
				new Student("sarita", 85),
				new Student("srini", 55),
				new Student("Ram", 70));
		       //sequence stream
		       System.out.println("sequence stream");
		       students.stream().filter(s->s.getMark()>=70)
		                        .limit(3)
		                        .forEach(s->System.out.println("Name: " + s.getName() + ", Marks: "+ s.getMark() ));		
	           
		       System.out.println();
		       //parllel stream
		       System.out.println("parllel stream");
		       students.parallelStream().filter(s->s.getMark() >= 70)
		                                .forEach(s->System.out.println("Name: " + s.getName() + ", Marks: "+ s.getMark() ));
		       System.out.println("sequential to parllel");
		       //put it into sequential stream and then to parllel
		       
		       students.stream().parallel().filter(s->s.getMark() >= 70)
		                                .forEach(s->System.out.println("Name: " + s.getName() + ", Marks: "+ s.getMark() ));

		
	}
}
