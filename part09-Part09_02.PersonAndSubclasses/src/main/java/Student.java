public class Student extends Person {
    private int studentCredit;

    public Student(String name, String address) {
        super(name, address);
        this.studentCredit = 0;
    }

    public void study() {
        this.studentCredit++;
    }

    public int credits() {
        return this.studentCredit;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + this.studentCredit;
    }
}
