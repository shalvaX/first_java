package oop.java.c.executioner;
import oop.java.c.SalaryCalculator.Reader;
import java.util.Scanner;

public class Generator {
    public static void main (String[] arg){
        String name;
        Scanner find = new Scanner(System.in);
        System.out.println("choose file name:");
        name = find.nextLine();

        Reader r  = new Reader(name);
        r.readFile();
    }
}
