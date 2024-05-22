package P02AnimalFarm;

public class Chicken {

    private String name;
    private int age;


    public Chicken(String name, int age) {
        setAge(age);
        setName(name);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age > 15 || age < 0){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        double eggPerDay = 0.75;
        if (age < 6){
            eggPerDay = 2;
        }else if (age < 12){
            eggPerDay = 1;
        }
        return eggPerDay;
    }
    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",
                name, age, calculateProductPerDay());
    }
}
