package numbers;

import java.util.Scanner;

public class DisariumNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;

        // Step 1: count digits
        int temp = n;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Step 2: calculate disarium sum
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;

            int power = 1;
            for (int i = 0; i < count; i++) {
                power *= digit;
            }

            sum += power;
            count--;
            n /= 10;
        }

        // Step 3: check result
        if (sum == original)
            System.out.println("Disarium Number");
        else
            System.out.println("Not a Disarium Number");
    }
}
