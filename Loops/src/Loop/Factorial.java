package Loop;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    System.out.println("Till Value");
	    int n = sc.nextInt();
	    int m =1;
	    for(int i=1;i<=n;i++) {
	    	m *=i;
	   }
	    System.out.print(m+" \t");
	}

}
