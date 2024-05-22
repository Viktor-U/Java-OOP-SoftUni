package P01Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicles{

    private final static double AC_CONSUMPTION = 1.6;
    private final static double PROBLEM_PERCENTAGES_FUEL = 0.95;
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }


    @Override
    public void refueling(double fuelAmount) {
        setFuelQuantity(getFuelQuantity() + fuelAmount * PROBLEM_PERCENTAGES_FUEL);
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
