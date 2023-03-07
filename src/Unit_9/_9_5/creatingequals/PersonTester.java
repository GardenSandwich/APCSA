package Unit_9._9_5.creatingequals;
import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the Person's name: ");
        String name = input.nextLine();
        System.out.print("Please enter the Person's birthday: ");
        String birthday = input.nextLine();
        System.out.print("Please enter the Student's name: ");
        String name2 = input.nextLine();
        System.out.print("Please enter the Student's birthday: ");
        String birthday2 = input.nextLine();
        System.out.print("Please enter the Student's grade: ");
        int grade = input.nextInt();

        System.out.println(new Person(name, birthday).equals(new Person(name2, birthday2)));

    }
}
