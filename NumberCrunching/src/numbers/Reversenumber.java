package numbers;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , m =0;
        while(n>0) {
        	int a = n%10;
        	m = m*10 + a;
        	n /=10;  
        }
        System.out.print(m);
	}

}
