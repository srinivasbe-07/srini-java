package string;

import java.util.HashSet;
import java.util.Set;

public class PowerSet {

	
	public static  void getPowerSet(String str, int counter, String curr){
		
		if(counter == str.length())
		{
			System.out.print(curr + " ");
			return;
		}
		
		getPowerSet(str, counter + 1, curr + str.charAt(counter));
		getPowerSet(str, counter +1, curr);
	}
	
	
	public static void main(String[] args) {
		getPowerSet("abc", 0, "");
	}
}
