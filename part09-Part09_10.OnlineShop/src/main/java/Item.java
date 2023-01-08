import java.util.Set;

public class Item {
    private String product;
    private int qnty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.qnty = qty;
        this.unitPrice = unitPrice;
    }

    public int price(){
        return this.unitPrice * this.qnty;
    }

    public void increaseQuantity(){
        this.qnty++;
    }

    public String toString(){
        return this.product + ": " + this.qnty;
    }
}
