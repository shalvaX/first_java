package oop.java.c.SalaryCalculator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Calculator extends Reader {
    private Map<String,String> coll_info = new HashMap<String,String>();;
    private Map<String, Double> calced_info = new HashMap<String, Double>();;

    public Calculator() {
    }

    public Calculator(Map <String,String> coll_info) {
        super();
        this.coll_info = coll_info;
    }

    public void setColl_info(){
        this.coll_info=coll_info;
    }
    public Map <String,String> getColl_info(){
        return coll_info;
    }
    public void setCalced_info(){
        this.calced_info=calced_info;
    }
    public Map <String, Double> getCalced_info(){
        return calced_info;
    }

    public Map<String, Double> calcSalary(){
        for (Map.Entry<String, String> set : coll_info.entrySet()) {
            String emp_id = set.getKey();
            int age = Integer.parseInt(set.getValue().split(";", 4)[0]);
            int salary = Integer.parseInt(set.getValue().split(";", 4)[1]);
            int deductions = Integer.parseInt(set.getValue().split(";", 4)[2]);
            int benefits = Integer.parseInt(set.getValue().split(";", 4)[3]);
            if (age > 18){
                double full_salary = ((salary-deductions)/0.98/0.8+benefits/0.98/0.8);
                calced_info.put(emp_id,full_salary);
            }
            else {
                double full_salary = ((salary-deductions)/0.98+benefits/0.98);
                calced_info.put(emp_id,full_salary);
            }
            System.out.println(calced_info);
        }
        return calced_info;
    }

}

