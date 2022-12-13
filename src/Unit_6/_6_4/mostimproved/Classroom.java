package Unit_6._6_4.mostimproved;

public class Classroom {
    Student[] students;
    int numStudentsAdded;

    public Classroom(int numStudents)
    {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }

    // Implement this method!
    // Returns the Student with the highest examImprovement score
    public Student getMostImprovedStudent()
    {
        int temp = Integer.MIN_VALUE;
        Student mostImproved = null;
        for (Student student : students) {
            if(student == null) return mostImproved;
            if (student.getExamImprovement() > temp) {
                mostImproved = student;
                temp = mostImproved.getExamImprovement();
            }
        }
        return mostImproved;
    }

    public void addStudent(Student s)
    {
        students[numStudentsAdded] = s;
        numStudentsAdded++;
    }

    public void printStudents()
    {
        for(int i = 0; i < numStudentsAdded; i++)
        {
            System.out.println(students[i]);
        }
    }
}
