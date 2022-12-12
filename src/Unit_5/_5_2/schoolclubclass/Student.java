package Unit_5._5_2.schoolclubclass;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String school;

    /**
     * Constructors go here.
     * Copy over your constructors from the previous exercise.
     * Check out StudentTester.java for an example of how to use
     * this constructor. Make sure your code matches the call in the
     * tester.
     */

    public Student(String firstName, String lastName, int gradeLevel, String school) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.school = school;
    }

    public Student(String firstName, String lastName, int school) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = school;
        if (this.gradeLevel < 6) {
            this.school = "elementary school";
        } else if (this.gradeLevel < 9) {
            this.school = "middle school";
        } else {
            this.school = "high school";
        }
    }

    public String getFirstName(){
        return firstName;
    }

    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     * <p>
     * Modify the to string to add 'and goes to _____' at the end
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + gradeLevel + " and goes to " + school;
    }
}
