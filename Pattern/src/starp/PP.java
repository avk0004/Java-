package starp;
import java.util.*;
public class PP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Num");
		for(int i=1;i<=n;i++) {
			for(int space=1;space<=i-1;space++) {
					System.out.print(" ");
				}
			for( int star =n-i+1;star>=1;star--) {
				System.out.print(star);	
			}
			System.out.println();
			}			
		sc.close();
	}
}
