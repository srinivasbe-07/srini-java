package designpattern.creational.factory.computerstore;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String cpu, String hdd) {
		if("PC".equalsIgnoreCase(type)) {
			return new PC(ram, hdd, cpu); 
		}
		else {
			return new PC(ram, hdd, cpu); 

		}
		
	}
}
