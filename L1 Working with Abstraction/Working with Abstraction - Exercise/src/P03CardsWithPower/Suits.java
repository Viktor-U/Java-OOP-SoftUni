package P03CardsWithPower;

public enum Suits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private final int power;

    Suits(int ordinal) {
        this.power = ordinal;
    }

    public int getPower() {
        return power;
    }
}
