package pdfone;
import java.util.*;

public class TwoPointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int l = 0;
		int r = str.length() -1;
		char[] ch = str.toCharArray();
		while(l<r) {
			char temp =ch[l];
			ch[l] = ch[r];
			ch[r] = temp;
			l++;
			r--;
			System.out.print(l);

		}
		System.out.print(new String(ch));
	}

}
