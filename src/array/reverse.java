package array;

import java.util.Arrays;

public class reverse {
	public static void main(String[] args) {
//		int[] arr =  {10, 15, 20,12,14,16};
		char[] ch = {'s', 'r', 'i', 'n', 'i', 'v', 'a', 's'};
		int i = 0, j = ch.length-1;
		while(i < j) {
			ch[i] = (char) (ch[i] + ch[j]);
			ch[j] = (char) (ch[i] - ch[j]);
			ch[i] = (char) (ch[i] - ch[j]);
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(ch));
	}
}
