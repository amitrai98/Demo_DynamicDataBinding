package android.com.demo_dynamicdatabinding;

/**
 * Created by amitrai on 9/5/16.
 */
public class Shop {

    private final String ShopName;
    private final String ShopAddress;
    private boolean isOpen = false;
    private boolean isClose = false;
    public Shop(String ShopName, String ShopAddress) {
        this.ShopName = ShopName;
        this.ShopAddress = ShopAddress;
    }
    public String getShopName() {
        return this.ShopName;
    }
    public String getShopAddress() {
        return this.ShopAddress;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public boolean isClose() {
        return isClose;
    }

}
