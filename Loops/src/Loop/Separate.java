package Loop;
import java.util.Scanner;

public class Separate {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int odd =0 , even =0;
	for(int i=1;i<=n;i=i+2) {
//		System.out.print(i+" ");
		odd+=i;
	}
	System.out.println();
	for(int i=0;i<=n;i=i+2) {
//	System.out.print(i+" ");
		even+=i;
	}
	System.out.println("Odd:"+ odd + "\nEven:"+even);
}

		



}
