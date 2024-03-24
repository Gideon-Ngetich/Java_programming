package Vehicles;

public abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuel_type;
    private double fuelEfficiency;

    public Vehicle(String make, String model, int year, String fuel_type, double fuelEfficiency){
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuel_type = fuel_type;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public String getFuel_type(){
        return fuel_type;
    }

    public double getFuelEfficiency(){
        return fuelEfficiency;
    }

    public abstract double calculateFuelEfficiency();
    public abstract double calculateDistanceTraveled();
    public abstract double getMaxSpeed();


}
