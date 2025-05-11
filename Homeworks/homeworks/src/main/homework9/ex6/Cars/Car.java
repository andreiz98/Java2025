package homework9.ex6.Cars;

public class Car {
    protected String make,model;
    protected int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println(make + " " + model + " is starting.");
    }

    public void stop() {
        System.out.println(make + " " + model + " has stopped.");
    }

    public void accelerate(int speed) {
        System.out.println(make + " " + model + " is accelerating to " + speed + " km/h.");
    }
}

class ElectricCar extends Car {
    protected int batterCapacity,range;

    public ElectricCar(String make, String model, int year, int batteryCapacity, int range) {
        super(make, model, year);
        this.batterCapacity = batteryCapacity;
        this.range = range;
    }

    public void charge() {
        System.out.println(make + " " + model + " is charging. Battery: " + batterCapacity + " kWh, Range: " + range + " km.");
    }
}

class Tesla extends ElectricCar{
    private double autopilotVersion;

    public Tesla(String model, int year, int batterCapacity, int range, double autopilotVersion) {
        super("Tesla", model, year, batterCapacity, range);
        this.autopilotVersion = autopilotVersion;
    }

    public void enableAutopilot() {
        System.out.println(make + " " + model + " Autopilot v" + autopilotVersion + " activated.");
    }

    public void displayInfo() {
        System.out.println("Tesla " + model + " (" + year + ") - Battery: " + batterCapacity +
                " kWh, Range: " + range + " km, Autopilot: v" + autopilotVersion);
    }
}

class CarTest {
    public static void main(String[] args) {

        Tesla myTesla = new Tesla("Model S", 2025, 100, 600, 11.0);

        myTesla.displayInfo();

        myTesla.start();
        myTesla.accelerate(120);
        myTesla.charge();

        myTesla.enableAutopilot();
        myTesla.stop();
    }
}