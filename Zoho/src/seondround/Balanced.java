package seondround;
import java.util.*;

public class Balanced {
	protected boolean balance(String str) {
		Stack<Character> stack = new Stack<>();
		for(char ch:str.toCharArray()) {
			if(ch == '(') {
				stack.push(ch);
			}
			else if(ch == ')') {
				if(stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
			
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balanced obj = new Balanced();
		if(obj.balance("(())")) {
			System.out.println("Valid");
		}
		else 			System.out.println("not Valid");

	}

}
