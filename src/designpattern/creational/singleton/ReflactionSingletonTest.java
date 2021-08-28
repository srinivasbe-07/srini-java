package designpattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflactionSingletonTest {
	public static void main(String[] args) {
		EagerInitialization instanceOne = EagerInitialization.getInstance();
		EagerInitialization instanceTwo = null;
		
		Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
		
		for(Constructor constructor : constructors) {
			constructor.setAccessible(true);
			try {
				instanceTwo = (EagerInitialization) constructor.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("1:" + instanceOne.hashCode());
			System.out.println("2: " + instanceTwo.hashCode());
		}
	}
}
