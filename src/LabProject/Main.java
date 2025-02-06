package LabProject;
public class Main {
    public static void main(String[] args) {
        Student labSt1 = new Student("James", "Gostling", "0987654");
        labSt1.setGrade(18);
        Student labSt2 = new Student("Dennis",  "Richie", "1234567");
        labSt2.setGrade(17.5);
        Lab lab = new Lab("Mr.Smith", "Monday", 30);
        lab.enrollStudent(labSt1);
        lab.enrollStudent(labSt2);
        lab.printLabInfo();

    }
}
