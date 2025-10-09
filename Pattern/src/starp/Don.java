package starp;
import java.util.*;
public class Don {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("New");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i);
			}
			System.out.println();
		}	
		System.out.println("fib");
		int a = 1;
		int b = 2;
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=5;i++) {
			c = a+b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}

}
