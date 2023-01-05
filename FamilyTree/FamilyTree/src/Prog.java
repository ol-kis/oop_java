package src;

import java.io.*;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

public class Prog {
    public static final String adress = "C://Users//user//Desktop//GeekBrains//PYTHON//java//oop//oop_java//FamilyTree//FamilyTree//src//tree.xls";

    public static void Add() {
        Person p1 = new Person();
        p1.setFullName(Input("Введите полное имя: "));
        p1.setAge(Input("Введите возраст: "));
        p1.setPartner(Input("Введите имя партнера: "));
        p1.setChildren(Input("Введите имя ребенка: "));

    }

    public static int lastCell(Sheet a) {
        int count = 0;
        for (int i = 0; i < 5000l; i++) {
            if (a.getRow(i) != null) {
                // Row row = a.getRow(i);
                // Cell c = row.getCell(0);
            } else {
                count = i;
                break;
            }

        }
        return count;

    }

    public static void Read(Sheet a) throws IOException {
        Sheet sheet = a;
        String result = sheet.getRow(0).getCell(0).getStringCellValue();
        System.out.println(result);
    }

    public static void Write(Sheet a, int row) throws IOException {
        Sheet sheet = a;
        var cell2 = sheet.getRow(row - 1).getCell(0);
        cell2.setCellValue(row);
        var cell1 = sheet.getRow(row - 1).getCell(1);
        cell1.setCellValue(Person.getFullName());
        SaveWorkBook(GetWorkBook());
    }

    public static String Input(String text) {
        System.out.print(text + "\n");
        String name = System.console().readLine();
        return name;

    }

    public static Sheet GetSheet() throws IOException {
        Workbook wb = new HSSFWorkbook(new FileInputStream(adress));
        Sheet sheet = wb.getSheetAt(0);
        return sheet;
    }

    public static void SaveWorkBook(Workbook wb) throws IOException {
        OutputStream os = new FileOutputStream(adress);
        wb.write(os);
    }

    public static Workbook GetWorkBook() throws IOException {
        Workbook wb = new HSSFWorkbook(new FileInputStream(adress));
        return wb;
    }

}
