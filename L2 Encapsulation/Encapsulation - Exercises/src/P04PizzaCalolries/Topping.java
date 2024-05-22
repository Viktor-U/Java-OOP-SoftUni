package P04PizzaCalolries;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (toppingType.equals("Meat") || toppingType.equals("Veggies") || toppingType.equals("Cheese") || toppingType.equals("Sauce")) {
            this.toppingType = toppingType;
        } else {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double a = 1.2;
        switch (toppingType){
            case "Veggies":
                a = 0.8;
                break;
            case "Cheese":
                a = 1.1;
                break;
            case "Sauce":
                a = 0.9;
                break;
        }
        return weight * 2 * a;
    }
}
