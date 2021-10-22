package datastracture.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


public class ReverseString {
	public static void main(String[] args) {
		String input = "GeeksforGeeks";

		// 1. convert string into byte
		System.out.println("***********1. convert string into byte***********");
		byte[] strIntoByte = input.getBytes();
		byte[] result = new byte[strIntoByte.length];

		for (int i = 0; i < strIntoByte.length; i++) {
			result[i] = strIntoByte[strIntoByte.length - i - 1];
		}
		System.out.println(new String(result));

		// 2. using string builder

		StringBuilder input1 = new StringBuilder(input);
		System.out.println("***********2. Using string builder***********");
		System.out.println(input1.reverse());

		// 3. converting into chararray
		System.out.println("***********3. To char array***********");

		char[] charArray = input.toCharArray();
		char[] reversedCharArray = new char[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			reversedCharArray[i] = charArray[charArray.length - 1 - i];
		}
		System.out.println(reversedCharArray);
		
		//4. Convert the input string into character array by using the toCharArray()
		System.out.println("4. Convert the input string into character array by using the toCharArray()");
		char[] output = new char[input.length()];
		for(int i = 0; i < input.length(); i++) {
			output[i] = input.charAt(input.length() -1 - i);
		}
		System.out.println(output);
		
		//5. using array list object
		System.out.println("5. Using array list object");
		
	    char[] hello = input.toCharArray();
	    List<Character> list = new  ArrayList<Character>();
	    
	    for(char c : hello) {
	    	list.add(c);
	    }
	    Collections.reverse(list);
	    ListIterator<Character> li = list.listIterator();
	    while(li.hasNext()) {
	    	System.out.print(li.next());
	    }
	    
	    //6. Using StringBuffer
	    System.out.println("\n6. Using StringBuffer");
	    StringBuffer stringBuffer = new StringBuffer(input);
	    System.out.println(stringBuffer.reverse());
	}
}
