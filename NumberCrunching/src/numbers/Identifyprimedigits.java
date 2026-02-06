package numbers;

import java.util.Scanner;

public class Identifyprimedigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String k ="";
        while(n>0) {
        	int a = n %10;
        	if( a ==4 || a == 6 || a == 8 || a == 0 || a == 9 && a != 1);	
        	else k = k+a; n= n/10;
        }
        System.out.println(k);
	}

}
