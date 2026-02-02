package Loop;
import java.util.*;
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean f = false;
		for(int i =2; i<(int)n/2;i++) {
			if(n % i ==0) {
				f = true;
				break;
			}
		}
		if(f) {
			System.out.println("Not Prime:"+n);
		}
		else {
			System.out.println("Prime:"+n);

		}
		
	}

}
