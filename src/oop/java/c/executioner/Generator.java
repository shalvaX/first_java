package oop.java.c.executioner;
import oop.java.c.SalaryCalculator.Reader;

import java.io.IOException;
import java.util.Scanner;

public class Generator {
    public static void main (String[] arg) throws IOException {
        String name;
        Scanner find = new Scanner(System.in);
        System.out.println("choose file name:");
        name = find.nextLine();

        Reader r  = new Reader(name);
        r.readFile();
    }
}
