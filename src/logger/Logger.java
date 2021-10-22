package logger;

public class Logger {

	//create log --- info -- error  -- debug     --- write on db or disk 
	//read log --- info --error --debug   -- read from db or disk
	private String name;
	private String writeOn;
	Logger(String name, String  writeOn){
		this.name = name;
	}
	
	public void info(String msg) {
		
		// create log instance 
		if(writeOn.equals("disk")) {
			new LogDiskWriter().writeLog(new LogInfo());
		}
		else {
			new LogDBWriter().writeLog(new LogInfo());
		}
		
	}
	
	public void error(String msg) {
		
	}
	
	public void debug(String msg) {
		
	}
}
