import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int maxWeight;
    private ArrayList<Item> operations;
    public BoxWithMaxWeight(int capacity) {
        this.operations = new ArrayList<>();
        this.maxWeight = capacity;
        
    }
    @Override
    public void add(Item item) {
        if(item.getWeight() + getTotalWeight() <= this.maxWeight) {
                this.operations.add(item);
        }
        
    }
    @Override
    public boolean isInBox(Item item) {
        for (Item x : operations) {
            if(x.equals(item)){
                return true;
            }
        }
        return false;
    }

    public int getTotalWeight(){
        int sum = 0;

        for (Item item : operations) {
            sum += item.getWeight();
        }
        return sum;
    }
}
