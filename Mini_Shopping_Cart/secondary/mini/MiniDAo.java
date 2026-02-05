package mini;
import java.util.*;
class Access {
    private final String USER = "User";
    private final String PASSWORD = "12345678";

    public boolean login(String user, String pass) {
        return USER.equals(user) && PASSWORD.equals(pass);
    }
}
public class MiniDAo {

    private List<GetSet> cart = new ArrayList<>();
    private List<GetSetAdmin> admins;
    private boolean loggedIn = false;
    private int count = 1;

    public MiniDAo(AdminDAO adminDAO, String user, String pass) {
        Access access = new Access();
        if (access.login(user, pass)) {
            loggedIn = true;
            admins = adminDAO.getAdminList();
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username or password");
        }
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    private boolean checkLogin() {
        if (!loggedIn) {
            System.out.println("Access denied");
            return false;
        }
        return true;
    }

    public void addProduct(String name, float qty) {
        if (!checkLogin()) return;

        for (GetSetAdmin a : admins) {
            if (a.getPName().equalsIgnoreCase(name)) {

                if (a.getAvailableQ() < qty) {
                    System.out.println("Not enough stock");
                    return;
                }

                float total = a.getMRPrice() * qty;
                cart.add(new GetSet(count++, name, a.getMRPrice(), qty, total));
                a.setAvailableQ(a.getAvailableQ() - qty);
                System.out.println("Product added");
                return;
            }
        }
        System.out.println("Product not found");
    }

    public void update(String name, float qty) {
        if (!checkLogin()) return;

        for (GetSet g : cart) {
            if (g.getProducts_Name().equalsIgnoreCase(name)) {

                for (GetSetAdmin a : admins) {
                    if (a.getPName().equalsIgnoreCase(name)) {

                        float diff = qty - g.getQuantity();
                        if (diff > 0 && a.getAvailableQ() < diff) {
                            System.out.println("Not enough stock");
                            return;
                        }

                        a.setAvailableQ(a.getAvailableQ() - diff);
                        g.setQuantity(qty);
                        g.setTotal(qty * g.getPrice());
                        System.out.println("Updated");
                        return;
                    }
                }
            }
        }
        System.out.println("Product not found");
    }

    public void remove(String name) {
        if (!checkLogin()) return;

        Iterator<GetSet> it = cart.iterator();
        while (it.hasNext()) {
            GetSet g = it.next();
            if (g.getProducts_Name().equalsIgnoreCase(name)) {

                for (GetSetAdmin a : admins) {
                    if (a.getPName().equalsIgnoreCase(name)) {
                        a.setAvailableQ(a.getAvailableQ() + g.getQuantity());
                        break;
                    }
                }
                it.remove();
                System.out.println("Removed");
                return;
            }
        }
        System.out.println("Item not found");
    }

    public void search(String name) {
        if (!checkLogin()) return;

        for (GetSetAdmin a : admins) {
            if (a.getPName().equalsIgnoreCase(name)) {
                System.out.println(
                    a.getPName() +
                    " Price:" + a.getMRPrice() +
                    " Qty:" + a.getAvailableQ()
                );
                return;
            }
        }
        System.out.println("Product not found");
    }

    public void showCart() {
        if (!checkLogin()) return;

        if (cart.isEmpty()) {
            System.out.println("Cart empty");
            return;
        }

        for (GetSet g : cart) {
            System.out.println(
                g.getProducts_Name() +
                " Price:" + g.getPrice() +
                " Qty:" + g.getQuantity()
            );
        }
    }

    public float grandTotal() {
        float total = 0;
        for (GetSet g : cart) {
            total += g.getTotal();
        }
        return total;
    }

    public void delete() {
        cart.clear();
        System.out.println("Cart cleared");
    }
}
