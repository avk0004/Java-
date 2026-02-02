package mini;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AdminDAO ad = new AdminDAO();

		// 2️⃣ Pass AdminDAO object to MiniDAo
		System.out.print("User Name");		String n1 = sc.next();
		System.out.print("Passwords");  String p = sc.next();
		MiniDAo mini = new MiniDAo(ad,n1,p);
		

		List<GetSetAdmin> result1 = ad.Available(250F, 10.15F, "Pro");
		result1 = ad.Available(20F, 100.15F, "Pro1");

		System.out.println("9 test case");
		System.out.println("1 test case add");
		System.out.println("2 test case show");
		System.out.println("3 test case update");
		System.out.println("4 test case remove");
		System.out.println("5 test case clear");
		System.out.println("6 test case search");
		System.out.println("7 test case granttotal");
		System.out.println("8 to for admin");
		System.out.println("9 to for delete and 10 for exit");		
		System.out.println("enter any one test case");

		boolean f = true;
		while(f) {
			int n = sc.nextInt();
			switch (n) {
			case 1:
				
				System.out.println("add is choosen");
				System.out.println("Name");
				String Name = sc.next();
				System.out.println("quantity");
				float q = sc.nextFloat();
				mini.addProduct(Name,q,n1, p);
				break;
			case 2:
				System.out.println("show");
				mini.showCart();
				break;
			case 3:
				System.out.println("update");
				System.out.println("Product Name");
				String Names =sc.next();
				System.out.println("quantity changes");
				float nquantity = sc.nextFloat();
				mini.update(Names, nquantity,n1,p);
				break;
			case 4:
				System.out.println("remove + product name");
				String m = sc.next();
				mini.remove(m,n1,p);
				break;
			case 5:
				System.out.println("Delete is choosen");
				mini.Delete();
				break;
			case 6:
				System.out.println("Search is choosen");
				System.out.println("product name to search");
				String  m1 = sc.next();
				mini.Search(m1,n1,p);
				break;
			case 7:
				System.out.println(mini.grandTotal());
				break;
			case 8:
				System.out.println("net");
				ad.RemainQ();
				break;
			case 9:
				mini.Delete();
				break;
			case 10:
				
				f= false;
				break;
			default:
				break;
			}
		}
		sc.close();
	}
}
