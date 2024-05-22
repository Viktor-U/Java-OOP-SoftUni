package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("Beast!")){
            String[] stats = scanner.nextLine().split("\\s+");
            switch (input){
                case "Tomcat":
                    Tomcat tomcat = new Tomcat(stats[0], Integer.parseInt(stats[1]));
                    animals.add(tomcat);
                    break;
                case "Kitten":
                    Kitten kittens = new Kitten(stats[0], Integer.parseInt(stats[1]));
                    animals.add(kittens);
                    break;
                case "Cat":
                    Cat cat = new Cat(stats[0], Integer.parseInt(stats[1]), stats[2]);
                    animals.add(cat);
                    break;
                case "Dog":
                    Dog dog = new Dog(stats[0], Integer.parseInt(stats[1]), stats[2]);
                    animals.add(dog);
                    break;
                case "Frog":
                    Frog frog = new Frog(stats[0], Integer.parseInt(stats[1]), stats[2]);
                    animals.add(frog);
                    break;
            }



            input = scanner.nextLine();
        }

        for (Animal animal : animals) {
            System.out.println(animal);
        }



    }
}
