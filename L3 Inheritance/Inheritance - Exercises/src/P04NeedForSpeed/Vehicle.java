package P04NeedForSpeed;

public class Vehicle {
    private static final double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle( double fuel, int horsePower) {
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
        this.fuel = fuel;
        this.horsePower = horsePower;
    }


    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public void drive(double kilometers){
        double remainingFuel = fuel - kilometers * fuelConsumption;
        if (remainingFuel >= 0){
           setFuel(remainingFuel);
        }
    }
}
