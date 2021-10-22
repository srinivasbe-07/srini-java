package playjavaTrickyQuestion.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

	private int id;
	private String name;
	private int age;
	private String gender;
	private String department;
	private int yearOfJoining;
	private float salary;
	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, float salary) {
		super();
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
	    employeeList.add(new Employee(111,"Jeiya Brian", 32, "female", "HR", 2011, 25000.0f)); 
	    employeeList.add(new Employee(122,"Paul Niksoi", 25, "male", "Sale and Executive", 2015, 13500.0f)); 

	    employeeList.add(new Employee(133,"Marti Torran", 29, "male", "infrastructure", 2012, 18000.0f)); 

	    employeeList.add(new Employee(144,"Murali Gowda", 32, "male", "Product and Devlopment", 2014, 32500.0f)); 

	    employeeList.add(new Employee(155,"Nima Berlin", 27, "female", "HR", 2013, 22700.0f)); 

	    employeeList.add(new Employee(166,"Mannu Sarma", 35, "male", "Acount And Finance", 2010, 27000.0f)); 
	    
	    employeeList.add(new Employee(132,"Iqbal Hussan", 43, "male", "Security and Transport", 2011, 25000.0f)); 

	    employeeList.add(new Employee(171,"wang Lio", 31, "male", "Product and Devlopment", 2015, 34400.0f)); 

	    employeeList.add(new Employee(192,"Amelia Zoe", 25, "male", "Security and Transport", 2015, 35000.0f));
	    
	    employeeList.add(new Employee(184,"Jadon Dog", 38, "male", "Security and Transport", 2015, 11000.0f)); 

	    employeeList.add(new Employee(146,"Jasna Kaur", 27, "female", "Acount and Finance", 2013, 21300.0f)); 

	    employeeList.add(new Employee(156,"Nithin Josi", 28, "male", "Product and Devlopment", 2016, 28200.0f)); 

	    employeeList.add(new Employee(167,"Jyoti Readi", 27, "female", "Acount And Finance", 2013, 21000.0f)); 
	    
	    employeeList.add(new Employee(189,"Niculas Den", 24, "male", "Sale and Marketing", 2011, 10700.0f)); 

	    employeeList.add(new Employee(190,"Ali Baig", 23, "male", "Product and Devlopment", 2015, 28900.0f)); 

	    employeeList.add(new Employee(181,"sangiv pandey", 25, "male", "Product and Devlopment", 2012, 37000.0f));
	    
	    System.out.println(employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary))); 
//	    
//	    //Q. 1. How many male female employee are there in organization
//	    Map<String, Long> noOfMaleAndFemale = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//	    System.out.println(noOfMaleAndFemale);
//	    
//	    //Q2. print the name off all department in the organigation
//	    
//	    List<String> departments = employeeList.stream().map(e->e.getDepartment()).distinct().collect(Collectors.toList());
//	    System.out.println(departments);
//	    
//	    //Q3. Average age of male and female
//	    Map<String, Double> avgMaileFemaleAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
//	    System.out.println(avgMaileFemaleAge);
//	    
//	    //Q4 Higest payed employee
//	    Optional<Employee> reachestEmployee =  employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
//	    System.out.println("Reachest Employee:" + reachestEmployee.get().getName());
//	    
//	    //get all employee who joined after 2015
//       List<String> employeName_2015 = employeeList.stream().filter(emp->emp.getYearOfJoining()>=2015).map(Employee::getName).collect(Collectors.toList());
//       System.out.println(employeName_2015);
//       
//	    //count the no of employee in each department
//       
//       System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));
//       
//       //average salary of each department
//       
//       System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary))));
//       
//       //yongest male
//       System.out.println(employeeList.stream().filter(emp-> emp.getGender() == "male").min(Comparator.comparingInt(Employee::getAge)).get().getName());
//       
//     //yongest female
//       System.out.println(employeeList.stream().filter(emp-> emp.getGender() == "female").min(Comparator.comparingInt(Employee::getAge)).get().getName());
//     //males and females in product
//       
//      System.out.println(employeeList.stream().filter(emp->emp.getDepartment().equals("Product and Devlopment")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));
//     // most working experance
//      
//     System.out.println(employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).get().getName()); 
//	
//     //males and femailes in sales and marketing team
//     System.out.println(employeeList.stream().filter(emp->emp.getDepartment().equals("Sale and Marketing")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));
//     
//     //average sallary of male and female employee
//     System.out.println((employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))));
//	
//	//list out all name of each department
//     
//     Map<String, List<Employee>> list = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//     for(String str : list.keySet()) {
//    	 
//    	 System.out.println("*******************" + str + "**************************");
//    	 for(Employee emp : list.get(str)) {
//    		 System.out.println(emp.getName());
//    	 }
//    	 }
//     
//     // Average and total salary of whole employee
//     
//    System.out.println(employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)));
//    
//    Map<Boolean, List<Employee>> emppL = employeeList.stream().collect(Collectors.partitioningBy(emp->emp.getAge() > 25));
//    System.out.println("**********Salary less then 25*********");
//    System.out.println(emppL.get(true).stream().map(emp->emp.getName()).collect(Collectors.toList()));
//    
//    System.out.println("**********Salary grater then 25*********");
//    System.out.println(emppL.get(false).stream().map(emp->emp.getName()).collect(Collectors.toList()));
     
	}
	
	
}
