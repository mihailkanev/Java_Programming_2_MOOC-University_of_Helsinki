import java.util.ArrayList;

public class MisplacingBox extends Box{

    private ArrayList<Item> boxes;
    public MisplacingBox(){
        this.boxes = new ArrayList<>();
    }
    @Override
    public void add(Item item) {
       boxes.add(item);
        
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
    
}
