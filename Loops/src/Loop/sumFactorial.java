package Loop;
import java.util.Scanner;
public class sumFactorial {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

		    System.out.println("Total Values");
		    int n = sc.nextInt();
		    int m =0;
		    for(int i=1;i<=n;i++) {
			    System.out.println("Values");

		    	int f = sc.nextInt();
		    	int k =1;
		    	for(int j =1;j<=f;j++){
		    		k *=j;
		    	}
		    	m+=k;
		   }
		    System.out.print(m+" \t");
		}

	

}
