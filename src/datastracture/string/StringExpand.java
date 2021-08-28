package datastracture.string;


public class StringExpand {

	// Input : string input = "1-5, 8, 11-14, 18, 20, 26-29"
	// Output : string output = "1, 2, 3, 4, 5, 8, 11, 12, 13, 14, 18, 20, 26, 27,
	// 28, 29"

	public static void main(String[] args) {

		String input = "1-5, 8, 11-14, 18, 20, 26-29";
		String[] si = input.replace(" ", "").split(",");//[1-5] [8] [11-14] [18] [20] [26-29]
	  StringBuilder output = new StringBuilder();
		for(String eachSi : si) {
		  String[] s = eachSi.split("-");//[1,5]
		  if(s.length == 2) {
			  
			  int low = Integer.parseInt(s[0]);
			  int high = Integer.parseInt(s[1]);
			  while(low <= high) {
				  output.append(low + " ");
				  low++;
			  }
		  }
		  else {
			  output.append(s[0] + " ");
		  }
	  }
		System.out.println(output);
	}
	
}
