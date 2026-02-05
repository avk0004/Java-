package mini;
import java.util.*;

public class AdminDAO {

    private List<GetSetAdmin> adminList = new ArrayList<>();

    public AdminDAO() {
        adminList.add(new GetSetAdmin("Apple", 100, 50));
        adminList.add(new GetSetAdmin("Banana", 40, 100));
        adminList.add(new GetSetAdmin("Milk", 60, 30));
    }

    public List<GetSetAdmin> getAdminList() {
        return adminList;
    }

    public void RemainQ() {
        System.out.println("---- STOCK ----");
        for (GetSetAdmin a : adminList) {
            System.out.println(
                a.getPName() +
                " Price:" + a.getMRPrice() +
                " Qty:" + a.getAvailableQ()
            );
        }
    }
}
