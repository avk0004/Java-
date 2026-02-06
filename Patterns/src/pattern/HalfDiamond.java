package pattern;
import java.util.*;

public class HalfDiamond {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt();
		for(int i =0;i<(2*n);i++) {
			if(i<=n) {
			for(int j =0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			}
			else {
				int c = i %n;
				for(int j = c;j<n;j++) {
					System.out.print("*");
					
				}
				System.out.println();
			}
		}
	}
}
