package Unit_6._6_1.ourfirstarray;

public class FirstArray {
    public static void main(String[] args) {
        String[] names = {"Las Vegas", "Minsk", "Sao Paulo"};
        int[] population = {667501, 2038822, 12330000};
        double[] sunshine = {8.11, 1.36, 6.05};
        //print out each city's data
        System.out.println(names[0] + "'s population is " + population[0] + '.');
        System.out.println(names[1] + "'s population is " + population[1] + '.');
        System.out.println(names[2] + "'s population is " + population[2] + '.');
        System.out.println();
        System.out.println("The least amount of sunshine " + names[0] + " gets is " + sunshine[0] + " hours a day.");
        System.out.println("The least amount of sunshine " + names[1] + " gets is " + sunshine[1] + " hours a day.");
        System.out.println("The least amount of sunshine " + names[2] + " gets is " + sunshine[2] + " hours a day.");
    }
}
