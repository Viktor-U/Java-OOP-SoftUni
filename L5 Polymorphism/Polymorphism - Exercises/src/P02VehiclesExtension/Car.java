package P02VehiclesExtension;

import java.text.DecimalFormat;

public class Car extends Vehicles {

    private final static double AC_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }



    @Override
    public void drive(Double distance) {
        double neededFuel = (getFuelConsumption() + AC_CONSUMPTION) * distance;
        DecimalFormat df = new DecimalFormat("##.##");

        if (neededFuel <= getFuelQuantity()){
            System.out.printf("Car travelled %s km\n", df.format(distance));
            setFuelQuantity(getFuelQuantity() - neededFuel);
        }else {
            System.out.println("Car needs refueling");
        }
    }


}
