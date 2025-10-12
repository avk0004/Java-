package ifs;
import java.util.*;
public class Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num");
        int n = sc.nextInt();
        System.out.printf("ENTER A  num %5s%n ",n);
        if( n %2 ==0){
            System.out.printf("number is even %10d%n",n);
        }
        else{
            System.out.printf("number is odd %10s%n",n);
        }

    }
}
