package Unit_7._7_2.teacherclasslistmethods;

import java.util.ArrayList;
public class Student
{
    private String name;
    private int grade;
    //Implement classList here:
    static ArrayList<Student> classList = new ArrayList<>();

    public Student(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
        classList.add(this);
    }

    public String getName()
    {
        return this.name;
    }

    /*Don't change the code in this method!
    This method will print out all the Student names in the classList Array
    */
    public static String printClassList()
    {
        String names = "";
        for(Student name: classList)
        {
            names+= name.getName() + "\n";
        }
        return "Student Class List:\n" + names;
    }

    public static String getLastStudent() {
        return classList.get(classList.size()-1).getName();
    }

    public static int getClassSize() {
        return classList.size();
    }

    public static void addStudent(int index, Student student) {
        classList.add(index, student);
        classList.remove(classList.size()-1);
    }

    public static String getStudent(int index) {
        return classList.get(index).getName();
    }
}

