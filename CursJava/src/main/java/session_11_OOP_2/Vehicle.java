package session_11_OOP_2;

import java.util.Objects;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String display() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

class Car extends Vehicle {
    private int nrDors;

    public Car(String brand, String model, int year, int nr_dors) {
        super(brand, model, year);
        this.nrDors = nr_dors;
    }

    public int getNrDors() {
        return nrDors;
    }

    public void setNrDors(int nrDors) {
        this.nrDors = nrDors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nrDors=" + nrDors +
                '}';
    }
}

class ElectricCar extends Car{
    private int improvedBatery;

    public ElectricCar(String brand, String model, int year, int nr_dors, int improvedBatery) {
        super(brand, model, year, nr_dors);
        this.improvedBatery = improvedBatery;
    }

    public int getImprovedBatery() {
        return improvedBatery;
    }

    public void setImprovedBatery(int improvedBatery) {
        this.improvedBatery = improvedBatery;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "improvedBatery=" + improvedBatery +
                '}';
    }
}

class Truck extends Vehicle{
    private int improvedCapacitate;

    public Truck(String brand, String model, int year, int improvedCapacitate) {
        super(brand, model, year);
        this.improvedCapacitate = improvedCapacitate;
    }

    public int getImprovedCapacitate() {
        return improvedCapacitate;
    }

    public void setImprovedCapacitate(int improvedCapacitate) {
        this.improvedCapacitate = improvedCapacitate;
    }
}

class MainVehicle {
    public static void main(String[] args){
        ElectricCar ec = new ElectricCar("Tesla", "3", 2021, 4, 40000);
        System.out.println(ec.getImprovedBatery());
        System.out.println(ec.display());
        System.out.println(ec.getBrand());
        System.out.println(ec.getModel());
        System.out.println(ec.getYear());
        System.out.println(ec.getNrDors());
    }
}