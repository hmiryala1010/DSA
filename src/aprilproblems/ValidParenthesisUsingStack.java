package aprilproblems;

import java.util.Stack;

public class ValidParenthesisUsingStack {
	
	public boolean validParentheses(String s) {
		Stack<Character> st=new Stack<>();
		for(char current:s.toCharArray()) {
			if(current=='(' || current=='{'||current=='[')
				st.push(current);
			else 
			{
				if (st.isEmpty())
					return false;
			char top=st.pop();
			if(current==')' && top!='(' ||
				current==']' && top!='[' ||
				current=='}' && top!='{')
				return false;
			}
			}
		
		return st.isEmpty();
	}

}
//tc O(n)
//sc O(n)