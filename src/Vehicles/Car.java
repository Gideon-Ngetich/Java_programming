package Vehicles;

public class Car extends Vehicle{
    private int num_seats;
    public Car(String make, String model, int year, String fuel_type, double fuel_efficiency, int num_seats){
        super(make, model,year, fuel_type, fuel_efficiency);
        this.num_seats = num_seats;
    }

   public double getNUmSeats(){
        return num_seats;
   }

   public double calculateFuelEfficiency(){
        return getFuelEfficiency() * (1.0 / (1.0 + (getNUmSeats() / 1000)));
   }

   public double calculateDistanceTraveled(){
        return calculateFuelEfficiency() * getFuelEfficiency();
   }

   public double getMaxSpeed(){
        return 180.0;
   }

}
