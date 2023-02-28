package Unit_9._9_2.students;

public class Student {
    private String name;
    private int id;
    private double gpa;

    // Constructor goes here
    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }

    public double getGPA(){
        return gpa;
    }

    public String toString(){
        return name + " (" + id + ")";
    }}
