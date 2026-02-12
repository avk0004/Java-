package seondround;
import java.util.*;
public class PostfixExpression {
	public String Post() {
		Stack<Integer> stack = new Stack<Integer>();
		int[] arr = {4,5,5,25};
		int n = arr.length;
		int[] nth = new int[n];
		for(int i= n-1;i>=0;i--) {
			while(!stack.isEmpty() && stack.peek()<=arr[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) nth[i] = -1;
			else nth[i] = stack.peek();
			stack.push(arr[i]);
		}
		
		return Arrays.toString(nth);
	}
	public static void main(String[] args) {
		PostfixExpression post = new PostfixExpression();
		System.out.print(post.Post());
	}
}
