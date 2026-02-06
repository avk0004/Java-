package pattern;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=2*n;i++) {
			if(i<n) {
			for(int j =n;j>i;j--) {
				System.out.print(" ");
			}
			for(int j =0;j<2*i-1;j++) {
				System.out.print("*");

			}
			System.out.println();

			}
			else {
				for(int j =0;j<i-n;j++) {
					System.out.print(" ");

				}
			for(int j =1;j<= 2 * (2 * n - i) - 1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
			}
		}
	}

}
