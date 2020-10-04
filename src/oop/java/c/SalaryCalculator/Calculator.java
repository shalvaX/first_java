package oop.java.c.SalaryCalculator;
import java.util.HashMap;
import java.util.Map;

public abstract class Calculator extends Reader {
    private Map<String,String> coll_info;
    private Map<Integer, Integer> calced_info;

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
    public Map <Integer, Integer> getCalced_info(){
        return calced_info;
    }

}

