package pattern;

import java.util.Scanner;

public class BinaryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt();
		int a =0;
		for(int i =1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				if((j+i)% 2 ==0 ) {
				System.out.print(1);}
				else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}

}
