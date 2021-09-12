package array.minmax;

public class LargestSum1 {
	public static void main(String[] args) {
		int[] arr = { 5, -4, 6, -3, 4, - 1 };
		int curSum = 0;
		int maxSum = 0;
		for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            if(curSum > maxSum) {
            	maxSum = curSum;
            }
            if(curSum < 0) {
            	curSum = 0;
            }
		}
		
		System.out.println(maxSum);
	}
}
