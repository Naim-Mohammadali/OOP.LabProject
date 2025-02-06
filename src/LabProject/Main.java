package LabProject;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("Moh", "Almasri", "1234567");
        Lab lab = std1.getLab();
        Student std2 = new Student("Moh Ali", "Naim", "sadfghj34", lab);
        std1.setGrade(18);
        std2.setGrade(19);
        lab.printLabInfo();
    }
}
