 public class Vehicle {
    private String name;
    private double fuelCapacity;
    private double fuelConsumption;

    public Vehicle(String name, double fuelCapacity, double fuelConsumption) {
        this.name = name;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

     public void setName(String name) {
         this.name = name;
     }

     public void setFuelCapacity(double fuelCapacity) {
         this.fuelCapacity = fuelCapacity;
     }

     public void setFuelConsumption(double fuelConsumption) {
         this.fuelConsumption = fuelConsumption;
     }
 }
