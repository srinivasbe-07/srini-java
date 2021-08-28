package javabasic.immutable;

import java.util.HashMap;
import java.util.Iterator;

public final class CustomImmutable {

	//1. all fields should be private
	private final int id;
    private final String name;
	
	//2. mutable filed should be final
	private final HashMap<String, String> muttableObject;
	
	//3. all fields be initialized only through  Constructor and perform deep copys
	public CustomImmutable(int num, String name, HashMap<String, String> muttableObject) {
		
		super();
		this.id = num;
		this.name = name;
        //this.muttableObject = muttableObject;
		
		System.out.println("performing deep copy"); HashMap<String, String> temp =
		new HashMap<String, String>();
		 
		String key; Iterator<String> it = muttableObject.keySet().iterator();
		while(it.hasNext()) { key = it.next(); temp.put(key,
		muttableObject.get(key)); } this.muttableObject = temp;
		
	}
	
	
	public String getName() {
		return name;
	}


	

	public int getId() {
		return id;
	}
	//4. should not provide setter method
	/*
	 * public void setNum(int num) { this.num = num; }
	 */


	//5. getter method must return clone of mutable object

	public HashMap<String, String> getMuttableObject() {
		return (HashMap<String, String>) muttableObject.clone();
	}
	
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "One");
		map.put("2", "Two");
		map.put("3", "Three");
		
		String s = "Orignal";
		int n = 10;
		
		CustomImmutable customImmutable = new CustomImmutable(n, s, map);
		
		System.out.println("Bellow let see field is copy by value or refrence");
		System.out.println(s==customImmutable.getName());
		System.out.println(n==customImmutable.getId());
		System.out.println(map == customImmutable.getMuttableObject());
		
		System.out.println("bellow are value of each field");
		System.out.println("Id:" + customImmutable.getId());
		System.out.println("name:" + customImmutable.getName());
		System.out.println("Mutable Object:" + customImmutable.getMuttableObject());
		
		System.out.println("Modified all field");
		s = "modified";
		n = 20;
		map.put("3", "four");
		map.put("4", "four");
		System.out.println("Print the value again");
		System.out.println(" id after local variable change:"+customImmutable.getId());
		System.out.println("name after local variable change:"+customImmutable.getName());
		System.out.println("ce testMap after local variable change 3d key as four and new key value:"+customImmutable.getMuttableObject());
		
	}
    
}
