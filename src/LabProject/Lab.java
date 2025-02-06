package LabProject;

class Lab {
    private final Student[] students;
    private final String teacherName;
    private final String dayOfWeek;
    private final int maxSize;
    private int currentSize;
    private double averageGrade;

    public Lab(String teacherName, String dayOfWeek, int maxSize) {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        students = new Student[maxSize];
        currentSize = 0;
    }
    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
    public void calAvg()
    {
        averageGrade = 0;
        for (int i = 0; i < currentSize ; i++) {
            averageGrade += students[i].getGrade();
        }
        averageGrade /= currentSize;
        setAverageGrade(averageGrade);
    }
    public void enrollStudent (Student student)
    {
        if (currentSize <= maxSize)
        {
            students[currentSize ] = student;
            currentSize++;
            calAvg();
        }

    }
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