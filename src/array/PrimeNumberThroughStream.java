package array;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberThroughStream {
public static void main(String[] args) {
	int number = 101;    
    List<Integer> primes = IntStream.rangeClosed(2, number)
                .filter(n -> isPrime(n))
                .boxed()
                .collect(Collectors.toList());
     
    System.out.println(primes);
}
   
static boolean isPrime(int number) {
    if(number <= 2)
        return number == 2;
    else
        return  (number % 2) != 0
                &&
                IntStream.rangeClosed(3, (int) Math.sqrt(	number))
                .filter(n -> n % 2 != 0)
                .noneMatch(n -> (number % n == 0));

}
}
