public class Test {
    private int number;
    private String str;

    public Test(int number, String str) {
        this.number = number;
        this.str = str;
    }

    public int addTo(int other) {
        return this.number + other;
    }

    @Override
    public String toString() {
        return str;
    }
}
