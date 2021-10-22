package array;

import java.util.Arrays;

public class ArrayShift {

	// [1, 2, 3, 4, 5, 6, 7]
		// shift from the beginning and put last value to initial
		// [7, 1, 2, 3, 4, 5, 6]
		// [6, 7, 1, 2, 3, 4, 5]


		public static int[] rotateArray1(int[] arr, int d) {

			// with out extra memory and compexity O(m*n)
			int len = arr.length;
			for (int i = 0; i < d; i++) {
				int curr = arr[0];
				for (int j = 0; j < len - 1; j++) {
					int temp = arr[j+1];
					arr[j + 1] = curr;
					curr  = temp;

				}
				arr[0] = curr;
			}

			return arr;
		}

		// [1, 2, 3, 4, 5, 6, 7]
		   // reverse whole array -> [7,6,5,4,3,2,1]
			//reverse 0, d-1 --> [6, 7, - 5, 4, 3, 2, 1]
			//reverse d to last --> [6, 7, --, 1, 2, 3, 4,from,  5]
		public static int[] rotateArray2(int[] arr, int d) {

			// with memory O(m) and compexity O(m)
			int n = arr.length;
		
			reverseArray(arr, 0, n);
			reverseArray(arr, 0, d);
			reverseArray(arr, d, n);
			return arr;
		}

		private static void reverseArray(int[] arr, int from, int n) {
			for(int i =from, j = n-1; i < j; i++, j--) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
	 		}
		}

		public static void main(String[] args) {
			System.out.println(Arrays.toString(rotateArray1(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 2)));
			System.out.println(Arrays.toString(rotateArray2(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 2)));

		}

}
