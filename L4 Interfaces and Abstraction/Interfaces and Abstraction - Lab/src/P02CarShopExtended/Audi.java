package P02CarShopExtended;

public class Audi extends CarImpl implements Rentable{

    private Integer minRentDay;
    private Double pricePerDay;
    public Audi(String model, String color, Integer horsePower, String produced, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsePower, produced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return pricePerDay;
    }
    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() + String.format("Minimum rental period of %d days. Price per day %f", minRentDay, pricePerDay);

    }
}
