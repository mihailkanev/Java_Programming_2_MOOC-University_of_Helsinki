import java.util.ArrayList;

public class Box implements Packable {
    private double maxCapacity;
    private ArrayList<Packable> box;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.box = new ArrayList<>();
    }

    @Override
    public double weight() {
        double weight = 0;
        if (box.size() > 0) {
            for (Packable item : box) {
                weight+= item.weight();
            }
        }
        return weight;
    }

    public void add(Packable z) {
        if (!checkMax(z)) {
            box.add(z);
        }
    }

    public boolean checkMax(Packable item) {
        if (this.weight() + item.weight() <= this.maxCapacity) {
            return false;
        }
        return true;
    }

    public Packable pick(int index) {
        return box.get(index);
    }

    @Override
    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + this.weight() + " kg";
    }
}
