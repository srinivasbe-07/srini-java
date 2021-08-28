package javabasic.immutable;

import java.util.HashMap;

public final class Employee {
	private final int id;
	private final String name;
	private final HashMap<String, String> metaData;

	public Employee(int id, String name, HashMap<String, String> metaData) {
		super();
		this.id = id;
		this.name = name;
		//clone
		HashMap<String, String> temp = new HashMap<String, String>();
		for(String eachKey : metaData.keySet()) {
			temp.put(eachKey, metaData.get(eachKey));
		}
		this.metaData = temp;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public HashMap<String, String> getMetaData() {
		return (HashMap<String, String>) metaData.clone();
	}
}
