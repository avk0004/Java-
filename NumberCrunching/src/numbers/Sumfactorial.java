package numbers;

import java.util.Scanner;

public class Sumfactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , m =0;
        while(n>0) {
        	int a = n%10, x =1;
        	for(int i=1;i<=a;i++) {x *=i;}
        	m += x;
        	n /=10;  
        }
        System.out.print(m);

	}

}
