package Unit_9._9_3.studenttestscores;
import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for name, test scores, and service hours
        System.out.println("Enter the student's name: ");
        String name = input.nextLine();
        System.out.println("Enter the student's math score: ");
        int mathScore = input.nextInt();
        System.out.println("Enter the student's ela score: ");
        int elaScore = input.nextInt();
        System.out.println("Enter the student's service hours: ");
        int serviceHours = input.nextInt();
        // Create a HSStudent object
        HSStudent student = new HSStudent(name, mathScore, elaScore, serviceHours);

        // Print the results
        System.out.println("Pass Math? " + student.passMath());
        System.out.println("Pass ELA? " + student.passEla());
        System.out.println("Completed Service Hours? " + student.completeService());
        System.out.println(student);
    }
}
