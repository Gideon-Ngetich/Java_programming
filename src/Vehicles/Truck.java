package Vehicles;

public class Truck extends Vehicle{
    private double cargo_capacity;
    public Truck(String make, String model, int year, String fuel_type, double fuel_efficiency, double cargo_capacity){
        super(make, model,year, fuel_type, fuel_efficiency);
        this.cargo_capacity = cargo_capacity;
    }

    public double getNUmSeats(){
        return cargo_capacity;
    }

    public double calculateFuelEfficiency(){
        return getFuelEfficiency() * (1.0 / (1.0 + (getNUmSeats() / 1000)));
    }

    public double calculateDistanceTraveled(){
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    public double getMaxSpeed(){
        return 80.0;
    }

}

