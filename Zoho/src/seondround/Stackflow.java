package seondround;
import java.util.*;
public class Stackflow {
	public static  String Reverse(String Str) {
		String m = "";
		Stack<Character> stack = new Stack<>();

		for(char ch:Str.toCharArray()) {
			stack.push(ch);
		}
		String em = "";
		while(!stack.isEmpty()) {
			em += stack.pop();
		}
		return em;
	}
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(Reverse(str));
	}

}
