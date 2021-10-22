package javabasic.immutable;

public class Person {

	private int age;
	private String firstname;
	private String secondName;
	public Person(int age, String firstname, String secondName) {
		super();
		this.age = age;
		this.firstname = firstname;
		this.secondName = secondName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "First Name: " + firstname + " SecondName " + secondName + " Age: " + age;
	}
}
