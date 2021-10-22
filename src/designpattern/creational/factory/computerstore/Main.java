package designpattern.creational.factory.computerstore;

public class Main {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("PC", "4GB", "1TB", "4 core");
		Computer server = ComputerFactory.getComputer("Server", "16GB", "20TB", "16 core");
		System.out.println(pc);
		System.out.println(server);
	}
}
