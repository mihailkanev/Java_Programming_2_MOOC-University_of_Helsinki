public class Main {

    public static void main(String[] args) {
        // test your classes here
        Box box = new Box(10);
        box.add(new Book("Book", "Name book", 12));
        box.add(new Book("Book Two", "Name book Two", 2));


        box.add(new CD("Metallica", "Enter Sandman", 1987));
        box.add(new CD("SEPULTURA", "ARISE", 1987));

       
        System.out.println(box);
        System.out.println(box.pick(2));
    }
}
