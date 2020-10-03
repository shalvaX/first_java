package oop.java.c.SalaryCalculator;


public class Calculator extends Reader {

    public Calculator(){}

    public Calculator(String file_name,int salary, int deductions, int benefits, String emp_id){
        super(file_name,salary,deductions,benefits,emp_id);
    }

    @Override
    public int calcSalary() {
        return 0;
    }
}

