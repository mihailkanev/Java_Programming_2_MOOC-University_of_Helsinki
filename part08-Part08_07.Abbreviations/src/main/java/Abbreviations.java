import java.util.ArrayList;
import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> dir;

    public Abbreviations() {
        this.dir = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        if (this.dir.containsKey(explanation)) {
            System.out.println("Abbreviation is already in the library!");
        } else {
            dir.put(abbreviation, explanation);
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        return dir.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        if (dir.containsKey(abbreviation)) {
            return dir.get(abbreviation);
        }
        return null;
    }

    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
}
