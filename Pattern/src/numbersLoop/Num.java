package numbersLoop;

public class Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1;i<=3;i++) {
			for(int j =1;j<=3;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i =1;i<=3;i++) {
			for(int j =1;j<=3;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

		int n = 3;
		for(int i =n;i>=1;i--) {
			for(int j =1;j<=n;j++) {
				System.out.print(n+j-i+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i =0;i<n;i++) {
			for(int j =0;j<n;j++) {
				System.out.print((i+j)%n+1);
			}
			System.out.println();
		}
	}
}


