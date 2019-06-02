public class Truck extends Car {
    private int loadWeight;

    public Truck(String name, double fuelCapacity, double fuelConsumption, boolean airConditionOn, int loadWeight) {
        super(name, fuelCapacity, fuelConsumption, airConditionOn);
        this.loadWeight = loadWeight;
    }
    public int getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(int loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    double range() {
        double extraConsumption = (loadWeight / 100);
        if (isAirConditionOn() == false) {
            return (getFuelCapacity() * 100) / (getFuelConsumption()+(extraConsumption/2));
        } else {
            return (getFuelCapacity() * 100) / ((getFuelConsumption() + 1.6+(extraConsumption/2)));
        }
    }
}