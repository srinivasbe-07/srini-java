package assinment;

import java.util.Arrays;
import java.util.Iterator;


public class MinPlatform {

	public static void main(String[] args) {
		int[]  ar = {900, 940, 950, 1100, 1500, 1800};
		int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
		//Arrays.sort(ar);
		//Arrays.sort(dep);
        int stationCount = 1;
        int result = 1;
        int j = 0;
        for(int i =1; i < ar.length;) {

        	if(ar[i] <= dep[j]) {
        		stationCount++;
        		i++;
        	}
        	else if(ar[i] > dep[j]) {
        		stationCount--;
        		j++;
        	}
        	if(stationCount > result)
        	{
        		result = stationCount;
        	}
        }
        System.out.println(result);
	}
}
