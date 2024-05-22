package P04PizzaCalolries;

import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int toppings) {
        setName(name);
        setToppings(toppings);
    }

    private void setName(String name) {
        if (name.trim().isEmpty() || name.length() > 15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppings(int toppings) {
        if (toppings > 10 || toppings < 0){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    public String getName() {
        return name;
    }
    public void addTopping(Topping topping){
        toppings.add(topping);
    }

    public double getOverallCalories(){
        double calories = 0;

        calories += dough.calculateCalories();

        for (Topping topping : toppings) {
            calories += topping.calculateCalories();
        }

        return calories;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f", name, getOverallCalories());
    }
}
