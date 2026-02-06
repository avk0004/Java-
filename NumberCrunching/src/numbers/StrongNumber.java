package numbers;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int d = 0;
        while(n>0) {
        	int a = n%10;
        	int x = 1;
        	for(int i =1;i<=a;i++) {
        		x *=i;
        	}
        	d +=x; 
        	n/=10;
        }
        System.out.println(d == m);

	}

}
