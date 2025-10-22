package p1;
import java.util.*;
import java.math.*;
public class Squarefree {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int count =0;
		for(int i=2;i<=n;i++) {
			if(n%i ==0) {
				boolean found =true;
				for(int j =2; j*j<=i;j++) {
					if(i % (j*j) ==0) {
						found = false;
						break;
					}
				}
				if(found) {
					System.out.println(i);
					++count;
				}
			}
		}
		System.out.print(count);
	}
}
