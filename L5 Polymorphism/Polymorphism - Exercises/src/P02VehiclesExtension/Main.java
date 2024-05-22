package P02VehiclesExtension;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputCar = scanner.nextLine().split("\\s+");
        double carFuelQuantity  = Double.parseDouble(inputCar[1]);
        double carFuelConsumption  = Double.parseDouble(inputCar[2]);
        double carTankCapacity = Double.parseDouble(inputCar[3]);
        Vehicles car = new Car(carFuelQuantity, carFuelConsumption, carTankCapacity);

        String[] inputTruck = scanner.nextLine().split("\\s+");
        double truckFuelQuantity  = Double.parseDouble(inputTruck[1]);
        double truckFuelConsumption  = Double.parseDouble(inputTruck[2]);
        double truckTankCapacity = Double.parseDouble(inputTruck[3]);
        Vehicles truck = new Truck(truckFuelQuantity, truckFuelConsumption, truckTankCapacity);

        String[] inputBus = scanner.nextLine().split("\\s+");
        double busFuelQuantity  = Double.parseDouble(inputBus[1]);
        double busFuelConsumption  = Double.parseDouble(inputBus[2]);
        double busTankCapacity = Double.parseDouble(inputBus[3]);
        Bus bus = new Bus(busFuelQuantity, busFuelConsumption, busTankCapacity);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input  = scanner.nextLine().split("\\s+");
            String command = input[0];
            String vehicle = input[1];
            double argument = Double.parseDouble(input[2]);

            switch (command){
                case "Drive":
                    if (vehicle.equals("Car")){
                        car.drive(argument);
                    }else if(vehicle.equals("Truck")){
                        truck.drive(argument);
                    }else {
                        bus.drive(argument);
                    }
                    break;
                case "Refuel":

                    try {

                        if (vehicle.equals("Car")) {
                            car.refueling(argument);
                        } else if (vehicle.equals("Truck")) {
                            truck.refueling(argument);
                        } else {
                            bus.refueling(argument);
                        }

                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }

                    break;
                case "DriveEmpty":

                    bus.driveEmpty(argument);

                    break;
            }
        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }
}