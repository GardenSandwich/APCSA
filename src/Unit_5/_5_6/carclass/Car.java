package Unit_5._5_6.carclass;

public class Car {
    private double efficiency;
    private double gas;
    private double tankCapacity;
    private double totalMilesDriven;

    public Car(double efficiency, double tankCapacity) {
        this.efficiency = efficiency;
        this.tankCapacity = tankCapacity;
    }

    public void addGas() {
        this.gas = this.tankCapacity;
        System.out.println("Filling up ...");
    }

    public void addGas(double amount) {
        if (amount > tankCapacity) {
            System.out.println("Adding gas ...");
            this.gas = this.tankCapacity;
        } else {
            System.out.println("Adding gas ...");
            this.gas += amount;
        }
    }

    public double getTotalMilesDriven() {
        return this.totalMilesDriven;
    }

    public boolean canDrive(double distance) {
        if ((this.milesAvailable()) >= distance) {
            return true;
        } else {
            return false;
        }
    }

    public void drive(double distance) {
        if (this.canDrive(distance)) {
            this.totalMilesDriven += distance;
            this.gas -= distance / efficiency;
            System.out.println("Driving " + distance);
        } else {
            System.out.println("Can't drive " + distance + ". That's too far!");
        }
    }

    public double getGas() {
        return this.gas;
    }

    public double milesAvailable() {
        return this.gas * this.efficiency;
    }

}
