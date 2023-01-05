package src;

import java.io.*;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

public class Helping {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Workbook wb = new HSSFWorkbook(new FileInputStream(
                "C://Users//user//Desktop//GeekBrains//PYTHON//java//oop//oop_java//FamilyTree//FamilyTree//src//tree.xls"));
        OutputStream os = new FileOutputStream(
                "C://Users//user//Desktop//GeekBrains//PYTHON//java//oop//oop_java//FamilyTree//FamilyTree//src//tree.xls");
        Sheet sheet = wb.getSheetAt(0);
        var cell2 = sheet.getRow(0).getCell(0);
        cell2.setCellValue("hist");
        wb.write(os);

    }
}
