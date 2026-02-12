package seondround;

import java.util.Stack;

public class AdjacentDuplicate {
	public String Duplicate(String str) {
		Stack<Character> stack = new Stack<Character>();
		for(char ch:str.toCharArray()) {
			if(!stack.isEmpty() &&  ch==stack.peek()) {
				stack.pop();
			}
			else {
				stack.push(ch);
			}
		}
		String res = "";
		for(char c:stack) res +=c;
		return res;
	}
	public static void main(String[] args) {
		AdjacentDuplicate adj = new AdjacentDuplicate();
		System.out.println(adj.Duplicate("abbaca"));
	}

}
