package Unit_7._7_3.traversingodds;

import java.util.ArrayList;

public class Odds {
    public static void main(String[] args)
    {
        ArrayList<Integer> odds = new ArrayList<Integer>();
        // Preload the array list with values.
        for(int index = 1; index < 21; index++)
        {
            odds.add(index);
            odds.add(index);
        }
        // Call removeEvens on the ArrayList above
        removeEvens(odds);
        // Print the ArrayList to verify the even numbers have been removed
        for (Integer odd: odds) {
            System.out.println(odd);
        }
    }

    public static void removeEvens(ArrayList<Integer> array)
    {
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) % 2 ==0) {
                array.remove(i);
                i--;
            }
        }
    }
}
