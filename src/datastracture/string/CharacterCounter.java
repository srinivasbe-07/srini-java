package datastracture.string;

import java.util.HashMap;
import java.util.Map;


public class CharacterCounter {

	private String word;
	private final int ASCII_SIZE = 256;
	public CharacterCounter(String word) {
		this.word = word;
	}
	public Map<Character, Integer> countCharacter() {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String words = word.toLowerCase();
		for (int i = 0; i < words.length(); i++) {

			char ch = words.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		return map;
	}
	public String findMaxOccured(Map<Character, Integer> map) {
		String maxChar = "";
		int max = 0;
		for (Character key : map.keySet()){
			int value = map.get(key);
			if(value > max) {
				maxChar = key + "";
				max = value;
			}
		}
		
		return maxChar + ": " + max;
	}
	public static void main(String[] args) {
		CharacterCounter characterCounter = new CharacterCounter("Srinivaslu");
		Map<Character, Integer> result = characterCounter.countCharacter();
		System.out.println(characterCounter.countCharacter());
		System.out.println(characterCounter.findMaxOccured(result));
	}
}
