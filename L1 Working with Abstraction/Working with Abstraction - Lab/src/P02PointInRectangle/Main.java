package P02PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Point bottomLeft = new Point(arr[0], arr[1]);
        Point topRight = new Point(arr[2], arr[3]);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int[] pointCoordinates = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int x = pointCoordinates[0];
            int y = pointCoordinates[1];
            Point point = new Point(x,  y);

            System.out.println(rectangle.contains(point));
        }





    }
}
