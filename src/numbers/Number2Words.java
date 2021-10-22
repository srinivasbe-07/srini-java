package numbers;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jassu
 *
 */
public class Number2Words {

	private final String[] UNIT_DIGITS_WORDS;
	private final String[] TENS_DIGIT_WORDS;
	private final String[] TEEN_DIGIT_WORDS;
	private int value;
	
	public Number2Words(int value) {
		super();
		UNIT_DIGITS_WORDS = new String[] { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		TENS_DIGIT_WORDS = new String[] { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };
		TEEN_DIGIT_WORDS = new String[] { "ten", "eleven", "twevle", "thirteen", "fourteen", "fifteen", "sixteen",
				"seventeen", "eighteen", "nineteen" };
		this.value = value;
	}

	private int getUnitDigit() {

		return value % 10;
	}

	private int getTeensDigit() {
		return value % 100 / 10;
	}

	private int getHundreedDigit() {
		return value % 1000 / 100;
	}

	private int getThousendDigit() {
		return value % 10000 / 1000;
	}

	private String unitDigitToString(int unit, int ten) {

		return ten == 1 ? "" : UNIT_DIGITS_WORDS[unit];
	}

	private String tensToString(int one, int tens) {
		if (tens == 1) {
			if (one == 0) {
				return TEEN_DIGIT_WORDS[0];
			} else {
				return TEEN_DIGIT_WORDS[one];
			}

		} else {
			return TENS_DIGIT_WORDS[tens];
		}

	}

	private String hundreedDigitToString(int hundreed) {
		return hundreed == 0 ? "" : UNIT_DIGITS_WORDS[hundreed] + " hundred";
	}

	private String thousendDegitToString(int thousend) {
		return thousend == 0 ? "" : UNIT_DIGITS_WORDS[thousend] + " thousend";
	}

	public String printNumberToString() {
		int unit = getUnitDigit();
		int ten = getTeensDigit();
		int hundreed = getHundreedDigit();
		int thousend = getThousendDigit();
		return thousendDegitToString(thousend) + " " + hundreedDigitToString(hundreed) + " " + tensToString(unit, ten)
				+ " " + unitDigitToString(unit, ten);
	}

	public static void main(String[] args) {
		System.out.println(new Number2Words(3110).printNumberToString());
	}
}
