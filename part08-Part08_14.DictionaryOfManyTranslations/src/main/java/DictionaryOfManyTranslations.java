import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> hashmap;

    public DictionaryOfManyTranslations() {
        this.hashmap = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.hashmap.putIfAbsent(word, new ArrayList<>());
        this.hashmap.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        return this.hashmap.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        this.hashmap.remove(word);
    }
}