
public class Main {

    public static void main(String[] args) {
        // Test your program here

        IOU newIou = new IOU();
        newIou.setSum("asd", 51.5);
        newIou.setSum("Michael", 30);

        System.out.println(newIou.howMuchDoIOweTo("Arthur"));
        System.out.println(newIou.howMuchDoIOweTo("Michael"));
    }
}
