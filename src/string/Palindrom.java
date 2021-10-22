package string;

public class Palindrom {

	
	public static boolean isPalindrom(String str, int i, int j) {
		if(str.charAt(i) != str.charAt(j)) {
			return false;
		}
		if(i == j) {
			return true;
		}
		
		return isPalindrom(str, i + 1, j -1);
	}
	
	public static void main(String[] args) {
		
	
		System.out.println(isPalindrom("madama", 0, 5));
	}
}
