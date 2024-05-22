package P04HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] arr = read();
        double pricePerDay = Double.parseDouble(arr[0]);
        int numberOfDays = Integer.parseInt(arr[1]);
        Season season = Season.valueOf(arr[2].toUpperCase());
        DiscountType discountType = DiscountType.valueOf(getDiscountType(arr[3]));

        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay, numberOfDays, season, discountType);

        print(priceCalculator.calculatePrice());

    }

    private static void print(double calculatePrice) {
        System.out.printf("%.2f", calculatePrice);
    }

    private static String getDiscountType(String type) {
        if (type.equals("VIP")){
            return "VIP";
        }else if (type.equals("None")){
            return "NONE";
        }else if (type.equals("SecondVisit")) {
            return "SECOND_VISIT";
        }
        throw new IllegalArgumentException("Unknown discount " + type);
    }

    public static String[] read (){
        Scanner scanner = new Scanner(System.in);


        return scanner.nextLine().split("\\s+");
    }
}
