package Unit_9._9_4.electriccars;

public class CarTester {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car("Bruh", 15);
        // Print out the model
        System.out.println(car);
        // Print out the fuelLevel
        System.out.println(car.getFuelLevel());
        // Print how many miles are left with 23 mpg
        System.out.println(car.milesLeft(23));
        // Print the object
        System.out.println(car);
        // Create an ElectricCar object
        ElectricCar eCar = new ElectricCar("Bruh", 15);
        // Print out the model
        System.out.println(eCar);
        // Print out the fuelLevel
        System.out.println(eCar.getFuelLevel());
        // Print how many miles are left with 400 miles per charge
        System.out.println(eCar.milesLeft(400));
        // Print the object
        System.out.println(eCar);
    }
}
