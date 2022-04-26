package activities;

import net.bytebuddy.asm.Advice;

import java.io.IOException;
import java.io.Reader;

public class Activity14_2 {
    public static void main(String args[]) throws IOException {
        String filePath = "src/test/resources/sample.xlsx";
        ReadWriteExcel objExcelFile = new ReadWriteExcel();
        objExcelFile.writeExcel(filePath);
        objExcelFile.readExcel(filePath);
    }
}

