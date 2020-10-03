package oop.java.c.SalaryCalculator;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class Calculator extends Reader {
    private int salary;
    private int deductions;
    private int benefits;
    private String emp_id;

    public Calculator(){}

    public Calculator(String file_name,int salary, int deductions, int benefits, String emp_id){
        super(file_name);
        this.salary = salary;
        this.deductions = deductions;
        this.benefits = benefits;
        this.emp_id = emp_id;
    }

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

    @Override
    public String getPath(){
        String name = getName();
        String file_path = System.getProperty("user.dir")+name;
        return file_path;
    }
}

