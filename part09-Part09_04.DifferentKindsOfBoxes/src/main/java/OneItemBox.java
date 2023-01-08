import java.util.ArrayList;

public class OneItemBox extends Box {
    private int item;
    private ArrayList<Item> onItems;

    public OneItemBox(){
        item = 1;
        this.onItems = new ArrayList<>();
    }
    @Override
    public void add(Item item) {
        if(this.onItems.isEmpty()){
            this.onItems.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item x : onItems) {
            if(x.equals(item)){
                return true;
            }
        }
        return false;
    }

    
}
