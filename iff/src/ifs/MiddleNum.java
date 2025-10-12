package ifs;

import java.util.*;	
public class MiddleNum{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit");
        int n1 = sc.nextInt();
        String n = String.valueOf(n1);
        int middle;
        String str ="",str1 ="";
        System.out.println(n.length());
        if(n.length()%2 ==0){
            middle = n.length()/2;
            for(int i=n.length()-1;i>=middle;i--){
                char ch = n.charAt(i);
                str = str+ ch;
            }
            System.out.println(str);
            for(int i=0;i<middle;i++){
                char ch = n.charAt(i);
                str1 = str1+ch;
            }
        }
        else{
            middle = (n.length()/2)+1;
            for(int i=n.length()-1;i>=middle;i--){
                char ch = n.charAt(i);
                str = str+ ch;
            }
            System.out.println(str);
            for(int i=0;i<middle;i++){
                char ch = n.charAt(i);
                str1 = str1+ch;
            }
        }
        String s= str1+str;
        int ne = Integer.parseInt(s);
        System.out.println(ne);
        sc.close();
	}
}