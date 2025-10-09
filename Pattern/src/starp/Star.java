package starp;
import java.util.*;
public class Star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =n; i>=0;i--) {
			for(int s = 0; s<(n-i);s++) {
				System.out.print(" ");			
		}
			for( int j=((2*i)-1);j>=1;j--) {
			System.out.print("*");			
			}
		System.out.print("\n");
		}
		for(int i =1; i<=n;i++) {
			for(int s = 0; s<(n-i);s++) {
				System.out.print(" ");			
		}
			for( int j=1;j<=((2*i)-1);j++) {
			System.out.print("*");			
			}
		System.out.println();
		}
	}
}
