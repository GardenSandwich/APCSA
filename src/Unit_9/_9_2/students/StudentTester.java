package Unit_9._9_2.students;

public class StudentTester {

    public static void main(String[] args) {
        Student student = new Student("John Doe", 123987, 2.56);
        StudentAthlete studentAthlete = new StudentAthlete("John Doe", 987456, 3.47, "lacrosse", "varsity");

        System.out.println(student);
        System.out.println(studentAthlete);
    }
    /**
     * Create a student with id # 123987, GPA: 2.56
     */


    /**
     * Create a student athlete with id # 987456, GPA: 3.47,
     * who plays lacrosse for the varsity team
     */


    // Print out both objects
}
