package try3;

public class Program {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        f1.value = 123;
        f1.printCount();

        Foo f2 = new Foo();
        f2.value = 15466;
        f2.printCount();

        Foo f3 = new Foo();
        f3.value = 15466;
        // System.out.println(f3.value);
        f3.printCount();

    }

}
