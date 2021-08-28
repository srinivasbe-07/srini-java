package datastracture.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintFirstCharacter {
	public static void main(String[] args) {
		String input  = "Hi Srinivas this is";
		Pattern p = Pattern.compile("\\b[a-zA-Z]");
		Matcher m = p.matcher(input);
		while(m.find()) {
			System.out.println(m.group());
		}
		
	}
}
