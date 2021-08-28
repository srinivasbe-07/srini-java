package datastracture.string;

public class ReverseWords {
	public static void main(String[] args) {
		 String s = "i.like.this.program.very.much";
		 String[] str = s.split("\\.");
	        StringBuilder strB = new StringBuilder();
	        for(int i = 0; i <  str.length; i++){
	            if(i == str.length-1){
	                strB.append(str[0]);
	            }
	            else{	
	                strB.append(str[str.length - 1 - i] + ".");        
	            }
	            
	        }
	        System.out.println(strB.toString());
	}
}
