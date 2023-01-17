import java.io.OutputStream;

import org.apache.poi.ss.usermodel.*;
import java.io.*;
import org.apache.poi.hssf.usermodel.*;

public class WorkBook {
    public static Workbook WB;
    public static OutputStream OS;
    public static Sheet Sheet;
    public static String ADRESS = "C://Users//user//Desktop//GeekBrains//PYTHON//java//oop//oop_java//FamilyTree//FamilyTree//src//tree.xls";

    public void SetWorkbook(Workbook WB) {
        this.WB = WB;
    }

    public static Workbook GetWorkbook() {
        return WB;
    }

    public void SetOutputStream(OutputStream OS) {
        this.OS = OS;
    }

    public static OutputStream GetOutputStream() {
        return OS;

    }

    public void SetSheet(Sheet Sheet) {
        this.Sheet = Sheet;
    }

    public static Sheet GetSheet() {
        return Sheet;
    }

    public void write(OutputStream os2) {
    }

    public static void File() throws IOException {
        Workbook wb = new HSSFWorkbook(new FileInputStream(ADRESS));
        Sheet sheet = wb.getSheetAt(0);
        OutputStream os = new FileOutputStream(ADRESS);
        WorkBook w1 = new WorkBook();
        w1.SetWorkbook(wb);
        w1.SetSheet(sheet);
        w1.SetOutputStream(os);

    }

    public static int lastCell(Sheet a) {
        int count = 0;
        for (int i = 0; i < 5000l; i++) {
            if (a.getRow(i) != null) {
            } else {
                count = i;
                break;
            }

        }
        return count;

    }

}