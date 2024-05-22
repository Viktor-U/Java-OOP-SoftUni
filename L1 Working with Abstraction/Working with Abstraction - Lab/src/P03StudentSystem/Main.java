package P03StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();

        String input = scanner.nextLine();
        while (!input.equals("Exit")) {

            String[] student = input.split(" ");
            studentSystem.ParseCommand(student);

            input = scanner.nextLine();
        }
    }
}
