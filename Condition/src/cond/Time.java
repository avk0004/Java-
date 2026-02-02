package cond;
import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter time in HH:MM format: ");
	        String input = sc.next();

	        String[] parts = input.split(":");
	        if (parts.length != 2) {
	            System.out.println("Invalid Time Format!");
	            return;
	        }

	        int hours = Integer.parseInt(parts[0]);
	        int minutes = Integer.parseInt(parts[1]);

	        if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59) {
	            System.out.println("Valid Time");
	        } else {
	            System.out.println("Invalid Time");
	        }
	    }
}



