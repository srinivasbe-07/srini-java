package numbers;

import java.util.Arrays;

public class FibonacciSeries {

	private static int[] printNormalFibonacciSeies(int num){
		int   arr[] = new int[num];
		arr[0] = 0;
		arr[1] = 1;
		int i = 2;
		while( i < num) {
			arr[i] = arr[i-1] + arr[i-2]; 
			i++;
		}
		return arr;
	}
	
	private static int printFibonacciSeiesRecursivly(int num){
		if(num <=1) {
			System.out.println(num + " ");
		    return num;
		}
		return printFibonacciSeiesRecursivly(num -1) + printFibonacciSeiesRecursivly(num -2);
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(printNormalFibonacciSeies(5)));
	    printFibonacciSeiesRecursivly(5);
	}
}
