package Unit_6.Labs.gradingquizzes;
import java.util.Scanner;
public class GradingQuizzes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            //get quiz length
            System.out.println("How many questions on the exam?");
            double quizLength = input.nextInt();
            //consume the \n and properly scan for the next line
            input.nextLine();

            //get quiz key
            System.out.println("Enter the correct answers as integers, seperated by spaces");
            String rawKey = input.nextLine();
            String[] key = rawKey.split(" +");

            //begin marking answers
            double numCorrect = 0;
            for (int i = 0; i < quizLength; i++) {
                System.out.println("Enter question " + (i+1) + ": ");
                if(input.nextLine().equals(key[i])) numCorrect++;
            }

            //output score and number correct

            System.out.println(numCorrect + " out of " + quizLength + " for a score of " + (numCorrect/quizLength)*100 + "%");
            System.out.println("Grade another quiz? (Y/N)");
            if(input.nextLine().equals("N")) break;

        }
    }
}
