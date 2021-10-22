package datastracture.stack;

import java.util.Stack;

public class PatternMatching {

	public static boolean isPatternBalanced(String str) {
		Stack<String> stack = new Stack<String>();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '(') {
				stack.push(str.charAt(i) + "");
			
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
				
				String poped = stack.pop();
			    switch(str.charAt(i)) {
			    	case ')' :
			    		
			    		if(!poped.equals("(")) {
			    			return false;
			    		}
			    		break;
			    	case '}' :
			    		if(!poped.equals("{")) {
			    			return false;
			    		}
			    		break;
			    	case ']' :
			    		if(!poped.equals("[")) {
			    			return false;
			    		}
			    		break;
			    	default :
			    		return false;
			    }
			}
		}		
			
		return stack.isEmpty();

	}
	public static void main(String[] args) {
		System.out.println(isPatternBalanced("[{()}]"));
	}
}
