public class Book {
    private String bookName;
    private Integer age;

    public Book(String bookName, int age) {
        this.bookName = bookName;
        this.age = age;
    }

    public String getName(){
        return bookName;
    }
    
    public int getAge(){
        return age;
    }

    public String toString(){
        return this.bookName + " (recommended for " + this.age + " year-olds or older)";
    }
}
