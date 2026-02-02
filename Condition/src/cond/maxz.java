package cond;
import java.util.*;

public class maxz {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 4 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int largest;

        if(a >= b) {
            if(a >= c) {
                if(a >= d) {
                    largest = a;
                } else {
                    largest = d;
                }
            } else {
                if(c >= d) {
                    largest = c;
                } else {
                    largest = d;
                }
            }
        } else {
            if(b >= c) {
                if(b >= d) {
                    largest = b;
                } else {
                    largest = d;
                }
            } else {
                if(c >= d) {
                    largest = c;
                } else {
                    largest = d;
                }
            }
        }

        System.out.println("Largest number is: " + largest);
    }

}
