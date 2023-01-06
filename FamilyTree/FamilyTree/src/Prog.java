package src;

import java.io.*;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

public class Prog {
    public static String ADRESS = "C://Users//user//Desktop//GeekBrains//PYTHON//java//oop//oop_java//FamilyTree//FamilyTree//src//tree.xls";
    public static Object p2;

    public static void Add() {
        Person p1 = new Person();
        p1.setFullName(Input("Введите полное имя: "));
        p1.setAge(Input("Введите возраст: "));
        p1.setPartner(Input("Введите имя партнера: "));
        p1.setChildren(Input("Введите имя ребенка: "));

    }

    public static void NameSearch() {
        Person p2 = new Person();
        p2.setFullName(Input("Введите полное имя: "));

        // p1.setAge(Input("Введите возраст: "));
        // p1.setPartner(Input("Введите имя партнера: "));
        // p1.setChildren(Input("Введите имя ребенка: "));

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
        // System.out.print(count);
        return count;

    }

    // public static void Read(Sheet a) throws IOException {
    // Sheet sheet = a;
    // String result = sheet.getRow(0).getCell(0).getStringCellValue();
    // System.out.println(result);
    // }

    public static void Write(Sheet a, int row, OutputStream os, Workbook wb) throws IOException {
        Row r1 = a.createRow(row);
        Cell c1 = r1.createCell(0);
        Cell c2 = r1.createCell(1);
        Cell c3 = r1.createCell(2);
        Cell c4 = r1.createCell(3);
        Cell c5 = r1.createCell(4);
        Cell c6 = r1.createCell(5);
        Cell c7 = r1.createCell(6);

        c1.setCellValue(row);
        c2.setCellValue(Person.getFullName());
        c3.setCellValue(Person.getAge());
        c4.setCellValue(Person.getGender());
        c7.setCellValue(Person.getChildren());
        wb.write(os);
        os.close();

    }

    public static String Input(String text) {
        System.out.print(text + "\n");
        String name = System.console().readLine();
        return name;

    }

    public static void Read(Sheet a, int row, OutputStream os, Workbook workbook) throws IOException {
        String name_f = Person.getFullName();
        int id;
        for (int i = 0; i < row; i++) {
            String help = a.getRow(i).getCell(1).getStringCellValue();
            if (help.equals(name_f)) {
                System.out.println("found");
                id = i;
            }

        }

        workbook.write(os);
        os.close();
    }

}
