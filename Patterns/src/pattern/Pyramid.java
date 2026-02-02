package pattern;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<2*n;i++) {
			if(i < n ) {
			for(int j =0;j<i;j++) {System.out.print("*");}			

			}
			else {
				for(int j =i;j>2*(i-n);j--) {System.out.print("*");}

			}
			System.out.println();
		}
	}

}
