package schoolBook;

public class Welcome {
    public static void run() {
        System.out.println("Welcome to the school magazine");
        while (true) {
            try {
                System.out.println(
                        "\nSelect a user\nDirector enter 1\nTeacher - enter 2\nStudent - enter 3\nExit - enter 4\n");
                int menu = Integer.parseInt(System.console().readLine());
                if (menu == 1) {
                    System.out.println("Director");
                } else if (menu == 2) {
                    System.out.println("Teacher");
                } else if (menu == 3) {
                    Student.run();
                } else if (menu == 4) {
                    System.out.println("Out");
                    break;
                }
            } catch (Exception e) {
                System.out.println("\nYou enter wrong number. Try again!\n");
            }

        }
    }

}
