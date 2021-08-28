package designpattern.creational.abstractfactory.computer;

import designpattern.creational.factory.computerstore.Computer;
import designpattern.creational.factory.computerstore.Server;

public class ServerFactory implements ComputerAbstractFactory{

	String ram;
	String hdd;
	String cpu;
	
	public ServerFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new Server(ram, hdd, cpu);
	}

}
