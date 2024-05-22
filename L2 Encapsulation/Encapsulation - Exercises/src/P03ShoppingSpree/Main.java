package P03ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Person> personMap = new LinkedHashMap<>();
        Map<String, Product> productMap = new LinkedHashMap<>();

        String[] peopleArr = scanner.nextLine().split(";");
        String[] productArr = scanner.nextLine().split(";");

        for (String s : peopleArr) {
            String[] nameMoney = s.split("=");
            try {
            Person person = new Person(nameMoney[0], Double.parseDouble(nameMoney[1]));
            personMap.putIfAbsent(person.getName(), person);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                return;
            }
        }
        for (String s : productArr) {
            String[] nameCost = s.split("=");
            try {
            Product product = new Product(nameCost[0], Double.parseDouble(nameCost[1]));
            productMap.putIfAbsent(product.getName(), product);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("END")) {

            String[] arr = input.split("\\s+");
            String person = arr[0];
            String product = arr[1];

            personMap.get(person).buyProduct(productMap.get(product));

            input = scanner.nextLine();
        }
        for (Person value : personMap.values()) {
            System.out.println(value.toString());
        }



    }
}
