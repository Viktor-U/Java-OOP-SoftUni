package P01CardSuit;

public enum Suits {
    CLUBS(0),
    DIAMONDS(1),
    HEARTS(2),
    SPADES(3);

    private final int power;

    Suits(int ordinal) {
        this.power = ordinal;
    }

    public int getPower() {
        return power;
    }
}
