package seondround;

import java.util.Stack;

public class ValidMathExpression {
	
	public static boolean isvalid(String exp) {
		Stack<Character> sta = new Stack<>();
		char pre = ' ';
		for(int i =0;i<exp.length();i++) {
			char ch = exp.charAt(i);
			if(ch == '(') {
				sta.push(ch);
			}
			else if( ch == ')') {
				if(sta.isEmpty()) {return false;}
			}
			sta.pop();
		
		
		if(ch == '+' || ch == '-' || ch =='/' || ch == '*' || ch =='%') {
			if( pre == '(' || pre == ' ' || pre =='+' || pre == '-' || pre == '*' || pre == '/' || pre == ')') return false;
		}
		pre =ch;
		if( pre == '(' || pre == ' ' || pre =='+' || pre == '-' || pre == '*' || pre == '/' || pre == ')') return false;
			return false;
		}
		return sta.isEmpty();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub0
		String str = "(a+b)+c";
		if(isvalid(str)) System.out.print("true");
		else System.out.print("true1");
		
	}

}
