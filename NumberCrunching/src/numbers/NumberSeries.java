package numbers;

import java.util.Scanner;

public class NumberSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a = 2;
        int b = 1;
        int n = sc.nextInt();
        for(int i =0;i<n;i++) {
        	System.out.print(a+" ");
        	int c = a+b;
        	a = b;
        	b = c;
        }
	}

}
