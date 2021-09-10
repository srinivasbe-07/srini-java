package datastracture.string;

public class ReverseStringWithSpecialCharacter {

	public static String reverseString(String str) {
		char[] characters = str.toCharArray();
		int l = 0, r=characters.length-1;
		while(l<r) {
			if(!Character.isAlphabetic(characters[l])) {
				l++;
			}
			else if(!Character.isAlphabetic(characters[r])) {
				r--;
			}
			else
			{
				char temp = characters[l];
				characters[l] = characters[r];
				characters[r] = temp;
				l++;
				r--;
			}
		}
		return new String(characters);
	}
	public static void main(String[] args) {
        String str = "a!!!b.c.d,e'f,ghi";
        System.out.println("Orignal: " + str);
        System.out.println("Reverse: " + reverseString(str));
	}
}
