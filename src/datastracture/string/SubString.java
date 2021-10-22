package datastracture.string;

public class SubString {
	
	public static void printSubString(String str) {
		
		//abcd  a ab abc abcd b bc bd c cd d 
		for(int i =0; i < str.length(); i++) {
			char[] subString = new char[str.length() - i];
			int k = 0;		
			for(int j =i; j < str.length(); j++) {
				subString[k++] = str.charAt(j);
				System.out.println(subString);
			}
		}
	}
	public static void main(String[] args) {
		printSubString("abcd");
	}
}
