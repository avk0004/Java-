package numbers;

import java.util.Scanner;

public class AdamNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n*n;
        int d = 0;
        while(n>0) {
        	int a = n%10;
        	d = d*10+a;
        	n/=10;
        }
        int dd = d;
        int d1 = d*d;
        System.out.println(d1);
        int sam =0;
        while(d1>0) {
        	int a = d1%10;
        	sam =sam*10 +a;
        	d1 /=10;
        }
        String out = (sam == m) ? "True Adam Number" : "No Adam Number";
        System.out.println(out);
	}

}
