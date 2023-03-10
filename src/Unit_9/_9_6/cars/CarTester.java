package Unit_9._9_6.cars;

import java.util.ArrayList;
import java.util.Scanner;

public class CarTester {


    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your cars' information: ");

        while (true) {

            System.out.println("Model (exit to quit): ");
            String model = input.nextLine();
            if (model.equals("exit")) {
                break;
            }

            System.out.print("Electric car (y/n): ");
            String type = input.nextLine();

            if (type.equals("y")) {
                System.out.print("Percent of battery left (as a whole number): ");
                int batteryLevel = input.nextInt();
                cars.add(new ElectricCar(model, batteryLevel));
            } else {
                System.out.print("Gallons of fuel left: ");
                int fuelLevel = input.nextInt();
                cars.add(new Car(model, fuelLevel));
            }
            input.nextLine();
        }

        for (Car car : cars) {
            System.out.println(car + "\nFuel Amount: " + car.getFuelLevel() + "\n");
        }
    }
}
