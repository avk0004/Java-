package numbers;

import java.util.Scanner;

public class digitsspace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String result = "";

        while (n > 0) {
            int digit = n % 10;
            result = digit + " " + result; 
            n /= 10;
        }

        System.out.println(result.trim());
    }
}
