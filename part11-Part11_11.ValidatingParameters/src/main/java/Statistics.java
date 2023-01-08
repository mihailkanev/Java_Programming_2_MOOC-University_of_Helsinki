import java.util.List;
public class Statistics {
    private List<Integer> numbers;
    public void add(int number) {
        try {
            this.numbers.add(number);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
      
    }
    public double average() {
        return this.numbers.stream().mapToInt(i -> i).average().getAsDouble();
    }
}
