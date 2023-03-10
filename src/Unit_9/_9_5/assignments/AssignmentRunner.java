package Unit_9._9_5.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class AssignmentRunner {
    static ArrayList<Assignment> assignments = new ArrayList<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the assignment's name (exit to quit): ");
            String name = input.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter the due date: ");
            String dueDate = input.nextLine();
            System.out.print("How many points is the assignment worth? ");
            double availablePoints = input.nextDouble();
            System.out.print("How many points were earned? ");
            double earnedPoints = input.nextDouble();
            input.nextLine();
            System.out.print("Is this a (T)est or a (P)roject? ");
            String type = input.nextLine();


            if (type.equalsIgnoreCase("T")) {
                System.out.print("What type of test is it? ");
                String testType = input.next();
                assignments.add(new Test(name, dueDate, availablePoints, earnedPoints, testType));
            } else if (type.equalsIgnoreCase("P")) {
                System.out.print("Does this project require (true/false) ... \n" +
                        "Groups?");
                boolean groups = input.nextBoolean();
                System.out.print("A presentation?");
                boolean presentation = input.nextBoolean();
                assignments.add(new Project(name, dueDate, availablePoints, earnedPoints, groups, presentation));
            }
            input.nextLine();
            System.out.println();
        }

        printSummary(assignments);
    }

    static void printSummary(ArrayList<Assignment> assignments) {
        for (Assignment assignment : assignments) {
            System.out.println(assignment.getName() + " - " + (assignment.getEarnedPoints() / assignment.getAvailablePoints() * 100));
        }
    }
}
