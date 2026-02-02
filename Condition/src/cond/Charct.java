package cond;
import java.util.Scanner;
public class Charct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a character: ");
	        char ch = sc.next().charAt(0);  // read single character

	        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
	            System.out.println("Alphabet");
	        }
	        else if (ch >= '0' && ch <= '9') {
	            System.out.println("Number");
	        }
	        else {
	            System.out.println("Special Character");
	        }
	}

}
