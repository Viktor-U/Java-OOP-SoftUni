package P01Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputCar = scanner.nextLine().split("\\s+");
        double carFuelQuantity  = Double.parseDouble(inputCar[1]);
        double carFuelConsumption  = Double.parseDouble(inputCar[2]);
        Vehicles car = new Car(carFuelQuantity, carFuelConsumption);

        String[] inputTruck = scanner.nextLine().split("\\s+");
        double truckFuelQuantity  = Double.parseDouble(inputTruck[1]);
        double truckFuelConsumption  = Double.parseDouble(inputTruck[2]);
        Vehicles truck = new Truck(truckFuelQuantity, truckFuelConsumption);

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
                    }else {
                        truck.drive(argument);
                    }
                    break;
                case "Refuel":
                    if (vehicle.equals("Car")){
                        car.refueling(argument);
                    }else {
                        truck.refueling(argument);
                    }
                    break;
            }
        }

        System.out.println(car);
        System.out.println(truck);

    }
}