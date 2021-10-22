package designpattern.creational.abstractfactory.computer;

import designpattern.creational.factory.computerstore.Computer;
import designpattern.creational.factory.computerstore.PC;

public class PCFactory implements ComputerAbstractFactory{

	private String hdd;
	private String ram;
	private String cpu;
	
	
	public PCFactory(String hdd, String ram, String cpu) {
		super();
		this.hdd = hdd;
		this.ram = ram;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new PC(ram,  hdd, cpu);
	}

}
