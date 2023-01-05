package src;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Start {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println(
                "если вы ходитете добавить нового человека - введите 1 \n если вы ходитете узнать статус человека - введите 2 \n если хотите выйте - введите 3");
        int menu = Integer.parseInt(System.console().readLine());
        if (menu == 1) {
            Prog.Add();
            Prog.Write(Prog.GetSheet(), Prog.lastCell(Prog.GetSheet()));
            // Prog.GetWorkBook());
        }
        if (menu == 2) {
            // Prog.show();
        }
        if (menu == 3) {
            System.exit(1);
        }

    }
}