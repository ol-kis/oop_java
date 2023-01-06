package src;

public class Input {
    public static String main(String text) {
        System.out.print(text + "\n");
        String name = System.console().readLine();
        return name;

    }

}
