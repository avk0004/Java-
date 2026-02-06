package numbers;

import java.util.Scanner;

public class CountOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , even =0 , odd =0;
        while(n>0) {
        	int a = n%10;
        	if(a % 2 ==0) even++;
        	else odd++;
        	
        	n /=10;  
        }
        System.out.print("Even"+even+ "\nodd"+odd);
	}

}
