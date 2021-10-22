package string;


class Employee{
	int age;
	int name;
	public Employee(int age, int name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	
}
public class String1 {

	public static void main(String[] args) {
	
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = new String(s2);
		System.out.println(s1 == s2);
	    System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s2 == s3);
		System.out.println(s3.hashCode() == s2.hashCode());
	    System.out.println(s1 == "he"+"llo");
		System.out.println(s1 == ("hello123").substring(0,5)); 
	    System.out.println(s1 == s1.toString());
	    
	    
	    String test = "a";
	    int firstAddressOfTest = System.identityHashCode(test);
	    test += "b";
	    int secondAddressOfTest = System.identityHashCode(test);

	    System.out.println((firstAddressOfTest == secondAddressOfTest));
	    
	    Employee e = new Employee(1, 2);
	    System.out.println(System.identityHashCode(e));
	    
	    e.setAge(3);
	    System.out.println(e.hashCode());
	    
	    
	    System.out.println(System.identityHashCode(e));
	    
	    String str ="1111";
	    System.out.println(str.hashCode());
	    

	    str ="1111" + "";
	    System.out.println(str.hashCode());
	    

	    str ="1111" + "11";
	    System.out.println(str.hashCode());
	    

	    str ="1111aaa" ;
	    System.out.println(str.hashCode());
	    
	    String str1 = new String("1111");
	    
	    System.out.println(str1.hashCode());

	}
}
