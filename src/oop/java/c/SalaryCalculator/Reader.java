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

public abstract class Reader {
    private String file_name;
    private int salary;
    private int deductions;
    private int benefits;
    private String emp_id;

    public Reader(){}

    public Reader(String file_name, int salary, int deductions, int benefits, String emp_id) {
        this.file_name = file_name;
        this.salary = salary;
        this.deductions = deductions;
        this.benefits = benefits;
        this.emp_id = emp_id;
    }

    public void setName(String file_name) {
        this.file_name = file_name;
    }
    public String getName() {
        return file_name;
    }

    public abstract int calcSalary();

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setDeductions(int deductions) {
        this.deductions = deductions;
    }
    public void setBenefits(int benefits) {
        this.benefits = benefits;
    }
    public void setEmp_name(String emp_id) {
        this.emp_id = emp_id;
    }

    public int getSalary() {
        return salary;
    }
    public int getDeductions() {
        return deductions;
    }
    public int getBenefits() {
        return benefits;
    }
    public String getEmp_name() {
        return emp_id;
    }

    public String readFile() {
        Scanner find = new Scanner(System.in);
        this.file_name = find.nextLine();
        System.out.println("choose file name:");
        String file_path = System.getProperty("user.dir")+file_name;
        try {
            File file = new File(file_path);
            FileInputStream fis = new FileInputStream(file);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return file_path;
    }
}
