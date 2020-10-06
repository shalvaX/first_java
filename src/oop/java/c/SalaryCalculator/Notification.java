package oop.java.c.SalaryCalculator;

import java.util.ArrayList;

public abstract class Notification extends Calculator{
    private ArrayList <String> Notes = new ArrayList<String>();
    public Notification(){}

    public Notification(ArrayList<String> Notes){
        this.Notes = Notes;
    }
    public abstract String sendNotification();
    //იდეაში აბსტრაქტული კლასის მეთოდი sendNotification უნდა იყოს გამოძახებული სხვა
    // ფუნქციებში რათა მეილზე დააგზავნოს ნოტიფიკაცეიბი, რომელთა შინაარსი განისაზღვრებოდა გამოძახებისას.
}
