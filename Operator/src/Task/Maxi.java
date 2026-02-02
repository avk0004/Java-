package Task;
import java.util.*;

public class Maxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int Out = (a > b) ? ((a > c) ? ((a > d) ? a : d) : ((c > d) ? c : d))
                : ((b > c) ? ((b > d) ? b : d) : ((c > d) ? c : d));
		System.out.print(Out);
	}

}
