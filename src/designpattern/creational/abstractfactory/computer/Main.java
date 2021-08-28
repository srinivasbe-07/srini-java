package designpattern.creational.abstractfactory.computer;

import designpattern.creational.factory.computerstore.Computer;

public class Main {
	public static void main(String[] args) {
			Computer pc = ComputerFact.getComputer(new PCFactory("4GB", "1TB", "4 core"));
			Computer server = ComputerFact.getComputer(new ServerFactory("16GB", "20TB", "16 core"));
	    System.out.println("PC: " + pc);
	    System.out.println("Server: " + pc);
	}
}
