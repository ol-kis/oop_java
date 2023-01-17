public class Student implements ForStudent {

    public static void run() {
        System.out.println("What do you want? \nView ratings-enter 1\nView attendance -enter 2\nExit- enter 3\n");
        try {
            int menu = Integer.parseInt(System.console().readLine());
            while (menu != 1 & menu != 2 & menu != 3) {
                System.out.println("You enter wrong number!Try again\n");
                System.out
                        .println("What do you want? \nView ratings-enter 1\nView attendance -enter 2\nExit- enter 3\n");
                menu = Integer.parseInt(System.console().readLine());
            }
            // Print.run("student.txt");
            System.out.println("Enter id student: \n");
            var id_student = System.console().readLine();
            // Read.run("student.txt", id_student);
        }

        catch (Exception e) {
            System.out.println("\nYou enter not number. Try again!\n");
        }

    }

    @Override
    public void PrintReating() {
        // TODO Auto-generated method stub

    }

    @Override
    public void PrintAttendance() {
        // TODO Auto-generated method stub

    }

}