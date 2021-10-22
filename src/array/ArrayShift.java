package array;

import java.util.Arrays;

public class ArrayShift {

	private int[] reverseArray(int[] arr, int i , int j) {
		while(i < j) {
			arr[i] = arr[i] + arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i] - arr[j];
			i++;
			j--;
		}
		return arr;
	}
	public int[] shiftArray(int[] arr, int n) {
		
	     reverseArray(arr, 0, n-1);
	     reverseArray(arr, n, arr.length -1);
	     reverseArray(arr, 0, arr.length -1);
	     return arr;
	}
	
	public static void main(String[] args) {
		ArrayShift arrayShift = new ArrayShift();
		System.out.println(Arrays.toString(arrayShift.shiftArray(new int[] {4,6,1,8,7,5}, 3)));
	}
}
