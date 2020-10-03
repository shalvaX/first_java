package oop.java.c.SalaryCalculator;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import java.util.Scanner;

public class Reader {
    private String file_name;
    private String file_path = System.getProperty("user.dir")+file_name;

    public Reader(){}

    public Reader(String file_name, String file_path) {
        this.file_name = file_name;
        this.file_path = file_path;
    }
    public void setName(String file_name) {
        this.file_name = file_name;
    }
    public String getName() {
        return file_name;
    }
    public String getPath() {
        return file_path;
    }

}
