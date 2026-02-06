package numbers;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int  k =0;
        while(n>0) {
        	int a = n%10;
        	k = k + (a*a*a);
        	n/=10;
        }
        if(m == k) {
        	System.out.println("Armstrong");
        }
        else {
        	System.out.println("No Armstrong");

        }
	}

}
