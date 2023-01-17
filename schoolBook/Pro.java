
import java.io.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

public class Pro {
    public static String ADRESS = "C://Users//user//Desktop//GeekBrains//PYTHON//java//oop//oop_java//FamilyTree//FamilyTree//src//tree.xls";

    public static void Search(Sheet a, int row, OutputStream os, Workbook workbook) throws IOException {
        String name_f = Person.getFullName();
        int id_row = 0;
        boolean result = false;
        for (int i = 0; i < row; i++) {
            String help = a.getRow(i).getCell(1).getStringCellValue();
            if (help.equals(name_f)) {
                result = true;
                id_row = i;
            }
        }
        if (result == true) {
            System.out.println("Мы нашли совпадение");
            Pro.Out(a, id_row);

        } else {
            System.out.println("Мы не нашли совпадение");
        }

        workbook.write(os);
        os.close();
    }

    public static void Out(Sheet a, int id) {
        for (int i = 1; i < 7; i++) {
            if (a.getRow(id).getCell(i) == null) {
                System.out.println(a.getRow(0).getCell(i).getStringCellValue() + ": Информация отсутствует");
            } else {
                System.out.println(a.getRow(0).getCell(i).getStringCellValue() + ": "
                        + a.getRow(id).getCell(i).getStringCellValue());
            }
        }

    }

}