package variabless;

public class Main {
	public static void main(String[] args) {
        int a = 5, b=8;
        a = a^b;
        System.out.println(a);
        b = a^b;
        System.out.println(b);
        a=a^b;
        System.out.println(a);
        System.out.println("a is "+a+"\nb is "+b);
        System.out.println("adding");
        int c = a+b;
        a = c - a;
        b = c - b;
        System.out.println("a is "+a+"\nb is "+b);
        System.out.println("3rd variable");
        int p;
        p = a;
        a = b;
        b = p;
        System.out.println("a is "+a+"\nb is "+b);
	}

}
