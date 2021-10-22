package numbers;

import java.util.Arrays;

public class SubsetSum {

	//1,2,7,5
	private static boolean getSubsetSum(int[] num, int sum) {
		
		int curSum = num[0];

		for(int i =0; i < num.length; i++) {
		    for(int j = 0  ; j < num.length; j++) {
		    	if(i != j) {
		    	
		    		curSum += num[j];
			    	if(curSum == sum)
			    	{
			    		return true;
			    	}
			    	else if(curSum > sum) {
			    		curSum = 0;

			    		break;
			    	}
		    	}
		    	
		    	
		    }
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(getSubsetSum(new int[] {1,2,7,5}, 9));
	}
}
