package numbers;

import java.util.Scanner;

public class Productdigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , m =1;
        while(n>0) {
        	int a = n%10;
        	m *= a;
        	n /=10;  
        }
        System.out.print(m);
	}
}
