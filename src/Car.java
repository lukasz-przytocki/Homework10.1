public class Car extends Vehicle {
    private boolean airConditionOn;

    public boolean isAirConditionOn() {
        return airConditionOn;
    }

    public void setAirConditionOn(boolean airConditionOn) {
        this.airConditionOn = airConditionOn;
    }

    public Car(String name, double fuelCapacity, double fuelConsumption, boolean airConditionOn) {
        super(name, fuelCapacity, fuelConsumption);
        this.airConditionOn = airConditionOn;
    }

    double range() {
        if (airConditionOn == false) {
            return (getFuelCapacity() * 100) / getFuelConsumption();
        } else {
            return (getFuelCapacity() * 100) / (getFuelConsumption() + 0.8);
        }
    }
}
