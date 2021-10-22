package numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeNumber {

	static int  i = 2;
	public static boolean isPrimeNumber(int n) {
		
		// Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;
 
        // Check if number is 2
        else if (n == 2)
            return true;
 
        // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;
 
        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
		
	}
	
	
	public static void main(String[] args) {
//		System.out.println(isPrimeNumber(37));
//		
//		List<Integer> nums = Arrays.asList(4, 7,12,17,19, 34);
//		
//		nums.stream().filter((n)->isPrimeNumber(n)).forEach(System.out::println);
		int i =14;
		System.out.println(IntStream.rangeClosed(	2, i-1).noneMatch(n->i%n==0));
		
	}
}
