package miscellaneous;

public class FlipCoin {

	
	public static int getFlipWithStartingCharacter(String str, char expected) {
		int flipCont =0;
		for(int i =0;i < str.length(); i++) {
			if(str.charAt(i) != expected) {
				flipCont++;
			}
			expected = flip(expected);
		}
		return flipCont;
	}

	private static char flip(char expected) {
		return expected == '0' ? '1' : '0';
	}
	
	public static void main(String[] args) {
		String input =  "0001010111";
		System.out.println(Math.min(getFlipWithStartingCharacter(input, '0'), getFlipWithStartingCharacter(input, '1')));
	}
}
