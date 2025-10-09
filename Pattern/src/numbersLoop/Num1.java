package numbersLoop;

public class Num1 {
	public static void main(String... args) {
		for(int i =0;i<=5;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(" "+j);
			}

			for(int k=0;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
