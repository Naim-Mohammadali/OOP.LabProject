package LabProject;
// This Package tends to systemize the data in a Classroom- e.g. Advanced Program Lab
// The package has two main classes: Student & Lab
// ****
//Student Class
class Student {
    private final String firstname;
    private final String lastname;
    private final String id;
    private double grade;
    private Lab lab;
// The Student Class takes the first and last name, and the id of the student
// to create a file for him/her through the constructor
    public Student(String firstname, String lastname, String id, Lab lab) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id.substring(0,7);
        this.grade = 0;
        (this.lab = lab).enrollStudent(this);
    }
// Creating a student before creating a lab
    public Student(String firstname, String lastname, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id.substring(0,7);
        this.grade = 0;
        (this.lab = new Lab("TEACHER", "DAY", 50)).enrollStudent(this);
    }
// This method prints the info of the student in an elegant way
    public void printStudentInfo() {
        System.out.println(firstname + " " + lastname +" - ID: "+ id + " - grade: "+grade);
    }
// This method sets a grade for the student
// If the grade given is more than 20, the modulus of the number w.r.t. 20 is taken
    public void setGrade(double grade) {

        this.grade = grade % 20 ;
        this.lab.calAvg();
    }
// This method returns the grade of the student
    public double getGrade() {
        return grade;
    }

    public Lab getLab() {
        return lab;
    }
}

// ****
//Lab Class
class Lab {
    private final Student[] students;
    private final String teacherName;
    private final String dayOfWeek;
    private final int maxSize;
    private int currentSize;
    private double averageGrade;
 // The Lab Class takes the teacherNamem, dayOfWeek, and maxSize
// then initializes a list of students to create a new Lab
    public Lab(String teacherName, String dayOfWeek, int maxSize) {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        students = new Student[maxSize];
        currentSize = 0;
    }

// This method calculates the average of Lab-grades
    public void calAvg()
    {
        averageGrade = 0;
        for (int i = 0; i < currentSize ; i++) {
            averageGrade += students[i].getGrade();
        }
        averageGrade /= currentSize;
    }
 // This method enrolls a new student in the Lab if it is not full yet
 // It checks the avGrade and currentSize are up-to-date
    public void enrollStudent (Student student)
    {
        if (currentSize <= maxSize)
        {
            this.students[currentSize] = student;
            this.currentSize++;
            calAvg();
        }
    }
// This method prints the info of the Lab in an elegant way
    public void printLabInfo()
    {
        System.out.println(
                "teacherName: " + teacherName + "\n" +
                        "dayOfWeek: " + dayOfWeek + "\n" +
                        "maxSize: " + maxSize + "\n" +
                        "currentSize: " + currentSize + "\n" +
                        "averageGrade: " + averageGrade + "\n \n" +
                        "enrolled students: "
        );

        for (int i = 0; i < currentSize; i++) {
            students[i].printStudentInfo();
        }
    }
}