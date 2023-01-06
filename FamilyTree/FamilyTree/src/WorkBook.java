package src;

import java.io.*;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

public class WorkBook {
    public static Workbook WB;
    public static OutputStream OS;
    public static Sheet Sheet;

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

}