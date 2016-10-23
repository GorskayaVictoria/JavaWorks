package Strings;

/**
 * Created by sergey on 23.10.16.
 */
public class Cart {
    String buyer;
    String goodName;
    String count;
    String weight;

    @Override
    public String toString() {
        return "Cart{" +
                "buyer='" + buyer + '\'' +
                ", goodName='" + goodName + '\'' +
                ", count='" + count + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public Cart(String goodName, String buyer, String count, String weight) {
        this.goodName = goodName;
        this.buyer = buyer;
        this.count = count;
        this.weight = weight;
    }
}
