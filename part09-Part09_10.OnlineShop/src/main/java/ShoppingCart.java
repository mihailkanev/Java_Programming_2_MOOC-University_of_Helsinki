import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageTranscoder;
import javax.swing.SortOrder;

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.cart.containsKey(product)) {
            Item item = cart.get(product);
            item.increaseQuantity();
            cart.put(product, item);
        } else {
            this.cart.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int sum = 0;
        for (Item x : cart.values()) {
            sum += x.price();
        }
        return sum;
    }

    public void print() {
        for (Item item : cart.values()) {
            System.out.println(item);
        }
    }
}
