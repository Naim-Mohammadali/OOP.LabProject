package LabProject;
class Student {
    private final String firstname;
    private final String lastname;
    private final String id;
    private double grade;

    public Student(String firstname, String lastname, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id.substring(0,7);
        this.grade = 0;
    }
    public void printStudentInfo() {
        System.out.println(firstname + " " + lastname +" - ID: "+ id + " - grade: "+grade);
    }

    public void setGrade(double grade) {
        this.grade = grade % 20 ;
    }

    public double getGrade() {
        return grade;
    }
}