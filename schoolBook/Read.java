package schoolBook;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

public class Read {
    public static void run(String file_name, string id) {
        ArrayList<String> arr = new ArrayList<String>();
        try (FileReader reader = new FileReader(file_name)) {
            try (Scanner scan = new Scanner(reader)) {
                int i = 1;
                while (scan.hasNextLine()) {
                    var s = scan.nextLine();
                    arr.add(s);
                    i++;
                }

            }
            reader.close();

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).contains(id)) {
                System.out.println(arr.get(id));
            }

        }

    }

}
