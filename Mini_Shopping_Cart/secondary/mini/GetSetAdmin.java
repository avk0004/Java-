package mini;

public class GetSetAdmin {
    private String pName;
    private float MRPrice;
    private float availableQ;

    public GetSetAdmin(String pName, float price, float qty) {
        this.pName = pName;
        this.MRPrice = price;
        this.availableQ = qty;
    }

    public String getPName() {
        return pName;
    }

    public float getMRPrice() {
        return MRPrice;
    }

    public float getAvailableQ() {
        return availableQ;
    }

    public void setAvailableQ(float availableQ) {
        this.availableQ = availableQ;
    }
}
