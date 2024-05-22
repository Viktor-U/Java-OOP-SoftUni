package P02VehiclesExtension;

import java.text.DecimalFormat;

public class Truck extends Vehicles {

    private final static double AC_CONSUMPTION = 1.6;
    private final static double PROBLEM_PERCENTAGES_FUEL = 0.95;
    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }
    @Override
    protected void refueling(double fuelAmount){
        if (fuelAmount <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (getFuelQuantity() + fuelAmount > getTankCapacity()){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        setFuelQuantity(getFuelQuantity() + fuelAmount * 0.95);
    }

    @Override
    public void drive(Double distance) {
        double neededFuel = (getFuelConsumption() + AC_CONSUMPTION) * distance;
        DecimalFormat df = new DecimalFormat("##.##");

        if (neededFuel <= getFuelQuantity()){
            System.out.printf("Truck travelled %s km\n", df.format(distance));
            setFuelQuantity(getFuelQuantity() - neededFuel);
        }else {
            System.out.println("Truck needs refueling");
        }
    }

}
