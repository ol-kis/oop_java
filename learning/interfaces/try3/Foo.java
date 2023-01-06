package try3;

public class Foo {
    public Integer value;
    public static Integer count;
    static {
        count = 0;
    }

    public Foo() {
        count += 1;
    }

    public void printCount() {
        System.out.println(count);

    }

    @Override
    public String toString() {
        return value.toString();
    }
}
