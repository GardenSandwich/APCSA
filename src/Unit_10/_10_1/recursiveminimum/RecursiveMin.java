package Unit_10._10_1.recursiveminimum;

import java.util.ArrayList;
import java.util.Scanner;

public class RecursiveMin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (true){
            System.out.println("Please enter numbers. Enter -1 to quit: ");
            int number = input.nextInt();

            if (number == -1){
                break;
            }
            else {
                numbers.add(number);
            }
        }

        int minimum = findMinimum(numbers);
        System.out.println("Minimum: " + minimum);
    }

    public static int findMinimum(ArrayList<Integer> numbers)
    {

        // Base Case: What is the smallest ArrayList you can have?
        // What is the minimum value of that array?
        if (numbers.size() == 1){
            return numbers.get(0);
        }
        else {
            ArrayList<Integer> newList = new ArrayList<>(numbers);
            newList.remove(numbers.size()-1);

            int minOfRemainingList = findMinimum(newList);
            if (numbers.get(numbers.size()-1) < minOfRemainingList){
                return numbers.get(numbers.size()-1);
            }
            else {
                return minOfRemainingList;
            }
        }
    }
}

