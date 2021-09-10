package datastracture.string;

import java.util.Arrays;

public class ReverseWords {
	
	
	public static void main(String[] args) {
		 String s = "i like this program very much";
		 String[] splS = s.split(" ");
		 StringBuilder outPut = new StringBuilder();
		 for(int i = 0; i < splS.length; i++) {
			 outPut.append(splS[splS.length -i -1]);
			 outPut.append(" ");
		 }
		 
		 System.out.println(outPut + " ");
		 
		 
	}
}
