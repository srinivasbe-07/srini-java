package designpattern.creational.factory.computerstore;


public class PC extends Computer {

	
	private String ram;
	private String hdd;
	private String cpu;
	
	
	public PC(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	public PC() {
		// TODO Auto-generated constructor stub
	}
    
	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

}

