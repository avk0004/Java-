package pattern;

import java.util.Scanner;

public class InvertedNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt();
		for(int i =1;i<=n;i++) {
			int a = 1;
			for(int j = n;j>=i;j--) {
				System.out.print(a); a++;
			}
			System.out.println();
		}

	}

}
