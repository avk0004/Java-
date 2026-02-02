package mini;
import java.util.*;

class Access{
	String User = "User";
	String Password = "12345678";
	public Access(String user, String password) {
		this.User = user;
		this.Password = password;
	}
	public boolean Login(String user, String password) {
		if(User.equals(user) && Password.equals(password)) {
			return true;
		}
		return false;
	}
	
}

public class MiniDAo  extends Access{

    private List<GetSet> cart = new ArrayList<>();
    private List<GetSetAdmin> admins;
    private int count = 1;
    String user;
    String pass;
    Access a = new Access(User, Password);
    public MiniDAo(AdminDAO adminDAO, String user, String pass) {
    	super(user, pass);
        this.admins = adminDAO.getAdminList();
    }

    // ADD PRODUCT
    public boolean addProduct(String name, float qty, String u, String p) {
    	 if (Login(u, p)) {
    		 for (GetSetAdmin a : admins) {
    	            if (a.getPName().equalsIgnoreCase(name)) {

    	                if (a.getAvailableQ() < qty) {
    	                    System.out.println("Not enough stock");
    	                    return false;
    	                }

    	                float total = a.getMRPrice() * qty;
    	                cart.add(new GetSet(count++, name, a.getMRPrice(), qty, total));
    	                a.setAvailableQ(a.getAvailableQ() - qty);
    	                return true;
    	            }
    	        }
         }        
    	

        System.out.println("Product not found or Login Failed");
        return false;
    }

    // UPDATE QUANTITY
    public boolean update(String productName, float newQty, String u, String p) {
   	 if (Login(u, p)) {
   		for (GetSet item : cart) {
            if (item.getProducts_Name().equalsIgnoreCase(productName)) {

                for (GetSetAdmin a : admins) {
                    if (a.getPName().equals(item.getProducts_Name())) {

                        float diff = newQty - item.getQuantity();

                        if (diff > 0 && a.getAvailableQ() < diff) {
                            System.out.println("Not enough stock");
                            return false;
                        }

                        a.setAvailableQ(a.getAvailableQ() - diff);
                        item.setQuantity(newQty);
                        item.setTotal(item.getPrice() * newQty);
                        return true;
                    }
                }
            }
        }
     }   
     System.out.println("Product not found or Login Failed");
 

        return false;
    }

    // REMOVE ITEM
    public boolean remove(String  id, String u, String p) {
   	 if (Login(u, p)) {
   		Iterator<GetSet> it = cart.iterator();

        while (it.hasNext()) {
            GetSet item = it.next();

            if (item.getProducts_Name() == id) {

                for (GetSetAdmin a : admins) {
                    if (a.getPName().equalsIgnoreCase(item.getProducts_Name())) {
                        a.setAvailableQ(a.getAvailableQ() + item.getQuantity());
                        break;
                    }
                }
                System.out.println("Item  found and removed");

                it.remove();
                return true;
            }
        }
     }   
  

        System.out.println("Item not found or access denied ");
        return false;
    }
    public void  Search(String ProductName, String u, String p) {
    	for(GetSetAdmin g:admins) {
    		if(g.getPName().equalsIgnoreCase(ProductName)) {
    			System.out.println(g.getAvailableQ()+g.getMRPrice()+g.getPName());
    		}
    			
    	}
    }
    public void showCart() {
        for (GetSet g : cart) {
            System.out.println(g.getProducts_Name()+"p"+g.getPrice()+"q"+g.getQuantity());
        }
    }

    public float grandTotal() {
        float total = 0;
        for (GetSet g : cart) {
            total += g.getTotal();
        }
        return total;
    }
    public void Delete() {
    	cart.clear();
    	for (GetSet g : cart) {
            System.out.println(g.getProducts_Name()+"p"+g.getPrice()+"q"+g.getQuantity());
        }
    }
}
