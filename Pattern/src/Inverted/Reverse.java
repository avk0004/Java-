package Inverted;

public class Reverse {
	public static void main(String ... args) {
		int n = 5;
		for(int i=1;i<=n;i++) {
			for(int j =n;j>=1;j--) {
				if(i %2 == 0) {
					System.out.print(n-j+1);
					}
			
				else {
					System.out.print(j);
				}
			}

			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j =i;j<=n-1;j++) {
				System.out.print(" ");
			}
			for(int k =1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=n;i>=1;i--) {
			for(int j =i;j<=n-1;j++) {
				System.out.print(" ");
			}
			for(int k =1;k<=i ;k++) {
				System.out.print(k+n-i);
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			for(int j =1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int k =n;k>=i ;k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		for(int i=n;i>=1;i--) {
			for(int j =n;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k =n;k>=i;k--) {
				System.out.print(k+i);
			}
			System.out.println();
		}
		System.out.println();
	}
}	

