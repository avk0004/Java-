package numbers;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int k =0;
        while(n>0) {
        	int a = n%10;
        	k = k*10 + a;
        	n/=10;
        }
        if(k == m) {
        	System.out.println("Palidrome");
        }
        else {
        	System.out.println("No Palidrome");

        }
	}

}
