package Loop;

import java.util.Scanner;

public class Multiples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Multiple");
	    int m = sc.nextInt();

	    System.out.println("Till Value");
	    int n = sc.nextInt();

	    for(int i=1;i<=n;i++) {
	    	System.out.print(m*i+" \t");
	   }
	}

}
