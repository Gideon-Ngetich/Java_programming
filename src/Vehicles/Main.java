package Vehicles;

public class Main {
    public static void main(String[] args){
        Car car = new Car("Audi", "Q3", 2020, "Petrol", 1.2, 5);
        System.out.println(car);
        System.out.println("Car's fuel efficiency " + car.getFuelEfficiency());
        System.out.println(car.calculateFuelEfficiency());
        System.out.println(car.calculateDistanceTraveled());

        Truck truck = new Truck("Scania", "LNV", 2018, "Diesel", 2.7, 10);
        System.out.println(truck);
        System.out.println(truck.getFuelEfficiency());
        System.out.println(truck.calculateFuelEfficiency());
        System.out.println(truck.calculateDistanceTraveled());
    }
}
