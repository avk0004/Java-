package seondround;

import java.util.Stack;

public class RemoveUnbalancedParentheses {
	public String Parentheses(String str) {
		Stack<Integer> stack = new Stack<>();
		boolean[] f = new boolean[str.length()];
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length();i++) {
			if(ch[i] == '(' ) {
				stack.push(i);
			}
			else if(ch[i] ==')') {
				if (stack.isEmpty()) {
					f[i] =true;
				}
				else {
					stack.pop();
				}
				
			}
			
		}
		while(!stack.isEmpty()) {
			f[stack.pop()] =true;
		}
		String res ="";
		for(int c =0;c<ch.length;c++)
			{
			if(!f[c]) res+= ch[c];
			}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveUnbalancedParentheses r = new RemoveUnbalancedParentheses();
		System.out.println(r.Parentheses("(((ab)"));
	}

}
