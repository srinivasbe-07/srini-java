package sort;

import java.util.Arrays;

public class QuickSort {

	// 4,3,2,5,7,9,1,6
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static int partion(int arr[], int left, int right) {

		int i = left, j = right;
		int pivot=  arr[left];
		while (i < j) {
			while (arr[i] <= pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i < j) {
				swap(arr, i, j);
			
			}
		}

	    swap(arr, left, j);
		return j;
	}

	public static void quickSort(int[] arr,  int left, int right) {
		if(left < right) {
			int index = partion(arr, left, right);
			quickSort(arr,  left, index-1);
		
			quickSort(arr,  index +1, right);

		}
		
	}

	public static void main(String[] args) {
		int[] arr = { 6, 5, 8, 9, 3, 10, 15, 12, 16 };
		// 4, 3, 2, 5, 7, 9, 6

		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
