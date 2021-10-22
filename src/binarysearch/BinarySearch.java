package binarysearch;

public class BinarySearch {

	int binarySearch(int[] arr, int l, int r, int data) {
		
		if( l <= r) {
			int mid = (l + (r))/2;
		    if(arr[mid] == data) {
		    	return mid;
		    }
		    if( data  < arr[mid]) {
		    	r =  mid -1;
		    }
		    else {
		    	l = mid + 1;
		    }

			return binarySearch(arr, l, r,data);
		}
		return -1;
				
		
		
	}
	
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] arr = new int[] { 2, 3, 4, 10, 20,21,25,27,28,29,35,38,40 };
		System.out.println(bs.binarySearch(arr, 0, arr.length -1, 2));
	}
}
