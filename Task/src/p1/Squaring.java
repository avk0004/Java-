package p1;
import java.math.*;
public class Squaring {
	public static void main(String[] args) {
		int n =6;
		for(int i=1;i<2*n;i++) {
			for(int j=1;j<2*n;j++) {
				int right =(2*n)-j;
				int left =(2*n)-i;
				int top =i;
				int bottom =j;
				System.out.print(n- Math.min(Math.min(top, bottom),Math.min(left, right))+" ");
			}
			System.out.println();
		}
	}
}
