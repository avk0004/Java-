package Loop;
import java.util.*;
public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a =0, b=1;
		int c =0;
		for(int i=0;i<=n-1;i++) {
			System.out.print(a+" ");
			c = a+b;
			a =b; b =c;
		}

	}

}
