package P01CarShop;

public class Seat implements Car {
    private String model;
    private String color;
    private Integer horsePower;
    private String produced;

    public Seat(String model, String color, Integer horsePower, String produced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.produced = produced;
    }


    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    @Override
    public String getProduced() {
        return produced;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires", model, produced, TIRES);
    }
}
