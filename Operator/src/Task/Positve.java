package Task;

import java.util.Scanner;

public class Positve {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a>0) {
			System.out.print("Postive");
		}
		else if (a == 0) {
			System.out.print("Zero");
		}
		else {
			System.out.print("negative");
		}
	}

}
