package numbers;

import java.util.Scanner;

public class SplitPhoneNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();   // 10-digit number

        int[] digits = new int[10];

        // extract digits
        for (int i = 9; i >= 0; i--) {
            digits[i] = (int)(n % 10);
            n /= 10;
        }

        // print in XXX-XXX-XXXX format
        for (int i = 0; i < 10; i++) {
            System.out.print(digits[i]);
            if (i == 2 || i == 5) {
                System.out.print("-");
            }
        }
    }
}
