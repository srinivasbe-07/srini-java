package array.minmax;





public class MaxProfit {

	public static int maxProfitSolution1(int[] numbers) {
	    int buy, maxProfit = 0;
		for(int i = 0; i < numbers.length; i++) {
			buy = numbers[i];
			for(int j = i+1; j< numbers.length; j++) {
					maxProfit = Math.max(numbers[j]-buy, maxProfit);
				
			}
		}
		return maxProfit;
	}
	
	public static int maxProfitSolution2(int[] numbers) {
		int maxProfit =0;
		int max = 0;
		int[] auxArr = new int[numbers.length];
 	    for(int i = numbers.length - 1; i >=0; i--) {
           auxArr[i] = max = Math.max(max, numbers[i]);
           
 	    }
 	    for(int i = 0; i < numbers.length;i++) {
 	    	maxProfit = Math.max(maxProfit, auxArr[i] - numbers[i]);
 	    }
		return maxProfit;
	}
	
	public static int maxProfitSolution3(int[] numbers) {
	   int maxProfit = 0;
	   int minSoFar = numbers[0];
	   for(int i = 1; i < numbers.length; i++) {
		   minSoFar = Math.min(minSoFar, numbers[i]);
		   maxProfit = Math.max(maxProfit, numbers[i] - minSoFar);
	   }
	   return maxProfit;
	}
	
	public static void main(String[] args) {
		System.out.println(maxProfitSolution1(new int[] {45,12,13,40,100,1 , 999}));
		
		System.out.println(maxProfitSolution2(new int[] {45,12,13,40,100,1 , 40, 999}));
		
		System.out.println(maxProfitSolution3(new int[] {45,12,13,40,100,1 , 40, 4}));
		//initial buy = 45 sell = -1 canbuy = false cansell = false 
		
		//1. 12 buy = 12 canbuy = true cansell = false  max = -1
		
		//2. val=13 min=12, max=13
		
		//3. va1=40  min=12, max=40
		
		//4. val=100 min=12, max=100 
		
		//5. val=1 min 12, max 100
		
		//6. val=5 min=12, max=00
	}
}
