package P03CardsWithPower;

public class Card {
    private int power;

    public void setPower(Ranks rank, Suits suit) {
        power = rank.getPower() + suit.getPower();
    }

    public int getPower() {
        return power;
    }
}
