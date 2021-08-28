package designpattern.creational.factory.computerstore;

public class Main {

	public static void main(String[] args) {
		System.out.println(ComputerFactory.getComputer("PC", "4GB", "1TB", "4 core"));
		System.out.println(ComputerFactory.getComputer("Server", "16GB", "20TB", "16 core"));
	}
}
