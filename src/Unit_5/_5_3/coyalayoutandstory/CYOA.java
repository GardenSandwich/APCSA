package Unit_5._5_3.coyalayoutandstory;
import java.util.Scanner;

public class CYOA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //first choice: McDonald's or burger king?
        System.out.println("You are hungry. Do you want to go to [M]cDonald's or [B]urger King?");
        char destination = input.nextLine().charAt(0);
        //if McDonald's, then second choice: fries or nuggets?
        if (destination == 'M'){
            System.out.println("You go to McDonald's. Do you want [F]ries or [N]uggets?");
            char food = input.nextLine().charAt(0);
            //if fries, you get a free toy.
            if (food == 'F'){
                System.out.println("You get fries. You also get a free toy!");
            }
            //if nuggets, you get a terrible pain in your stomach.
            else if (food == 'N'){
                System.out.println("You get nuggets. You also get a terrible pain in your stomach.");
            }
        }
        else {
            //if burger king, then second choice: whopper or chicken sandwich
            System.out.println("You go to Burger King. Do you want a [W]hopper or a [C]hicken Sandwich?");
            char food = input.nextLine().charAt(0);

            //if whopper, you get a free yeast infection.
            if (food == 'W'){
                System.out.println("You get a whopper. You also get a free yeast infection and die in the hospital.");
            }
            //if chicken sandwich, you get free salmonella poisoning.
            else if (food == 'C'){
                System.out.println("You get a chicken sandwich. You also get free salmonella poisoning, and die in the hospital.");
            }

        }

    }
}
