package oop.java.c.SalaryCalculator;
import java.util.HashMap;
import java.util.Map;

public class Calculator extends Reader {
    private Map<String, String> coll_info;
    private Map<String, String> calced_info;

    public Calculator() {
    }

    public Calculator(String file_name, Map <String,String> coll_info) {
        super(file_name);
        this.coll_info = coll_info;
    }

    public void setColl_info(){
        this.coll_info=coll_info;
    }
    public Map <String, String> getColl_info(){
        return coll_info;
    }
    public void setCalced_info(){
        this.calced_info=calced_info;
    }
    public Map <String, String> getCalced_info(){
        return calced_info;
    }

}

