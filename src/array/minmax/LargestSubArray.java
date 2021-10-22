package array.minmax;

import java.util.Arrays;

public class LargestSubArray {

	private static  int getLargestSubArray(int[] arr, int k) {
		
		// 1,4,5,2,6,8,9,10
		int maxSum = 0;
		
		//brute force
		for(int i = 0; i < arr.length; i++) {
			int currSum = 0;

			for(int j = i; j < (i + k) && j< arr.length; j++) {
				currSum += arr[j];
			}
			if(maxSum < currSum) {
				maxSum = currSum;
			}
		}
		
		int currSum = 0;
		int currIndex = 0;
		for(int i =0; i < arr.length; i++) {
		
			currSum += arr[i];
			
			if(currIndex + i == k) {
				if(currSum - arr[currIndex] > currSum) {
					currSum = currSum - arr[currIndex];
				}
				currIndex = i;

				if(maxSum < currSum) {
					maxSum = currSum;
				}
				
			}
			
		}
		/*for(int i = 0; i < k; i++)
		{
			maxSum += arr[i]; 
		}
		int currSum = maxSum;
		for(int i = k; i< arr.length; i++) {
			int temp = currSum - arr[i - k] + arr[i];
			currSum = temp;
			maxSum = Math.max(maxSum, currSum);
		}*/
		return maxSum;
	}
	public static void main(String[] args) {
		System.out.println(getLargestSubArray(new int[] {9,4,5,0,6,8,9,1 }, 3));
	}
}
