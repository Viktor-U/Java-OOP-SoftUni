package P03CardsWithPower;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ranks rank = Ranks.valueOf(scanner.nextLine());
        Suits suit = Suits.valueOf(scanner.nextLine());

        Card card = new Card();
        card.setPower(rank, suit);

        System.out.printf("Card name: %s of %s; Card power: %d",rank, suit, card.getPower());

    }
}
