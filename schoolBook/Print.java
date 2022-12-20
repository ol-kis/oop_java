package schoolBook;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Print {
    public static void run(String file_Name) {
        try (FileReader reader = new FileReader(file_Name)) {
            try (Scanner scan = new Scanner(reader)) {
                int i = 1;
                while (scan.hasNextLine()) {
                    var s = scan.nextLine();
                    System.out.println(s);
                    i++;
                }

            }
            reader.close();

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

}
