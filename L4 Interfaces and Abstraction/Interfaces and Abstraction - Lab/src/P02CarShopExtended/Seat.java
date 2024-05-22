package P02CarShopExtended;

public class Seat extends CarImpl implements Sellable{

    private double price;
    public Seat(String model, String color, Integer horsePower, String produced, Double price) {
        super(model, color, horsePower, produced);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() + String.format("%s sells for %f", getModel(), price);

    }
}
