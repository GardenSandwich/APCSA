package Unit_9._9_1.personstudentobject;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person("Wolfgang Amadeus Mozart", "January 27, 1756");
        Student student = new Student("Johann Nepomuk Hummel", "November 14, 1778", 10, 4.0);

        System.out.println("Person : " + person.getName() + ", " + person.getBirthday());
        System.out.println("Student: " + student.getName() + ", " + student.getBirthday() + ", " + student.getGrade() + ", " + student.getGpa());
    }
}

