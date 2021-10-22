package sort;

import java.util.Arrays;

public class MurgeSort {

	private void murge(int[] arr, int beg, int mid, int end) {

		int[] temp = new int[arr.length];
		int i = beg, j = mid+1;
		int index = beg;
		while(i <= mid && j <= end) {
			if(arr[i] <= arr[j]) {
				temp[index++] = arr[i++];
				
			}
			else {
				temp[index++] = arr[j++];
			}
		}
		if(i > mid) {
			while(j <= end)
				temp[index++] = arr[j++];
		}
		else {
			while(i <=  mid)
				temp[index++] = arr[i++];
		}
		
		int k =beg;
		while(k < index) {
			arr[k] = temp[k];
			k++;
		}
	}

	public void sort(int arr[], int beg, int end) {

		if (beg < end) {
			int mid = (beg + end) / 2;

			sort(arr, beg, mid);
			sort(arr, mid + 1, end);

			murge(arr, beg, mid, end);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 10, 23, 1, 15, 6, 12, 15, 6 };
		MurgeSort murgeSort = new MurgeSort();
		murgeSort.sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
