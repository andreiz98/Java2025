package homework9.ex6.Bicycles;

public class Bicycle {
    protected int speed;
    protected int gear;

    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void changeGear() {
        int gear = 0;
        switch (getSpeed() / 10) {
            case 5 -> gear = 5;
            case 6 -> gear = 6;
            case 4 -> gear = 4;
            case 3 -> gear = 3;
            case 2 -> gear = 2;
            default -> gear = 1;
        }

        setGear(gear);
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Speed increased to: " + speed + " km/h");
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0;
        System.out.println("Speed reduced to: " + speed + " km/h");
    }
}

class MountainBike extends Bicycle {
    private String tireType;
    private String suspension;

    public MountainBike(int speed, int gear, String tireType, String suspension) {
        super(speed, gear); // Call parent constructor
        this.tireType = tireType;
        this.suspension = suspension;
    }

    public void adjustSuspension(String newSuspension) {
        this.suspension = newSuspension;
        System.out.println("Suspension adjusted to: " + suspension);
    }

    public void displayInfo() {
        System.out.println("MountainBike [Speed: " + speed + " km/h, Gear: " + gear +
                ", Tire Type: " + tireType + ", Suspension: " + suspension + "]");
    }
}

class BicycleTest {
    public static void main(String[] args) {
        MountainBike myBike = new MountainBike(20, 3, "Off-road", "Medium");

        myBike.displayInfo();

        myBike.changeGear();
        myBike.speedUp(10);

        myBike.applyBrake(5);

        myBike.adjustSuspension("Hard");

        myBike.displayInfo();
    }
}
