import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private ArrayList<Movable> herd;

    public Herd(){
        this.herd = new ArrayList<>();
    }

    public String toString(){
        String line = "";
        for (Movable movable : herd) {
            line += movable.toString() + "\n";
        }
        return line;
    }

    public void addToHerd(Movable movable){
        herd.add(movable);
    }
    @Override
    public void move(int dx, int dy) {
        for (Movable movable : herd) {
            movable.move(dx, dy);
        }
        
    }
    
}
