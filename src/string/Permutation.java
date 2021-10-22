package string;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	
	
	public static void main(String[] args) {
		
		String str="ABC";
		List<String> res = new ArrayList<String>();
		StringBuilder curr = new StringBuilder("");
		boolean[] flags = new boolean[str.length()];
		printPermutation(str, res, curr, flags);
		System.out.println(res);

	}
	
	public static void  printPermutation(String str, List<String> res, StringBuilder curr, boolean[] flags) {
		
		if(curr.length() == str.length()) {
		 res.add(new String(curr));
		 return;
		}
		for(int i =0; i< str.length(); i++) {
			if(!flags[i]) {
				flags[i] = true;
				curr.append(str.charAt(i));
				printPermutation(str, res, curr, flags);
				flags[i] = false;
				curr.deleteCharAt(curr.length() -1);
			}
			
		}
	}
}