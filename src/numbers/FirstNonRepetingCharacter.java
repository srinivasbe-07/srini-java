package numbers;

import java.util.ArrayList;
import java.util.List;

public class FirstNonRepetingCharacter {
	
	private static char getFirstNonRepetingCharacter1(String str) {
		List<Character> repeatingCharacter = new ArrayList<>();
        char res = str.charAt(0);
		//aaabcccddeeeff
        for(int i =0; i< str.length(); i++) {
			for(int j = 0 ; j < str.length(); j++) {
				char ch = str.charAt(i);
				if(i == j) {
					continue;
				}
				if(str.charAt(i) == str.charAt(j)) {
					res = '-';
					break;

				}
				res = str.charAt(i);
				
			}
			
			if (res != '-') {
				break;
			}
			
		}
		return res;
	}
	private static char getFirstNonRepetingCharacter(String str) {
		List<Character> repeatingCharacter = new ArrayList<>();
		
		for(int i = 0; i < str.length(); i++) {
			if(repeatingCharacter.contains(str.charAt(i))) {
				continue;
			}
			
			if(str.lastIndexOf(str.charAt(i)) == i) {
				return str.charAt(i);
			}
			else {
				repeatingCharacter.add(str.charAt(i));
			}
		}
		return '-';
	}
	public static void main(String[] args) {
		System.out.println(getFirstNonRepetingCharacter1("qaaabbcccddeeeff"));
		
	}
}
