import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;

public class Help {
    public static void Out(String[] args) throws IOException {
        Integer id = 5;
        WorkBook.File(2);
        Sheet a = WorkBook.GetSheet();
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
