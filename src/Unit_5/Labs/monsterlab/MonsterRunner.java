package Unit_5.Labs.monsterlab;

import java.util.Scanner;

public class MonsterRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st monster's name : ");
        String name = input.next();
        System.out.print("Enter 1st monster's size : ");
        int size= input.nextInt();

        Monster mOne = new Monster(size, name);

        System.out.print("Enter 2nd monster's name : ");
        name = input.next();
        System.out.print("Enter 2nd monster's size : ");
        size= input.nextInt();

        Monster mTwo = new Monster(size, name);

        if(mOne.isBigger(mTwo)==true)
        {
            System.out.println("Monster one is bigger than Monster two.");
        }
        else {
            System.out.println("Monster one is smaller than Monster two.");
        }

        if(mOne.isSameName(mTwo)==true)
        {
            System.out.println("Monster one has the same name as Monster two.");
        }

    }
}
