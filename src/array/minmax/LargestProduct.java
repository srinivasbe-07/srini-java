package array.minmax;

import java.util.stream.Stream;

public class LargestProduct {
	
	//{6, -3,2 -10,-2, -4 0, 2}
	public static int largestProductSubArray(int[] arr) {
		int largestProduct = arr[0];
		int negProduct = arr[0];
		int negIndex = -1;
		int currproduct = arr[0];
        boolean isZero = false;
		if(arr[0]< 0) {
			negProduct = arr[0];
			negIndex = 0;		}
		for(int i =1; i < arr.length; i++) {
			if(arr[i] < 0) {
				if(negIndex == -1) {
					negIndex = i;
					largestProduct = Math.max(currproduct, largestProduct);
					negProduct = currproduct * arr[i];
					currproduct =1;
					continue;
				}
				currproduct *= negProduct * arr[i];
				if(arr.length < i +1) {

					negProduct = arr[i+1];	
				}
				negIndex = -1;
			}
			else if(arr[i] == 0) {
                isZero = true;
				negIndex = -1;
				largestProduct = Math.max(currproduct, largestProduct);
				currproduct =1;
				negProduct = 1;
				continue;
			}
			else {
				currproduct *= arr[i];  

			}
		}
		largestProduct = Math.max(currproduct, largestProduct);
        if(largestProduct < 0 && isZero){
            largestProduct = 0;
        }
		return largestProduct;
	}
	public static void main(String[] args) {
		System.out.println(largestProductSubArray(new int[] {-2,0, -1}));
	}
}
