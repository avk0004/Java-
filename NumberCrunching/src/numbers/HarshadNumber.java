package numbers;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n, d =0;
        while(n>0) {
        	d =d+ (n%10);
        	n/=10;
        }
        System.out.println(d);
        if(m % d == 0) {
        	System.out.println("Harshad Number");
        }
        else {
        	System.out.println("Not Harshad Number");

        }

	}

}
