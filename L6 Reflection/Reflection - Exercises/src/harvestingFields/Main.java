package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Class<RichSoilLand> clazz = RichSoilLand.class;
        Field[] fields = clazz.getDeclaredFields();

        Consumer<Field> consumer = field -> System.out.printf("%s %s %s%n",
                Modifier.toString(field.getModifiers()), field.getType().getSimpleName(), field.getName());

        Predicate<Field> predicate = null;

        boolean isAllPrint = false;

        String input = scanner.nextLine();
        while (!input.equals("HARVEST")) {

            switch (input) {
                case "private":
                    predicate = field -> Modifier.isPrivate(field.getModifiers());
                    break;
                case "protected":
                    predicate = field -> Modifier.isProtected(field.getModifiers());
                    break;
                case "public":
                    predicate = field -> Modifier.isPublic(field.getModifiers());
                    break;
                case "all":
                    Arrays.stream(fields).forEach(consumer);
                    isAllPrint = true;
                    break;
                default:
                    throw new IllegalArgumentException("Incorrect input");
            }

            if (!isAllPrint) {
                Arrays.stream(fields).filter(predicate).forEach(consumer);
            }

            input = scanner.nextLine();
        }
    }
}
