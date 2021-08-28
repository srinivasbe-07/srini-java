package designpattern.creational.factory.computerstore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializedSingletonInstance implements Serializable {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private static SerializedSingletonInstance instance;
  
  private SerializedSingletonInstance() {
	// TODO Auto-generated constructor stub
}
  
  public static SerializedSingletonInstance getInstance() {
	  if(instance  == null) {
		  instance =  new SerializedSingletonInstance();
	  }
	  return instance;
  }
  
  public static void main(String[] args) {
	
	  SerializedSingletonInstance instanceOne = SerializedSingletonInstance.getInstance();
	  
	  SerializedSingletonInstance instanceTwo = null;
	  
	  try {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file.ser"));
		out.writeObject(instanceOne);
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.ser"));
		try {
		     instanceTwo= (SerializedSingletonInstance) in.readObject();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  System.out.println("1:" + instanceOne.hashCode());
	  System.out.println("2:" +  instanceTwo.hashCode());
	  
}
  
}
