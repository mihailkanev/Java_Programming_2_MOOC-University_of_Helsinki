import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> productsList;
    private Map<String, Integer> stockList;

    public Warehouse(){
        this.productsList = new HashMap<>();
        this.stockList = new HashMap<>();
        
    }

    public void addProduct(String product, int price, int stock){
        productsList.put(product, price);
        stockList.put(product, stock);
    }

    public int price(String product){
        return this.productsList.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.stockList.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (stockList.containsKey(product)) {
            if (stock(product) > 0) {
                stockList.put(product, stock(product) - 1);
                return true;
            }
        }
        return false;
    }

    public Set<String> products(){
        Set<String> productNames = stockList.keySet();
        return productNames; 
    }
}
