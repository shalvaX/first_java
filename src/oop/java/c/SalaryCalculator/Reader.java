package oop.java.c.SalaryCalculator;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public abstract class Reader {
    private String file_name;
//    private String file_path = System.getProperty("user.dir")+file_name;

    public Reader(){}

    public Reader(String file_name) {
        this.file_name = file_name;
    }
    public void setName(String file_name) {
        this.file_name = file_name;
    }
    public String getName() {
        return file_name;
    }
    public abstract String getPath();


}
