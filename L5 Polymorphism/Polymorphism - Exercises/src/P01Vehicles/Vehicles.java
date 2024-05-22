package P01Vehicles;

public abstract class Vehicles {
    private double fuelQuantity;
    private double fuelConsumption;
    public Vehicles(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }


    protected double getFuelQuantity() {
        return fuelQuantity;
    }

    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    protected double getFuelConsumption() {
        return fuelConsumption;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    protected abstract void refueling(double fuelAmount);
    protected abstract void drive(Double distance);

    @Override
    public String toString() {
        return String.format("%s: %.2f", getClass().getSimpleName(), getFuelQuantity());
    }
}
