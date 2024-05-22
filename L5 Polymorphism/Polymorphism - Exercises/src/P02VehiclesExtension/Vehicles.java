package P02VehiclesExtension;

public abstract class Vehicles {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;
    public Vehicles(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    protected double getTankCapacity() {
        return tankCapacity;
    }

    protected void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
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

    protected void refueling(double fuelAmount){
        if (fuelAmount <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (fuelQuantity + fuelAmount > tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        setFuelQuantity(fuelQuantity + fuelAmount);
    }
    protected abstract void drive(Double distance);

    @Override
    public String toString() {
        return String.format("%s: %.2f", getClass().getSimpleName(), getFuelQuantity());
    }
}
