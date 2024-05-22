package P04TrafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<TrafficLight> trafficLights = new ArrayList<>();
        String[] colors = scanner.nextLine().split("\\s+");
        for (String color : colors) {
            TrafficLight trafficLight = new TrafficLight(Signals.valueOf(color));
           trafficLights.add(trafficLight);
        }


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {

            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.changeSignal();
                System.out.print(" ");
            }
            System.out.println();

        }





    }
}
