package Unit_9._9_1.personstudentobject;

public class Student extends Person {

    private int grade;
    private double gpa;

    public Student(String name, String birthday, int grade, double gpa){
        super(name, birthday);
        this.grade = grade;
        this.gpa = gpa;
    }

    public int getGrade(){
        return grade;
    }

    public double getGpa(){
        return gpa;
    }
}

