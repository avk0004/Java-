package Loop;



import java.util.Scanner;

public class Sums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    System.out.println("Till Value");
	    int n = sc.nextInt();
	    int m =0;
	    for(int i=0;i<=n;i++) {
	    	m +=i;
	   }
	    System.out.print(m+" \t");
	}

}
