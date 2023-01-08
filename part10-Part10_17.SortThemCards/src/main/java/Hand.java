import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand>{
    private List<Card> list;
    public Hand(){
        this.list = new ArrayList<>();
    }

    public List<Card> getCards(){
        return list;
    }

    public void add(Card card){
        list.add(card);
    }

    public void print(){
        list.forEach(x->System.out.println(x));
    }

    public void sort(){
       Collections.sort(list);
    }

    @Override
    public int compareTo(Hand hand) {
        int sumCards = list.stream().mapToInt(x->x.getValue()).sum();

        int otherCards = hand.getCards().stream().mapToInt(x->x.getValue()).sum();

        return sumCards - otherCards;
    }

    public void sortBySuit() {
        Collections.sort(list, new BySuitInValueOrder());
    }

}
