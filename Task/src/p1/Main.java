package p1;
import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	int odd =0; 
	int even = 0;
	for(int i=1;i<=n;i++) {
		if(i % 2 ==0) {
			even++;
		}
		else {
			odd++;
		}
	}
	System.out.println("Even"+ even+" \nodd"+odd);
	}
}
