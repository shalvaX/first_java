package oop.java.c.executioner;
import oop.java.c.SalaryCalculator.Calculator;
import oop.java.c.SalaryCalculator.Reader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Generator {
    public static void main (String[] arg) throws IOException {
        String name;
        Scanner find = new Scanner(System.in);
        System.out.println("choose file name: (if u want to create template print:Generate, ALSO choosed file must be .xlsx format)");
        name = find.nextLine();
        Reader r  = new Reader(name);
        r.readFile();
        Calculator calc = new Calculator(r.getEmp_salary());
        calc.calcSalary();
    }
}

