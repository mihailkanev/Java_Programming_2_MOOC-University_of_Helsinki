
public class Main {

    public static void main(String[] args) {
        // Test your program here!
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("a.s.d", "test");
        String text = "e.g. i.e. etc. lol a.s.d";

        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }
}
