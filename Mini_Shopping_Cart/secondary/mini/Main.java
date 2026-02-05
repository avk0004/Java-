package mini;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AdminDAO ad = new AdminDAO();

        System.out.print("User Name: ");
        String user = sc.next();

        System.out.print("Password: ");
        String pass = sc.next();

        MiniDAo mini = new MiniDAo(ad, user, pass);

        if (!mini.isLoggedIn()) {
            System.out.println("Program terminated");
            return;
        }

        System.out.println("""
        1 Add
        2 Show
        3 Update
        4 Remove
        5 Clear
        6 Search
        7 Grand Total
        8 Admin Stock
        9 Exit
        """);

        boolean run = true;
        while (run) {
            int n = sc.nextInt();

            switch (n) {
                case 1 -> {
                    System.out.print("Product & Quantity ");
                    mini.addProduct(sc.next(), sc.nextFloat());
                }
                case 2 -> mini.showCart();
                case 3 -> {
                    System.out.print("Product & Quantity ");
                    mini.update(sc.next(), sc.nextFloat());
                }
                case 4 -> mini.remove(sc.next());
                case 5 -> mini.delete();
                case 6 -> mini.search(sc.next());
                case 7 -> System.out.println("Total = " + mini.grandTotal());
                case 8 -> ad.RemainQ();
                case 9 -> {System.out.println("Exit "); run = false;}
                default -> System.out.println("Invalid");
            }
        }
        sc.close();
    }
}
