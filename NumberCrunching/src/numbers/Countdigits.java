package numbers;

import java.util.Scanner;

public class Countdigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , m =0;
        while(n>0) {
        	++m;
        	n = n/10;
        }
        System.out.print(m);

	}
}
