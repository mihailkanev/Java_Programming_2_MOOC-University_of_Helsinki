
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {

        HashMap<String, String> nicknames = new HashMap<>();

        nicknames.put("mat", "mattews");
        nicknames.put("mix", "michael's");
        nicknames.put("artie", "arthur");

        System.out.println(nicknames.get("mat"));
    }
}
