package datastracture.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/*
 * Given a string of lowercase alphabets, count all possible substrings (not necessarily distinct) that has exactly k distinct characters. 
Examples: 
 

Input: abbbbcccccccbbbb, k = 2
Output: 2
Possible substrings are {"ab", "bc"}

Input: aba, k = 2
Output: 3
Possible substrings are {"ab", "ba", "aba"}

Input: aa, k = 1
Output: 3
Possible substrings are {"a", "a", "aa"}
 */
public class CountKSubString {

	
	public static  int countKsubString(String str, int k) {
		int res = 0;
		int[] cnt = new int[26];
		
		for(int i=0; i < str.length(); i++) {
			int distinctCout  = 0;
			
			Arrays.fill(cnt, 0);
			for(int j = i; j < str.length(); j++) {
				
				if(cnt[str.charAt(j) - 'a'] == 0) {
					distinctCout++;
				}
				cnt[str.charAt(j) - 'a']++;
				if(distinctCout == k) {
					res++;
				}
					
			}	
		}
		return res;
		
	}
	public static void main(String[] args) {
		
		
		System.out.println(countKsubString("abcdab", 3));
		
		System.out.println(countKsubString("aaabbbbbbb", 2));
		System.out.println(countKsubString("abcbaa", 3));

	}
}
