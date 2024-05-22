package P02VehiclesExtension;

import java.text.DecimalFormat;

public class Bus extends Vehicles {

    private final static double AC_CONSUMPTION = 1.4;
    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption,tankCapacity);
    }

    @Override
    public void drive(Double distance) {
        double neededFuel = (getFuelConsumption() + AC_CONSUMPTION) * distance;
        DecimalFormat df = new DecimalFormat("##.##");

        if (neededFuel <= getFuelQuantity()){
            System.out.printf("Bus travelled %s km\n", df.format(distance));
            setFuelQuantity(getFuelQuantity() - neededFuel);
        }else {
            System.out.println("Bus needs refueling");
        }
    }
    public void driveEmpty (Double distance) {

        double neededFuel = getFuelConsumption() * distance;
        DecimalFormat df = new DecimalFormat("##.##");

        if (neededFuel <= getFuelQuantity()){
            System.out.printf("Bus travelled %s km\n", df.format(distance));
            setFuelQuantity(getFuelQuantity() - neededFuel);
        }else {
            System.out.println("Bus needs refueling");
        }
    }


}
