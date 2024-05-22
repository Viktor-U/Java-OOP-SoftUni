package P05BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> identifiables = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")){

            String [] arr = input.split("\\s+");


            Identifiable identifiable;

            if (arr.length == 2){
                identifiable = new Robot(arr[1], arr[0]);
            }else {
                identifiable = new Citizen(arr[0], Integer.parseInt(arr[1]), arr[2]);
            }
                identifiables.add(identifiable);


            input = scanner.nextLine();
        }

        String format = scanner.nextLine();

        identifiables.stream().filter(i -> i.getId().endsWith(format)).forEach(identifiable -> System.out.println(identifiable.getId()));

    }
}
