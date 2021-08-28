package designpattern.creational.factory.computerstore;

public abstract class Computer {
	public abstract String getRam();

	public abstract String getHDD();

	public abstract String getCPU();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ram : "  + getRam() + " Hard Disk: " + getHDD() + " CPU:" +
				getCPU();
	}

}
