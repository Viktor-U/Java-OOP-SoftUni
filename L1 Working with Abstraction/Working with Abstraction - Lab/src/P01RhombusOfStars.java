import java.util.Scanner;

public class P01RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        
        printRhombus(n);
        
    }

    private static void printRhombus(int n) {
        for (int i = 1; i < n; i++) {
            printRhombusLine(i, n);
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            printRhombusLine(i, n);
            System.out.println();
        }


    }
    private static void printRhombusLine(int a, int n){

        for (int i = 1; i <=  n - a; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < a; i++) {
            System.out.print("* ");
        }


    }


}