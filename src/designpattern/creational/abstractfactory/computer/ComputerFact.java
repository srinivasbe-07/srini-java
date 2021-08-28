package designpattern.creational.abstractfactory.computer;

import designpattern.creational.factory.computerstore.Computer;

public class ComputerFact {

	public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory) {
		return computerAbstractFactory.createComputer();
	}
}
